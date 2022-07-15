package com.hyq0719.mktapi.kuaishou.bean.ad_unit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

@Data
public class GiftDataStruct implements IBean {
  @SerializedName("target_action_type")
  private Integer targetActionType = null;

  @SerializedName("code")
  private String code = null;


  public GiftDataStruct targetActionType(Integer targetActionType) {
    this.targetActionType = targetActionType;
    return this;
  }

  public GiftDataStruct code(String code) {
    this.code = code;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }


}
