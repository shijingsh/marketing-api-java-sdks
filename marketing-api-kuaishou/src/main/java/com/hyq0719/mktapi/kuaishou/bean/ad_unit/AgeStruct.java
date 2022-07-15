package com.hyq0719.mktapi.kuaishou.bean.ad_unit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

@Data
public class AgeStruct implements IBean {
  @SerializedName("min")
  private Integer min = null;

  @SerializedName("max")
  private Integer max = null;


  public AgeStruct min(Integer min) {
    this.min = min;
    return this;
  }

  public AgeStruct max(Integer max) {
    this.max = max;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
