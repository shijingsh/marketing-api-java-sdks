package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.oceanengine.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class AdsUpdateStatusRequest implements TokenKey {
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("ad_ids")
  private List<Long> adIds = null;

  @SerializedName("opt_status")
  private String optStatus = null;

  public AdsUpdateStatusRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdsUpdateStatusRequest adIds(List<Long> adIds) {
    this.adIds = adIds;
    return this;
  }

  public AdsUpdateStatusRequest optStatus(String optStatus) {
    this.optStatus = optStatus;
    return this;
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(advertiserId);
  }
}
