/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.advertiser;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

/**
 *
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-07-15 15:11:42
 */
@Data
public class AdvertiserInfoResponseData  implements IBean {
  /**
   * 广告主ID
   */
  @SerializedName("id")
  private Long id = null;

  /**
   * 账户名
   */
  @SerializedName("name")
  private String name = null;

  /**
   * 角色, 详见【附录-广告主角色】
   */
  @SerializedName("role")
  private String role = null;

  /**
   * 状态,详见【附录-广告主状态】
   */
  @SerializedName("status")
  private String status = null;

  /**
   * 地址
   */
  @SerializedName("address")
  private String address = null;

  /**
   * 执照预览地址(链接默认1小时内有效)
   */
  @SerializedName("license_url")
  private String licenseUrl = null;

  /**
   * 执照编号
   */
  @SerializedName("license_no")
  private String licenseNo = null;

  /**
   * 执照省份
   */
  @SerializedName("license_province")
  private String licenseProvince = null;

  /**
   * 执照城市
   */
  @SerializedName("license_city")
  private String licenseCity = null;

  /**
   * 公司名
   */
  @SerializedName("company")
  private String company = null;

  /**
   * 经营类别
   */
  @SerializedName("brand")
  private String brand = null;

  /**
   * 运营区域
   */
  @SerializedName("promotion_area")
  private String promotionArea = null;

  /**
   * 运营省份
   */
  @SerializedName("promotion_center_province")
  private String promotionCenterProvince = null;

  /**
   * 运营城市
   */
  @SerializedName("promotion_center_city")
  private String promotionCenterCity = null;

  /**
   * 一级行业名称（新版）
   */
  @SerializedName("first_industry_name")
  private String firstIndustryName = null;

  /**
   * 二级行业名称（新版）
   */
  @SerializedName("second_industry_name")
  private String secondIndustryName = null;

  /**
   * 审核拒绝原因
   */
  @SerializedName("reason")
  private String reason = null;

  /**
   * 创建时间
   */
  @SerializedName("create_time")
  private String createTime = null;

  public AdvertiserInfoResponseData id (Long id) {
    this.id = id;
    return this;
  }

  public AdvertiserInfoResponseData name (String name) {
    this.name = name;
    return this;
  }

  public AdvertiserInfoResponseData role (String role) {
    this.role = role;
    return this;
  }

  public AdvertiserInfoResponseData status (String status) {
    this.status = status;
    return this;
  }

  public AdvertiserInfoResponseData address (String address) {
    this.address = address;
    return this;
  }

  public AdvertiserInfoResponseData licenseUrl (String licenseUrl) {
    this.licenseUrl = licenseUrl;
    return this;
  }

  public AdvertiserInfoResponseData licenseNo (String licenseNo) {
    this.licenseNo = licenseNo;
    return this;
  }

  public AdvertiserInfoResponseData licenseProvince (String licenseProvince) {
    this.licenseProvince = licenseProvince;
    return this;
  }

  public AdvertiserInfoResponseData licenseCity (String licenseCity) {
    this.licenseCity = licenseCity;
    return this;
  }

  public AdvertiserInfoResponseData company (String company) {
    this.company = company;
    return this;
  }

  public AdvertiserInfoResponseData brand (String brand) {
    this.brand = brand;
    return this;
  }

  public AdvertiserInfoResponseData promotionArea (String promotionArea) {
    this.promotionArea = promotionArea;
    return this;
  }

  public AdvertiserInfoResponseData promotionCenterProvince (String promotionCenterProvince) {
    this.promotionCenterProvince = promotionCenterProvince;
    return this;
  }

  public AdvertiserInfoResponseData promotionCenterCity (String promotionCenterCity) {
    this.promotionCenterCity = promotionCenterCity;
    return this;
  }

  public AdvertiserInfoResponseData firstIndustryName (String firstIndustryName) {
    this.firstIndustryName = firstIndustryName;
    return this;
  }

  public AdvertiserInfoResponseData secondIndustryName (String secondIndustryName) {
    this.secondIndustryName = secondIndustryName;
    return this;
  }

  public AdvertiserInfoResponseData reason (String reason) {
    this.reason = reason;
    return this;
  }

  public AdvertiserInfoResponseData createTime (String createTime) {
    this.createTime = createTime;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
