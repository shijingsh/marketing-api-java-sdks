package test.test.oceanengine;

import java.util.HashMap;
import java.util.Map;

/**
 * 获取代理商信息
 */
public class AdvertiserAgentTest {

  public static void main(String args[]){
    String info = getAdvertiserInfo();
    System.out.println("============================================");
    System.out.println(info);
  }

  public static String getAdvertiserInfo() {

    String access_token = "507b9a7866e373ccd3c43cb286ede27f55d9ae17";
    final Long advertiser_id = 1714035227673614L;

    // 请求地址
    String open_api_url_prefix = "https://ad.oceanengine.com/open_api/2/";
    String uri = "agent/info/";

    // 请求参数
    Map data = new HashMap(){
      {
        put("advertiser_ids", new Long[] {advertiser_id});
      }
    };

    return OceanengineApiTest.getApiInfo(open_api_url_prefix + uri,access_token,data);

  }


}
