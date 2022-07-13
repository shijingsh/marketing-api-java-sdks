/*
 * Marketing API 腾讯广告
 * Marketing API 腾讯广告
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.tencent.bean.account.adAccount;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 *
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-07-12 15:45:19
 */
@Data
public class WechatSpecStruct {

  /**
   * 微信账号 id：若为微信公众号则为微信公众号 id，若为通用账号则为通用账号 id。
   */
  @SerializedName("wechat_account_id")
  private String wechatAccountId = null;

  /**
   * 微信账号名称：若为微信公众号则为微信公众号名称，若为通用账号则为通用账号名称。
   */
  @SerializedName("wechat_account_name")
  private String wechatAccountName = null;

  /**
   * 系统状态，[枚举详情]
   */
  @SerializedName("system_status")
  private String systemStatus = null;

  /**
   * 微信行业 id，至少需要细化到二级行业（最细有 3 级），详见 [行业分类]
   */
  @SerializedName("system_industry_id")
  private Integer systemIndustryId = null;

  /**
   * 行业名称
   */
  @SerializedName("industry_name")
  private String industryName = null;

  /**
   * 联系人姓名
   */
  @SerializedName("contact_person")
  private String contactPerson = null;

  /**
   * 联系人电话号码，支持手机和座机
   */
  @SerializedName("contact_person_telephone")
  private String contactPersonTelephone = null;

  /**
   * 经营性质类型，[枚举详情]
   */
  @SerializedName("business_type")
  private String businessType = null;

  /**
   * 经营内容，见附录【资质信息】
   */
  @SerializedName("business_content")
  private String businessContent = null;

  /**
   * 审核拒绝原因
   */
  @SerializedName("reject_message")
  private String rejectMessage = null;

  /**
   * 广告主头像，仅通用账户有此信息
   */
  @SerializedName("profile_photo")
  private String profilePhoto = null;

  /**
   * 品牌介绍，仅通用账户有此信息
   */
  @SerializedName("brand_introduction")
  private String brandIntroduction = null;

  /**
   * 介绍链接，仅通用账户有此信息
   */
  @SerializedName("introduction_url")
  private String introductionUrl = null;

  public WechatSpecStruct wechatAccountId (String wechatAccountId) {
    this.wechatAccountId = wechatAccountId;
    return this;
  }

  public WechatSpecStruct wechatAccountName (String wechatAccountName) {
    this.wechatAccountName = wechatAccountName;
    return this;
  }

  public WechatSpecStruct systemStatus (String systemStatus) {
    this.systemStatus = systemStatus;
    return this;
  }

  public WechatSpecStruct systemIndustryId (Integer systemIndustryId) {
    this.systemIndustryId = systemIndustryId;
    return this;
  }

  public WechatSpecStruct industryName (String industryName) {
    this.industryName = industryName;
    return this;
  }

  public WechatSpecStruct contactPerson (String contactPerson) {
    this.contactPerson = contactPerson;
    return this;
  }

  public WechatSpecStruct contactPersonTelephone (String contactPersonTelephone) {
    this.contactPersonTelephone = contactPersonTelephone;
    return this;
  }

  public WechatSpecStruct businessType (String businessType) {
    this.businessType = businessType;
    return this;
  }

  public WechatSpecStruct businessContent (String businessContent) {
    this.businessContent = businessContent;
    return this;
  }

  public WechatSpecStruct rejectMessage (String rejectMessage) {
    this.rejectMessage = rejectMessage;
    return this;
  }

  public WechatSpecStruct profilePhoto (String profilePhoto) {
    this.profilePhoto = profilePhoto;
    return this;
  }

  public WechatSpecStruct brandIntroduction (String brandIntroduction) {
    this.brandIntroduction = brandIntroduction;
    return this;
  }

  public WechatSpecStruct introductionUrl (String introductionUrl) {
    this.introductionUrl = introductionUrl;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
