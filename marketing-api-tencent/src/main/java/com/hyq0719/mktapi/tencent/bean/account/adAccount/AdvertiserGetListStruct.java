/*
 * Marketing API 腾讯广告
 * Marketing API 腾讯广告
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.tencent.bean.account.adAccount;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

import java.util.List;

/**
 *
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-07-12 15:45:19
 */
@Data
public class AdvertiserGetListStruct implements IBean {

  /**
   * 推广帐号 id
   */
  @SerializedName("account_id")
  private Integer accountId = null;

  /**
   * 日预算，单位为分
   */
  @SerializedName("daily_budget")
  private Integer dailyBudget = null;

  /**
   * 客户系统状态，[枚举详情]
   */
  @SerializedName("system_status")
  private String systemStatus = null;

  /**
   * 审核消息
   */
  @SerializedName("reject_message")
  private String rejectMessage = null;

  /**
   * 企业名称
   */
  @SerializedName("corporation_name")
  private String corporationName = null;

  /**
   * 企业营业执照注册号
   */
  @SerializedName("corporation_licence")
  private String corporationLicence = null;

  /**
   * 营业执照/企业资质证明图片 id，通过[images 模块]上传图片后获得
   */
  @SerializedName("certification_image_id")
  private String certificationImageId = null;

  /**
   * 营业执照/企业资质证明图片 URL 地址
   */
  @SerializedName("certification_image")
  private String certificationImage = null;

  /**
   * 身份证号码，如果帐号类型是企业，则为法人身份证号，如果帐号类型是个人，则为个人身份证号
   */
  @SerializedName("identity_number")
  private String identityNumber = null;

  /**
   * 个人身份证明
   */
  @SerializedName("individual_qualification")
  private IndividualQualificationStruct individualQualification = null;

  /**
   * 企业形象名称
   */
  @SerializedName("corporate_image_name")
  private String corporateImageName = null;

  /**
   * 企业形象 LOGO
   */
  @SerializedName("corporate_image_logo")
  private String corporateImageLogo = null;

  /**
   * 行业 id，详见 [行业分类]
   */
  @SerializedName("system_industry_id")
  private Integer systemIndustryId = null;

  /**
   * 调用方行业名称
   */
  @SerializedName("customized_industry")
  private String customizedIndustry = null;

  /**
   * 业务介绍页地址，可填写公司网站、APP 下载页、H5 链接等，作为开户信息参考
   */
  @SerializedName("introduction_url")
  private String introductionUrl = null;

  /**
   * 行业资质图片 id 列表，通过 [images 模块] 上传图片后获得
   */
  @SerializedName("industry_qualification_image_id_list")
  private List<String> industryQualificationImageIdList = null;

  /**
   * 行业资质证明图片 URL 地址
   */
  @SerializedName("industry_qualification_image")
  private List<String> industryQualificationImage = null;

  /**
   * 广告资质图片 id 列表，通过 [images 模块] 上传图片后获得
   */
  @SerializedName("ad_qualification_image_id_list")
  private List<String> adQualificationImageIdList = null;

  /**
   * 广告特殊资质证明图片 URL 地址
   */
  @SerializedName("ad_qualification_image")
  private List<String> adQualificationImage = null;

  /**
   * 联系人姓名
   */
  @SerializedName("contact_person")
  private String contactPerson = null;

  /**
   * 联系人 email
   */
  @SerializedName("contact_person_email")
  private String contactPersonEmail = null;

  /**
   * 联系人座机电话号码，格式为：区号-座机号，例如：0755-8601338
   */
  @SerializedName("contact_person_telephone")
  private String contactPersonTelephone = null;

  /**
   * 联系人手机号码，例如：+8613900000000 或 13900000000
   */
  @SerializedName("contact_person_mobile")
  private String contactPersonMobile = null;

  /**
   * 微信广告开户信息，满足如下条件时使用 输入参数 account_id 不为空时使用 微信公众号开通广告业务或开通通用账号权限
   */
  @SerializedName("wechat_spec")
  private WechatSpecStruct wechatSpec = null;

  /**
   * 推广版位列表，当且仅当输入参数 account_id 不为空时有效，推广版位列表
   */
  @SerializedName("websites")
  private List<WebsitesStruct> websites = null;

  /**
   * 客户主体 id
   */
  @SerializedName("mdm_id")
  private Integer mdmId = null;

  /**
   * 客户主体名称
   */
  @SerializedName("mdm_name")
  private String mdmName = null;

  /**
   * 代理商 account_id
   */
  @SerializedName("agency_account_id")
  private Integer agencyAccountId = null;

  /**
   * 运营人员列表
   */
  @SerializedName("operators")
  private List<OperatorsStruct> operators = null;

