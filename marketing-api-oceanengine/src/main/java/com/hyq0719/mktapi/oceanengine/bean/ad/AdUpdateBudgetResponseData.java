package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

import java.util.List;

@Data
public class AdUpdateBudgetResponseData implements IBean {
  @SerializedName("ad_ids")
  private List<Long> adIds = null;
  @SerializedName("errors")
  private List<ErrorStruct> errors = null;

  public AdUpdateBudgetResponseData adIds(List<Long> adIds) {
    this.adIds = adIds;
    return this;
  }

  public AdUpdateBudgetResponseData errors(List<ErrorStruct> errors) {
    this.errors = errors;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
