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

import java.util.ArrayList;
import java.util.List;

/**
 * 出价系数设置内容，仅当投放oCPC、oCPM广告时可使用
 */
public class BidAdjustment {
  @SerializedName("site_set_package")
  private List<SiteSetPackageStruct> siteSetPackage = null;

  public BidAdjustment siteSetPackage(List<SiteSetPackageStruct> siteSetPackage) {
    this.siteSetPackage = siteSetPackage;
    return this;
  }

  public BidAdjustment addSiteSetPackageItem(SiteSetPackageStruct siteSetPackageItem) {
    if (this.siteSetPackage == null) {
      this.siteSetPackage = new ArrayList<SiteSetPackageStruct>();
    }
    this.siteSetPackage.add(siteSetPackageItem);
    return this;
  }

  /**
   * Get siteSetPackage
   *
   * @return siteSetPackage
   */
  public List<SiteSetPackageStruct> getSiteSetPackage() {
    return siteSetPackage;
  }

  public void setSiteSetPackage(List<SiteSetPackageStruct> siteSetPackage) {
    this.siteSetPackage = siteSetPackage;
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