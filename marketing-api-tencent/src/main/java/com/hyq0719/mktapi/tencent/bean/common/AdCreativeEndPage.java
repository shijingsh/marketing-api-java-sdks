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
 * 视频结束页
 */
public class AdCreativeEndPage implements IBean {
  @SerializedName("end_page_type")
  private String endPageType = null;

  @SerializedName("end_page_desc")
  private String endPageDesc = null;

  public AdCreativeEndPage endPageType(String endPageType) {
    this.endPageType = endPageType;
    return this;
  }

  /**
   * Get endPageType
   *
   * @return endPageType
   */
  public String getEndPageType() {
    return endPageType;
  }

  public void setEndPageType(String endPageType) {
    this.endPageType = endPageType;
  }

  public AdCreativeEndPage endPageDesc(String endPageDesc) {
    this.endPageDesc = endPageDesc;
    return this;
  }

  /**
   * Get endPageDesc
   *
   * @return endPageDesc
   */
  public String getEndPageDesc() {
    return endPageDesc;
  }

  public void setEndPageDesc(String endPageDesc) {
    this.endPageDesc = endPageDesc;
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
