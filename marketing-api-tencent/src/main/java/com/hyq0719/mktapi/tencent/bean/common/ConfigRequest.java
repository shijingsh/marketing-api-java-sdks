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

import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.tencent.bean.IPage;

import java.util.List;


/**
 * CampaignsAddResponse
 */
public class ConfigRequest implements IPage {
  @SerializedName("page_size")
  Long pageSize;
  @SerializedName("is_deleted")
  Boolean isDeleted;
  @SerializedName("link_page_type_compatible")
  Boolean linkPageTypeCompatible;  // 广告创意独有
  @SerializedName("fields")
  List<String> fields;
  @SerializedName("account_id")
  private Long accountId;
  @SerializedName("filtering")
  private List<FilteringStruct> filtering;
  @SerializedName("page")
  private Long page;

  public ConfigRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  public ConfigRequest filtering(List<FilteringStruct> filtering) {
    this.filtering = filtering;
    return this;
  }

  public ConfigRequest page(Long page) {
    this.page = page;
    return this;
  }

  public ConfigRequest pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public ConfigRequest isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  public ConfigRequest linkPageTypeCompatible(Boolean linkPageTypeCompatible) {
    this.linkPageTypeCompatible = linkPageTypeCompatible;
    return this;
  }

  public ConfigRequest fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public Boolean getLinkPageTypeCompatible() {
    return linkPageTypeCompatible;
  }

  public void setLinkPageTypeCompatible(Boolean linkPageTypeCompatible) {
    this.linkPageTypeCompatible = linkPageTypeCompatible;
  }

  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public List<FilteringStruct> getFiltering() {
    return filtering;
  }

  public void setFiltering(List<FilteringStruct> filtering) {
    this.filtering = filtering;
  }

  public Long getPage() {
    return page;
  }

  public void setPage(Long page) {
    this.page = page;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public Boolean getDeleted() {
    return isDeleted;
  }

  public void setDeleted(Boolean deleted) {
    isDeleted = deleted;
  }

  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  @Override
  public String toString() {
    return "ConfigRequest{"
      + "accountId=" + accountId
      + ", filtering=" + filtering
      + ", page=" + page
      + ", pageSize=" + pageSize
      + ", isDeleted=" + isDeleted
      + ", linkPageTypeCompatible=" + linkPageTypeCompatible
      + ", fields=" + fields
      + '}';
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(accountId);
  }

  @Override
  public void exchangeCurrentPage(Integer page) {
    this.page = Long.valueOf(page);
  }

  @Override
  public Integer currentPageSize() {
    return Math.toIntExact(pageSize);
  }
}