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
 * 固定信用金更多信息
 */
public class CreditRollSpec implements IBean {
  @SerializedName("limit_amount")
  private Long limitAmount = null;

  @SerializedName("used_amount")
  private Long usedAmount = null;

  @SerializedName("usable_amout")
  private Long usableAmout = null;

  public CreditRollSpec limitAmount(Long limitAmount) {
    this.limitAmount = limitAmount;
    return this;
  }

  /**
   * Get limitAmount
   *
   * @return limitAmount
   */
  public Long getLimitAmount() {
    return limitAmount;
  }

  public void setLimitAmount(Long limitAmount) {
    this.limitAmount = limitAmount;
  }

  public CreditRollSpec usedAmount(Long usedAmount) {
    this.usedAmount = usedAmount;
    return this;
  }

  /**
   * Get usedAmount
   *
   * @return usedAmount
   */
  public Long getUsedAmount() {
    return usedAmount;
  }

  public void setUsedAmount(Long usedAmount) {
    this.usedAmount = usedAmount;
  }

  public CreditRollSpec usableAmout(Long usableAmout) {
    this.usableAmout = usableAmout;
    return this;
  }

  /**
   * Get usableAmout
   *
   * @return usableAmout
   */
  public Long getUsableAmout() {
    return usableAmout;
  }

  public void setUsableAmout(Long usableAmout) {
    this.usableAmout = usableAmout;
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
