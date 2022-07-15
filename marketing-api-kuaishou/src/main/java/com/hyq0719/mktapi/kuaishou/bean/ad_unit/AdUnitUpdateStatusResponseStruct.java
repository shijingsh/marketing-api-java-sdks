package com.hyq0719.mktapi.kuaishou.bean.ad_unit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

@Data
public class AdUnitUpdateStatusResponseStruct implements IBean {
  @SerializedName("unit_id")
  private Long unitId = null;

  public AdUnitUpdateStatusResponseStruct campaignId(Long unitId) {
    this.unitId = unitId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
