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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 短子链组 */
@ApiModel(description = "短子链组")
public class ShortSublinkListComponentOption implements IBean {
  @SerializedName("component_id")
  private Long componentId = null;

  @SerializedName("value")
  private List<ShortSublinkStruct> value = null;

  public ShortSublinkListComponentOption componentId(Long componentId) {
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

  public ShortSublinkListComponentOption value(List<ShortSublinkStruct> value) {
    this.value = value;
    return this;
  }

  public ShortSublinkListComponentOption addValueItem(ShortSublinkStruct valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<ShortSublinkStruct>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Get value
   *
   * @return value
   */
  @ApiModelProperty(value = "")
  public List<ShortSublinkStruct> getValue() {
    return value;
  }

  public void setValue(List<ShortSublinkStruct> value) {
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
    ShortSublinkListComponentOption shortSublinkListComponentOption =
        (ShortSublinkListComponentOption) o;
    return Objects.equals(this.componentId, shortSublinkListComponentOption.componentId)
        && Objects.equals(this.value, shortSublinkListComponentOption.value);
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
