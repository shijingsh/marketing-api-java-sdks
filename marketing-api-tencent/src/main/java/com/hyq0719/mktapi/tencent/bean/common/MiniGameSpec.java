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

/**
 * 小游戏落地页信息
 */
public class MiniGameSpec implements IBean {
  @SerializedName("mini_game_tracking_parameter")
  private String miniGameTrackingParameter = null;

  public MiniGameSpec miniGameTrackingParameter(String miniGameTrackingParameter) {
    this.miniGameTrackingParameter = miniGameTrackingParameter;
    return this;
  }

  /**
   * Get miniGameTrackingParameter
   *
   * @return miniGameTrackingParameter
   */
  public String getMiniGameTrackingParameter() {
    return miniGameTrackingParameter;
  }

  public void setMiniGameTrackingParameter(String miniGameTrackingParameter) {
    this.miniGameTrackingParameter = miniGameTrackingParameter;
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
