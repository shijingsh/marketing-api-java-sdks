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
public class OperatorsStruct {

  /**
   * 运营人员 id
   */
  @SerializedName("operator_id")
  private Integer operatorId = null;

  /**
   * 运营人员名称
   */
  @SerializedName("operator_name")
  private String operatorName = null;

  /**
   * 登录 QQ 号码
   */
  @SerializedName("qq")
  private Integer qq = null;

  /**
   * 微信账号 id：若为微信公众号则为微信公众号 id，若为通用账号则为通用账号 id。
   */
  @SerializedName("wechat_account_id")
  private String wechatAccountId = null;

  /**
   * 是否是主要运营人员，true：是，false：否
   */
  @SerializedName("is_master")
  private Boolean isMaster = null;

  public OperatorsStruct operatorId (Integer operatorId) {
    this.operatorId = operatorId;
    return this;
  }

  public OperatorsStruct operatorName (String operatorName) {
    this.operatorName = operatorName;
    return this;
  }

  public OperatorsStruct qq (Integer qq) {
    this.qq = qq;
    return this;
  }

  public OperatorsStruct wechatAccountId (String wechatAccountId) {
    this.wechatAccountId = wechatAccountId;
    return this;
  }

  public OperatorsStruct isMaster (Boolean isMaster) {
    this.isMaster = isMaster;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
