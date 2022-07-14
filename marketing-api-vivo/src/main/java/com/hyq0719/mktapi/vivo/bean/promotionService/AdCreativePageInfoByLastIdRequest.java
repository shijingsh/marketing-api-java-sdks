/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.promotionService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.TokenKey;
import lombok.Data;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-17 14:19:08
 */
@Data
public class AdCreativePageInfoByLastIdRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  /**
   * 删除状态：0-未删除（默认），1-删除
   */
  @SerializedName("deleted")
  private Integer deleted = null;

  /**
   * 数据起始偏移量，必填，首页填0
   */
  @SerializedName("lastId")
  private Long lastId = null;

  /**
   * 分页大小，默认50，最大100
   */
  @SerializedName("pageSize")
  private Integer pageSize = null;

  public AdCreativePageInfoByLastIdRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdCreativePageInfoByLastIdRequest deleted(Integer deleted) {
    this.deleted = deleted;
    return this;
  }

  public AdCreativePageInfoByLastIdRequest lastId(Long lastId) {
    this.lastId = lastId;
    return this;
  }

  public AdCreativePageInfoByLastIdRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(advertiserId);
  }

}