  /**
   * 账户备注
   */
  @SerializedName("memo")
  private String memo = null;

  /**
   * 地域信息，具体值参照附录中的 [地域信息]
   */
  @SerializedName("area_code")
  private Integer areaCode = null;

  public AdvertiserGetListStruct accountId (Integer accountId) {
    this.accountId = accountId;
    return this;
  }

  public AdvertiserGetListStruct dailyBudget (Integer dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  public AdvertiserGetListStruct systemStatus (String systemStatus) {
    this.systemStatus = systemStatus;
    return this;
  }

  public AdvertiserGetListStruct rejectMessage (String rejectMessage) {
    this.rejectMessage = rejectMessage;
    return this;
  }

  public AdvertiserGetListStruct corporationName (String corporationName) {
    this.corporationName = corporationName;
    return this;
  }

  public AdvertiserGetListStruct corporationLicence (String corporationLicence) {
    this.corporationLicence = corporationLicence;
    return this;
  }

  public AdvertiserGetListStruct certificationImageId (String certificationImageId) {
    this.certificationImageId = certificationImageId;
    return this;
  }

  public AdvertiserGetListStruct certificationImage (String certificationImage) {
    this.certificationImage = certificationImage;
    return this;
  }

  public AdvertiserGetListStruct identityNumber (String identityNumber) {
    this.identityNumber = identityNumber;
    return this;
  }

  public AdvertiserGetListStruct individualQualification (IndividualQualificationStruct individualQualification) {
    this.individualQualification = individualQualification;
    return this;
  }

  public AdvertiserGetListStruct corporateImageName (String corporateImageName) {
    this.corporateImageName = corporateImageName;
    return this;
  }

  public AdvertiserGetListStruct corporateImageLogo (String corporateImageLogo) {
    this.corporateImageLogo = corporateImageLogo;
    return this;
  }

  public AdvertiserGetListStruct systemIndustryId (Integer systemIndustryId) {
    this.systemIndustryId = systemIndustryId;
    return this;
  }

  public AdvertiserGetListStruct customizedIndustry (String customizedIndustry) {
    this.customizedIndustry = customizedIndustry;
    return this;
  }

  public AdvertiserGetListStruct introductionUrl (String introductionUrl) {
    this.introductionUrl = introductionUrl;
    return this;
  }

  public AdvertiserGetListStruct industryQualificationImageIdList (List<String> industryQualificationImageIdList) {
    this.industryQualificationImageIdList = industryQualificationImageIdList;
    return this;
  }

  public AdvertiserGetListStruct industryQualificationImage (List<String> industryQualificationImage) {
    this.industryQualificationImage = industryQualificationImage;
    return this;
  }

  public AdvertiserGetListStruct adQualificationImageIdList (List<String> adQualificationImageIdList) {
    this.adQualificationImageIdList = adQualificationImageIdList;
    return this;
  }

  public AdvertiserGetListStruct adQualificationImage (List<String> adQualificationImage) {
    this.adQualificationImage = adQualificationImage;
    return this;
  }

  public AdvertiserGetListStruct contactPerson (String contactPerson) {
    this.contactPerson = contactPerson;
    return this;
  }

  public AdvertiserGetListStruct contactPersonEmail (String contactPersonEmail) {
    this.contactPersonEmail = contactPersonEmail;
    return this;
  }

  public AdvertiserGetListStruct contactPersonTelephone (String contactPersonTelephone) {
    this.contactPersonTelephone = contactPersonTelephone;
    return this;
  }

  public AdvertiserGetListStruct contactPersonMobile (String contactPersonMobile) {
    this.contactPersonMobile = contactPersonMobile;
    return this;
  }

  public AdvertiserGetListStruct wechatSpec (WechatSpecStruct wechatSpec) {
    this.wechatSpec = wechatSpec;
    return this;
  }

  public AdvertiserGetListStruct websites (List<WebsitesStruct> websites) {
    this.websites = websites;
    return this;
  }

  public AdvertiserGetListStruct mdmId (Integer mdmId) {
    this.mdmId = mdmId;
    return this;
  }

  public AdvertiserGetListStruct mdmName (String mdmName) {
    this.mdmName = mdmName;
    return this;
  }

  public AdvertiserGetListStruct agencyAccountId (Integer agencyAccountId) {
    this.agencyAccountId = agencyAccountId;
    return this;
  }

  public AdvertiserGetListStruct operators (List<OperatorsStruct> operators) {
    this.operators = operators;
    return this;
  }

  public AdvertiserGetListStruct memo (String memo) {
    this.memo = memo;
    return this;
  }

  public AdvertiserGetListStruct areaCode (Integer areaCode) {
    this.areaCode = areaCode;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
