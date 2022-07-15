/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.promotionService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-08 14:48:35
 */
@Data
public class AdAdvertisementPageInfoByLastIdResponseData implements IBean {

  /**
   * 该批次的最大ID
   */
  @SerializedName("lastId")
  private Long lastId = null;

  /**
   * 分页大小
   */
  @SerializedName("pageSize")
  private Integer pageSize = null;

  /**
   * 数据列表
   */
  @SerializedName("data")
  private List<AdAdvertisementPageInfoByLastIdListDataStruct> data = null;

  public AdAdvertisementPageInfoByLastIdResponseData lastId(Long lastId) {
    this.lastId = lastId;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdResponseData pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public AdAdvertisementPageInfoByLastIdResponseData data(List<AdAdvertisementPageInfoByLastIdListDataStruct> data) {
    this.data = data;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
