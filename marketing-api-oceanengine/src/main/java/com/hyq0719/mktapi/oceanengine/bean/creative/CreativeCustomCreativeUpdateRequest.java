package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class CreativeCustomCreativeUpdateRequest implements TokenKey {
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("ad_id")
  private Long adId = null;

  @SerializedName("creative_list")
  private List<CreativeListStruct> creativeList = null;

  @SerializedName("ad_data")
  private AdDataStruct adData = null;

  public CreativeCustomCreativeUpdateRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public CreativeCustomCreativeUpdateRequest adId(Long adId) {
    this.adId = adId;
    return this;
  }

  public CreativeCustomCreativeUpdateRequest creativeList(List<CreativeListStruct> creativeList) {
    this.creativeList = creativeList;
    return this;
  }

  public CreativeCustomCreativeUpdateRequest adData(AdDataStruct adData) {
    this.adData = adData;
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
