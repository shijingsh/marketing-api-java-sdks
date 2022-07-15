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
 * 品牌形象
 */
public class AdCreativeBrand implements IBean {
  @SerializedName("brand_name")
  private String brandName = null;

  @SerializedName("brand_img")
  private String brandImg = null;

  @SerializedName("brand_description")
  private String brandDescription = null;

  public AdCreativeBrand brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

  /**
   * Get brandName
   *
   * @return brandName
   */
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public AdCreativeBrand brandImg(String brandImg) {
    this.brandImg = brandImg;
    return this;
  }

  /**
   * Get brandImg
   *
   * @return brandImg
   */
  public String getBrandImg() {
    return brandImg;
  }

  public void setBrandImg(String brandImg) {
    this.brandImg = brandImg;
  }

  public AdCreativeBrand brandDescription(String brandDescription) {
    this.brandDescription = brandDescription;
    return this;
  }

  /**
   * Get brandDescription
   *
   * @return brandDescription
   */
  public String getBrandDescription() {
    return brandDescription;
  }

  public void setBrandDescription(String brandDescription) {
    this.brandDescription = brandDescription;
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
