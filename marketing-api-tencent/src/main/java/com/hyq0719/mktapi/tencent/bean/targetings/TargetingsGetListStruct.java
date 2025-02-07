package com.hyq0719.mktapi.tencent.bean.targetings;


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

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;

/**
 * 返回结构
 */
public class TargetingsGetListStruct implements IBean {
  @SerializedName("targeting_id")
  private Long targetingId = null;

  @SerializedName("targeting_name")
  private String targetingName = null;

  @SerializedName("is_include_unsupported_targeting")
  private Boolean isIncludeUnsupportedTargeting = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("is_deleted")
  private Boolean isDeleted = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  @SerializedName("ad_lock_status")
  private AdLockStatus adLockStatus = null;

  @SerializedName("targeting_translation")
  private String targetingTranslation = null;

  @SerializedName("targeting_source_type")
  private TargetingPkgSourceType targetingSourceType = null;

  @SerializedName("share_from_account_id")
  private Long shareFromAccountId = null;

  @SerializedName("share_from_targeting_id")
  private Long shareFromTargetingId = null;

  @SerializedName("targeting")
  private ReadTargetingSetting targeting = null;

  public TargetingsGetListStruct targetingId(Long targetingId) {
    this.targetingId = targetingId;
    return this;
  }

  /**
   * Get targetingId
   *
   * @return targetingId
   */
  public Long getTargetingId() {
    return targetingId;
  }

  public void setTargetingId(Long targetingId) {
    this.targetingId = targetingId;
  }

  public TargetingsGetListStruct targetingName(String targetingName) {
    this.targetingName = targetingName;
    return this;
  }

  /**
   * Get targetingName
   *
   * @return targetingName
   */
  public String getTargetingName() {
    return targetingName;
  }

  public void setTargetingName(String targetingName) {
    this.targetingName = targetingName;
  }

  public TargetingsGetListStruct isIncludeUnsupportedTargeting(
    Boolean isIncludeUnsupportedTargeting) {
    this.isIncludeUnsupportedTargeting = isIncludeUnsupportedTargeting;
    return this;
  }

  /**
   * Get isIncludeUnsupportedTargeting
   *
   * @return isIncludeUnsupportedTargeting
   */
  public Boolean isIsIncludeUnsupportedTargeting() {
    return isIncludeUnsupportedTargeting;
  }

  public void setIsIncludeUnsupportedTargeting(Boolean isIncludeUnsupportedTargeting) {
    this.isIncludeUnsupportedTargeting = isIncludeUnsupportedTargeting;
  }

  public TargetingsGetListStruct description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TargetingsGetListStruct isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Get isDeleted
   *
   * @return isDeleted
   */
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public TargetingsGetListStruct createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public TargetingsGetListStruct lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   */
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public TargetingsGetListStruct adLockStatus(AdLockStatus adLockStatus) {
    this.adLockStatus = adLockStatus;
    return this;
  }

  /**
   * Get adLockStatus
   *
   * @return adLockStatus
   */
  public AdLockStatus getAdLockStatus() {
    return adLockStatus;
  }

  public void setAdLockStatus(AdLockStatus adLockStatus) {
    this.adLockStatus = adLockStatus;
  }

  public TargetingsGetListStruct targetingTranslation(String targetingTranslation) {
    this.targetingTranslation = targetingTranslation;
    return this;
  }

  /**
   * Get targetingTranslation
   *
   * @return targetingTranslation
   */
  public String getTargetingTranslation() {
    return targetingTranslation;
  }

  public void setTargetingTranslation(String targetingTranslation) {
    this.targetingTranslation = targetingTranslation;
  }

  public TargetingsGetListStruct targetingSourceType(TargetingPkgSourceType targetingSourceType) {
    this.targetingSourceType = targetingSourceType;
    return this;
  }

  /**
   * Get targetingSourceType
   *
   * @return targetingSourceType
   */
  public TargetingPkgSourceType getTargetingSourceType() {
    return targetingSourceType;
  }

  public void setTargetingSourceType(TargetingPkgSourceType targetingSourceType) {
    this.targetingSourceType = targetingSourceType;
  }

  public TargetingsGetListStruct shareFromAccountId(Long shareFromAccountId) {
    this.shareFromAccountId = shareFromAccountId;
    return this;
  }

  /**
   * Get shareFromAccountId
   *
   * @return shareFromAccountId
   */
  public Long getShareFromAccountId() {
    return shareFromAccountId;
  }

  public void setShareFromAccountId(Long shareFromAccountId) {
    this.shareFromAccountId = shareFromAccountId;
  }

  public TargetingsGetListStruct shareFromTargetingId(Long shareFromTargetingId) {
    this.shareFromTargetingId = shareFromTargetingId;
    return this;
  }

  /**
   * Get shareFromTargetingId
   *
   * @return shareFromTargetingId
   */
  public Long getShareFromTargetingId() {
    return shareFromTargetingId;
  }

  public void setShareFromTargetingId(Long shareFromTargetingId) {
    this.shareFromTargetingId = shareFromTargetingId;
  }

  public TargetingsGetListStruct targeting(ReadTargetingSetting targeting) {
    this.targeting = targeting;
    return this;
  }

  /**
   * Get targeting
   *
   * @return targeting
   */
  public ReadTargetingSetting getTargeting() {
    return targeting;
  }

  public void setTargeting(ReadTargetingSetting targeting) {
    this.targeting = targeting;
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
