package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

@Data
public class AdCreateResponseData implements IBean {
  @SerializedName("ad_id")
  private Long adId = null;

  public AdCreateResponseData adId(Long adId) {
    this.adId = adId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
