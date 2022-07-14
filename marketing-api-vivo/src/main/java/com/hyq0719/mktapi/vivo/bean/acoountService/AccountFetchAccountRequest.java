/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.acoountService;

import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.TokenKey;
import lombok.Data;
import com.google.gson.Gson;

/**
 *
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-07 22:57:50
 */
@Data
public class AccountFetchAccountRequest implements TokenKey {

  @SerializedName("advertiser_id")
  private String advertiserId = null;

  public AccountFetchAccountRequest advertiserId(String advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public String getTokenKey() {
    return String.valueOf(advertiserId);
  }

}
