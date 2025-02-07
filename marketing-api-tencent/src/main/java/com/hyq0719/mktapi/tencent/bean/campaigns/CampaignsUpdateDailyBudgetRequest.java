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

package com.hyq0719.mktapi.tencent.bean.campaigns;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.TokenKey;

import java.util.ArrayList;
import java.util.List;

/**
 * CampaignsUpdateDailyBudgetRequest
 */
public class CampaignsUpdateDailyBudgetRequest implements TokenKey {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("update_daily_budget_spec")
  private List<CampaignsUpdateDailyBudgetUpdateDailyBudgetStruct> updateDailyBudgetSpec = null;

  public CampaignsUpdateDailyBudgetRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CampaignsUpdateDailyBudgetRequest updateDailyBudgetSpec(
    List<CampaignsUpdateDailyBudgetUpdateDailyBudgetStruct> updateDailyBudgetSpec) {
    this.updateDailyBudgetSpec = updateDailyBudgetSpec;
    return this;
  }

  public CampaignsUpdateDailyBudgetRequest addUpdateDailyBudgetSpecItem(
    CampaignsUpdateDailyBudgetUpdateDailyBudgetStruct updateDailyBudgetSpecItem) {
    if (this.updateDailyBudgetSpec == null) {
      this.updateDailyBudgetSpec =
        new ArrayList<CampaignsUpdateDailyBudgetUpdateDailyBudgetStruct>();
    }
    this.updateDailyBudgetSpec.add(updateDailyBudgetSpecItem);
    return this;
  }

  /**
   * Get updateDailyBudgetSpec
   *
   * @return updateDailyBudgetSpec
   */
  public List<CampaignsUpdateDailyBudgetUpdateDailyBudgetStruct> getUpdateDailyBudgetSpec() {
    return updateDailyBudgetSpec;
  }

  public void setUpdateDailyBudgetSpec(
    List<CampaignsUpdateDailyBudgetUpdateDailyBudgetStruct> updateDailyBudgetSpec) {
    this.updateDailyBudgetSpec = updateDailyBudgetSpec;
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
