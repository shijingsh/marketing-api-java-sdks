package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

@Data
public class AdUpdateBidRequestData implements IBean {
  @SerializedName("ad_id")
  private Long adId = null;

  @SerializedName("bid")
  private Long bid = null;

  public AdUpdateBidRequestData adIds(Long adId) {
    this.adId = adId;
    return this;
  }

  public AdUpdateBidRequestData bid(Long bid) {
    this.bid = bid;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
