package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class AdsUpdateBidResponseData {
  @SerializedName("ad_ids")
  private List<Long> adIds = null;

  @SerializedName("errors")
  private List<ErrorStruct> errors = null;

  public AdsUpdateBidResponseData adIds(List<Long> adIds) {
    this.adIds = adIds;
    return this;
  }

  public AdsUpdateBidResponseData errors(List<ErrorStruct> errors) {
    this.errors = errors;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
