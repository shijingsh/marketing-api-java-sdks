package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

@Data
public class ComponentMaterialsStruct implements IBean {
  @SerializedName("component_id")
  private Long componentId = null;

  public ComponentMaterialsStruct componentId(Long componentId) {
    this.componentId = componentId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
