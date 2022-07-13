/*
 * Marketing API 腾讯广告
 * Marketing API 腾讯广告
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.tencent.bean.account.adAccount;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 *
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-07-12 15:45:19
 */
@Data
public class AdvertiserGetStruct {

  /**
   * 返回信息列表
   */
  @SerializedName("list")
  private List<AdvertiserGetListStruct> list = null;

  /**
   * 分页配置信息
   */
  @SerializedName("page_info")
  private AdvertiserGetListStruct pageInfo = null;

  public AdvertiserGetStruct list (List<AdvertiserGetListStruct> list) {
    this.list = list;
    return this;
  }

  public AdvertiserGetStruct pageInfo (AdvertiserGetListStruct pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
