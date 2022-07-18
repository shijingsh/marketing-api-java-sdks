package test;

import test.OceanengineApiTest;

import java.util.HashMap;
import java.util.Map;

/**
 * 此接口用于获取已经授权的账号列表，账号包含了广告主、纵横组织、代理商等角色；
 */
public class AdvertiserOauth2Test {

  public static void main(String args[]){
    String info = getAdvertiserInfo();
    System.out.println("============================================");
    System.out.println(info);
  }

  public static String getAdvertiserInfo() {
    String access_token = "507b9a7866e373ccd3c43cb286ede27f55d9ae17";

    // 请求地址
    String open_api_url_prefix = "https://ad.oceanengine.com/open_api/";
    String uri = "oauth2/advertiser/get/";

    // 请求参数
    Map data = new HashMap(){
      {
        put("app_id", "1714109568634888");
        put("secret", "67781f4577886f1dc9f342bef41d6dc82060acb8");
        put("access_token", access_token);
      }
    };


    return OceanengineApiTest.getApiInfo(open_api_url_prefix + uri,access_token,data);
  }

}
