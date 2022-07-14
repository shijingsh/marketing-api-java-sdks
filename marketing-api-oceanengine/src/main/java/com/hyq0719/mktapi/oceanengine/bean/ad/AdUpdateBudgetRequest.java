package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.TokenKey;
import lombok.Data;

@Data
public class AdUpdateBudgetRequest implements TokenKey {
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  @SerializedName("data")
  private AdUpdateBudgetRequestData data = null;

  public AdUpdateBudgetRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public AdUpdateBudgetRequest data(AdUpdateBudgetRequestData data) {
    this.data = data;
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
