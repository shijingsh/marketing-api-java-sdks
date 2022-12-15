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

/** 小游戏结束页能力 */
@ApiModel(description = "小游戏结束页能力")
public class WegameInfoSpec implements IBean {
  @SerializedName("wegame_info_switch")
  private Boolean wegameInfoSwitch = null;

  public WegameInfoSpec wegameInfoSwitch(Boolean wegameInfoSwitch) {
    this.wegameInfoSwitch = wegameInfoSwitch;
    return this;
  }

  /**
   * Get wegameInfoSwitch
   *
   * @return wegameInfoSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isWegameInfoSwitch() {
    return wegameInfoSwitch;
  }

  public void setWegameInfoSwitch(Boolean wegameInfoSwitch) {
    this.wegameInfoSwitch = wegameInfoSwitch;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WegameInfoSpec wegameInfoSpec = (WegameInfoSpec) o;
    return Objects.equals(this.wegameInfoSwitch, wegameInfoSpec.wegameInfoSwitch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wegameInfoSwitch);
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
