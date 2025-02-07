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
 * 动态商品广告属性
 */
public class DynamicAdSpec implements IBean {
  @SerializedName("product_catalog_id")
  private Long productCatalogId = null;

  @SerializedName("product_mode")
  private String productMode = null;

  @SerializedName("product_source")
  private String productSource = null;

  public DynamicAdSpec productCatalogId(Long productCatalogId) {
    this.productCatalogId = productCatalogId;
    return this;
  }

  /**
   * Get productCatalogId
   *
   * @return productCatalogId
   */
  public Long getProductCatalogId() {
    return productCatalogId;
  }

  public void setProductCatalogId(Long productCatalogId) {
    this.productCatalogId = productCatalogId;
  }

  public DynamicAdSpec productMode(String productMode) {
    this.productMode = productMode;
    return this;
  }

  /**
   * Get productMode
   *
   * @return productMode
   */
  public String getProductMode() {
    return productMode;
  }

  public void setProductMode(String productMode) {
    this.productMode = productMode;
  }

  public DynamicAdSpec productSource(String productSource) {
    this.productSource = productSource;
    return this;
  }

  /**
   * Get productSource
   *
   * @return productSource
   */
  public String getProductSource() {
    return productSource;
  }

  public void setProductSource(String productSource) {
    this.productSource = productSource;
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
