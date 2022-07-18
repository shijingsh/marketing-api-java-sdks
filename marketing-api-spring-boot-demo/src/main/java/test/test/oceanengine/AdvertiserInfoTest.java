package test.test.oceanengine;

import java.util.HashMap;
import java.util.Map;

/**
 * 获取广告主账户详细信息,可指定fields查询所需元素。
 */
public class AdvertiserInfoTest {

  public static void main(String args[]){
    String info = getAdvertiserInfo();
    System.out.println("============================================");
    System.out.println(info);
  }

  public static String getAdvertiserInfo() {
    String access_token = "507b9a7866e373ccd3c43cb286ede27f55d9ae17";
    final Long advertiser_id = 1714035886806035L;

    // 请求地址
    String open_api_url_prefix = "https://ad.oceanengine.com/open_api/2/";
    String uri = "advertiser/info/";

    // 请求参数
    Map data = new HashMap(){
      {
        put("advertiser_ids", new Long[] {advertiser_id});
        put("fields", new String[] {"id", "name", "status"});
      }
    };


    return OceanengineApiTest.getApiInfo(open_api_url_prefix + uri,access_token,data);
  }

}
