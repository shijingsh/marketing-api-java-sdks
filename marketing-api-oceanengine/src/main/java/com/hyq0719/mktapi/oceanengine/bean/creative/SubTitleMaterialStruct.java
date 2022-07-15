package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

@Data
public class SubTitleMaterialStruct implements IBean {
  @SerializedName("sub_title")
  private String subTitle = null;

  public SubTitleMaterialStruct subTitle(String subTitle) {
    this.subTitle = subTitle;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
