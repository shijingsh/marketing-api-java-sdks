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

package com.hyq0719.mktapi.tencent.bean.advertiser;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.TokenKey;

import java.util.ArrayList;
import java.util.List;

/**
 * AdvertiserUpdateDailyBudgetRequest
 */
public class AdvertiserUpdateDailyBudgetRequest implements TokenKey {

  @SerializedName("account_id")
  private Long accountId;

  @SerializedName("update_daily_budget_spec")
  private List<AdvertiserUpdateDailyBudgetUpdateDailyBudgetStruct> updateDailyBudgetSpec = null;

  public AdvertiserUpdateDailyBudgetRequest updateDailyBudgetSpec(
    List<AdvertiserUpdateDailyBudgetUpdateDailyBudgetStruct> updateDailyBudgetSpec) {
    this.updateDailyBudgetSpec = updateDailyBudgetSpec;
    return this;
  }

  public AdvertiserUpdateDailyBudgetRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  public AdvertiserUpdateDailyBudgetRequest addUpdateDailyBudgetSpecItem(
    AdvertiserUpdateDailyBudgetUpdateDailyBudgetStruct updateDailyBudgetSpecItem) {
    if (this.updateDailyBudgetSpec == null) {
      this.updateDailyBudgetSpec =
        new ArrayList<AdvertiserUpdateDailyBudgetUpdateDailyBudgetStruct>();
    }
    this.updateDailyBudgetSpec.add(updateDailyBudgetSpecItem);
    return this;
  }

  /**
   * Get updateDailyBudgetSpec
   *
   * @return updateDailyBudgetSpec
   */
  public List<AdvertiserUpdateDailyBudgetUpdateDailyBudgetStruct> getUpdateDailyBudgetSpec() {
    return updateDailyBudgetSpec;
  }

  public void setUpdateDailyBudgetSpec(
    List<AdvertiserUpdateDailyBudgetUpdateDailyBudgetStruct> updateDailyBudgetSpec) {
    this.updateDailyBudgetSpec = updateDailyBudgetSpec;
  }

  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(accountId);
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
