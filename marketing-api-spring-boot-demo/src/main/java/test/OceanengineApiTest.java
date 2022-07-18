package test;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.Map;

public class OceanengineApiTest {


  public static String getApiInfo(String url,String access_token,Map data) {

    // 构造请求
    HttpEntityEnclosingRequestBase httpEntity = new HttpEntityEnclosingRequestBase() {
      @Override
      public String getMethod() {
        return "GET";
      }
    };

    httpEntity.setHeader("Access-Token",access_token);

    CloseableHttpResponse response = null;
    CloseableHttpClient client = null;

    try {
      client = HttpClientBuilder.create().build();
      httpEntity.setURI(URI.create(url));
      httpEntity.setEntity(new StringEntity(JSONObject.valueToString(data), ContentType.APPLICATION_JSON));

      response = client.execute(httpEntity);
      if (response != null && response.getStatusLine().getStatusCode() == 200) {
        BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        StringBuffer result = new StringBuffer();
        String line = "";
        while((line = bufferedReader.readLine()) != null) {
          result.append(line);
        }
        bufferedReader.close();
        return result.toString();
      }

    } catch (ClientProtocolException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (response != null) {
          response.close();
        }
        client.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;

  }


}
