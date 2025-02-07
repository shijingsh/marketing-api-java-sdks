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
 * 修改后的落地页，填写要求同page_spec，当且仅当 online_enabled &#x3D; true 时，此字段允许写入
 */
public class RevisedPageSpec implements IBean {
  @SerializedName("page_id")
  private Long pageId = null;

  @SerializedName("page_url")
  private String pageUrl = null;

  public RevisedPageSpec pageId(Long pageId) {
    this.pageId = pageId;
    return this;
  }

  /**
   * Get pageId
   *
   * @return pageId
   */
  public Long getPageId() {
    return pageId;
  }

  public void setPageId(Long pageId) {
    this.pageId = pageId;
  }

  public RevisedPageSpec pageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
    return this;
  }

  /**
   * Get pageUrl
   *
   * @return pageUrl
   */
  public String getPageUrl() {
    return pageUrl;
  }

  public void setPageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
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
