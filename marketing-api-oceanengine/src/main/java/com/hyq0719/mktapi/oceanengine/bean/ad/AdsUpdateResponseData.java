package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class AdsUpdateResponseData {
  @SerializedName("ad_id")
  private Long adId = null;

  @SerializedName("need_audit")
  private Long needAudit = null;

  public AdsUpdateResponseData adId(Long adId) {
    this.adId = adId;
    return this;
  }

  public AdsUpdateResponseData needAudit(Long needAudit) {
    this.needAudit = needAudit;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
