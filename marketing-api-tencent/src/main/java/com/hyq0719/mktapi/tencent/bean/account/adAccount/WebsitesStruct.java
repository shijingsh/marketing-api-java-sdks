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

/**
 *
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-07-12 15:45:19
 */
@Data
public class WebsitesStruct implements IBean {

  /**
   * 推广版位域名，无需 http 前缀，如 www.qq.com
   */
  @SerializedName("website_domain")
  private String websiteDomain = null;

  /**
   * 网站 icp 备案证书扫描图片，通过 [images 模块] 上传图片后获得
   */
  @SerializedName("icp_image_id")
  private String icpImageId = null;

  /**
   * 推广版位系统状态，[枚举详情]
   */
  @SerializedName("system_status")
  private String systemStatus = null;

  /**
   * 审核消息
   */
  @SerializedName("reject_message")
  private String rejectMessage = null;

  public WebsitesStruct websiteDomain (String websiteDomain) {
    this.websiteDomain = websiteDomain;
    return this;
  }

  public WebsitesStruct icpImageId (String icpImageId) {
    this.icpImageId = icpImageId;
    return this;
  }

  public WebsitesStruct systemStatus (String systemStatus) {
    this.systemStatus = systemStatus;
    return this;
  }

  public WebsitesStruct rejectMessage (String rejectMessage) {
    this.rejectMessage = rejectMessage;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
