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
 * 视频播放结束页
 */
public class VideoEndPageSpec implements IBean {
  @SerializedName("end_page_id")
  private String endPageId = null;

  @SerializedName("end_page_type")
  private String endPageType = null;

  public VideoEndPageSpec endPageId(String endPageId) {
    this.endPageId = endPageId;
    return this;
  }

  /**
   * Get endPageId
   *
   * @return endPageId
   */
  public String getEndPageId() {
    return endPageId;
  }

  public void setEndPageId(String endPageId) {
    this.endPageId = endPageId;
  }

  public VideoEndPageSpec endPageType(String endPageType) {
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
