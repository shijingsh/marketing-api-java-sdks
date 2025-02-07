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

package com.hyq0719.mktapi.tencent.bean.dynamicCreative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** 落地页 */
@ApiModel(description = "落地页")
public class AdcreativeMyappLandingPageInfo implements IBean {
  @SerializedName("myapp_page_id")
  private String myappPageId = null;

  @SerializedName("url")
  private String url = null;

  public AdcreativeMyappLandingPageInfo myappPageId(String myappPageId) {
    this.myappPageId = myappPageId;
    return this;
  }

  /**
   * Get myappPageId
   *
   * @return myappPageId
   */
  @ApiModelProperty(value = "")
  public String getMyappPageId() {
    return myappPageId;
  }

  public void setMyappPageId(String myappPageId) {
    this.myappPageId = myappPageId;
  }

  public AdcreativeMyappLandingPageInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   *
   * @return url
   */
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdcreativeMyappLandingPageInfo adcreativeMyappLandingPageInfo =
        (AdcreativeMyappLandingPageInfo) o;
    return Objects.equals(this.myappPageId, adcreativeMyappLandingPageInfo.myappPageId)
        && Objects.equals(this.url, adcreativeMyappLandingPageInfo.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myappPageId, url);
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
