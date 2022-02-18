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
import com.hyq0719.mktapi.tencent.bean.common.ConfPageSize500;

import java.util.ArrayList;
import java.util.List;

/**
 * CampaignsGetResponseData
 */
public class CampaignsGetResponseData {
  @SerializedName("list")
  private List<CampaignsGetListStruct> list = null;

  @SerializedName("page_info")
  private ConfPageSize500 pageInfo = null;

  public CampaignsGetResponseData list(List<CampaignsGetListStruct> list) {
    this.list = list;
    return this;
  }

  public CampaignsGetResponseData addListItem(CampaignsGetListStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<CampaignsGetListStruct>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   *
   * @return list
   */
  public List<CampaignsGetListStruct> getList() {
    return list;
  }

  public void setList(List<CampaignsGetListStruct> list) {
    this.list = list;
  }

  public CampaignsGetResponseData pageInfo(ConfPageSize500 pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  /**
   * Get pageInfo
   *
   * @return pageInfo
   */
  public ConfPageSize500 getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(ConfPageSize500 pageInfo) {
    this.pageInfo = pageInfo;
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