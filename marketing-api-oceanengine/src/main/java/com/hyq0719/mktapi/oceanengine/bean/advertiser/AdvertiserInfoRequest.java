/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.advertiser;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.TokenKey;
import lombok.Data;

import java.util.List;

/**
 *
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-07-15 15:11:42
 */
@Data
public class AdvertiserInfoRequest implements TokenKey {
  /**
   * 广告主ID集合(如果包含没有访问权限的ID,将返回no permission error) 取值范围: 1-100
   */
  @SerializedName("advertiser_ids")
  private List<Long> advertiserIds = null;

  /**
   * 查询字段集合, 默认:查询所有。字段详见下方response字段定义 . 允许值: "id", "name", "role", "status", "address", "reason", "lice...
   */
  @SerializedName("fields")
  private List<String> fields = null;

  public AdvertiserInfoRequest advertiserIds (List<Long> advertiserIds) {
    this.advertiserIds = advertiserIds;
    return this;
  }

  public AdvertiserInfoRequest fields (List<String> fields) {
    this.fields = fields;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    if(advertiserIds != null && advertiserIds.size()>0){
      return advertiserIds.get(0)+"";
    }
    return "";
  }
}
