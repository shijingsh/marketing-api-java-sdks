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

package com.hyq0719.mktapi.tencent.bean.adgroups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;

import java.util.ArrayList;
import java.util.List;

/**
 * AdgroupsUpdateDailyBudgetResponseData
 */
public class AdgroupsUpdateDailyBudgetResponseData implements IBean {
  @SerializedName("list")
  private List<AdgroupsUpdateDailyBudgetListStruct> list = null;

  public AdgroupsUpdateDailyBudgetResponseData list(
    List<AdgroupsUpdateDailyBudgetListStruct> list) {
    this.list = list;
    return this;
  }

  public AdgroupsUpdateDailyBudgetResponseData addListItem(
    AdgroupsUpdateDailyBudgetListStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<AdgroupsUpdateDailyBudgetListStruct>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   *
   * @return list
   */
  public List<AdgroupsUpdateDailyBudgetListStruct> getList() {
    return list;
  }

  public void setList(List<AdgroupsUpdateDailyBudgetListStruct> list) {
    this.list = list;
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
