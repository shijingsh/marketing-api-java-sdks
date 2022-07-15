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

package com.hyq0719.mktapi.tencent.bean.account.funds;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import com.hyq0719.mktapi.tencent.bean.common.CreditRollSpec;
import com.hyq0719.mktapi.tencent.bean.common.MiniprogramAmount;

/**
 * 返回结构
 */
public class WechatFundsGetListStruct implements IBean {
  @SerializedName("fund_type")
  private String fundType = null;

  @SerializedName("balance")
  private Long balance = null;

  @SerializedName("credit_roll_spec")
  private CreditRollSpec creditRollSpec = null;

  @SerializedName("miniprogram_spec")
  private MiniprogramAmount miniprogramSpec = null;

  public WechatFundsGetListStruct fundType(String fundType) {
    this.fundType = fundType;
    return this;
  }

  /**
   * Get fundType
   *
   * @return fundType
   */
  public String getFundType() {
    return fundType;
  }

  public void setFundType(String fundType) {
    this.fundType = fundType;
  }

  public WechatFundsGetListStruct balance(Long balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   *
   * @return balance
   */
  public Long getBalance() {
    return balance;
  }

  public void setBalance(Long balance) {
    this.balance = balance;
  }

  public WechatFundsGetListStruct creditRollSpec(CreditRollSpec creditRollSpec) {
    this.creditRollSpec = creditRollSpec;
    return this;
  }

  /**
   * Get creditRollSpec
   *
   * @return creditRollSpec
   */
  public CreditRollSpec getCreditRollSpec() {
    return creditRollSpec;
  }

  public void setCreditRollSpec(CreditRollSpec creditRollSpec) {
    this.creditRollSpec = creditRollSpec;
  }

  public WechatFundsGetListStruct miniprogramSpec(MiniprogramAmount miniprogramSpec) {
    this.miniprogramSpec = miniprogramSpec;
    return this;
  }

  /**
   * Get miniprogramSpec
   *
   * @return miniprogramSpec
   */
  public MiniprogramAmount getMiniprogramSpec() {
    return miniprogramSpec;
  }

  public void setMiniprogramSpec(MiniprogramAmount miniprogramSpec) {
    this.miniprogramSpec = miniprogramSpec;
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
