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
public class IndividualQualificationStruct {

  /**
   * 身份证图片（正面）id，通过 [images 模块] 上传图片后获得，字段长度最小 1 字节，长度最大 64 字节
   */
  @SerializedName("identification_front_image_id")
  private String identificationFrontImageId = null;

  /**
   * 身份证图片（反面）id，通过 [images 模块] 上传图片后获得，字段长度最小 1 字节，长度最大 64 字节
   */
  @SerializedName("identification_back_image_id")
  private String identificationBackImageId = null;

  public IndividualQualificationStruct identificationFrontImageId (String identificationFrontImageId) {
    this.identificationFrontImageId = identificationFrontImageId;
    return this;
  }

  public IndividualQualificationStruct identificationBackImageId (String identificationBackImageId) {
    this.identificationBackImageId = identificationBackImageId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
