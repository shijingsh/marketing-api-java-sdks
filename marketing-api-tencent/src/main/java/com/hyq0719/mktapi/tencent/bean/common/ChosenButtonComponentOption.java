/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.hyq0719.mktapi.tencent.bean.common;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** 选择按钮组件 */
@ApiModel(description = "选择按钮组件")
public class ChosenButtonComponentOption implements IBean {
  @SerializedName("component_id")
  private Long componentId = null;

  @SerializedName("value")
  private ChosenButtonComponentValueStruct value = null;

  public ChosenButtonComponentOption componentId(Long componentId) {
    this.componentId = componentId;
    return this;
  }

  /**
   * Get componentId
   *
   * @return componentId
   */
  @ApiModelProperty(value = "")
  public Long getComponentId() {
    return componentId;
  }

  public void setComponentId(Long componentId) {
    this.componentId = componentId;
  }

  public ChosenButtonComponentOption value(ChosenButtonComponentValueStruct value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   *
   * @return value
   */
  @ApiModelProperty(value = "")
  public ChosenButtonComponentValueStruct getValue() {
    return value;
  }

  public void setValue(ChosenButtonComponentValueStruct value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChosenButtonComponentOption chosenButtonComponentOption = (ChosenButtonComponentOption) o;
    return Objects.equals(this.componentId, chosenButtonComponentOption.componentId)
        && Objects.equals(this.value, chosenButtonComponentOption.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentId, value);
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
