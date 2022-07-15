/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.acoountService;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;
import com.google.gson.Gson;

/**
 *
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-07 23:14:22
 */
@Data
public class AccountAdvertiserQueryResponseData implements IBean {

  /**
   * 分页信息
   */
  @SerializedName("pageInfo")
  private PageInfoStruct pageInfo = null;

  /**
   * 对象数据
   */
  @SerializedName("list")
  private List<AccountAdvertiserQueryListStruct> list = null;

  public AccountAdvertiserQueryResponseData pageInfo (PageInfoStruct pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  public AccountAdvertiserQueryResponseData list (List<AccountAdvertiserQueryListStruct> list) {
    this.list = list;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
