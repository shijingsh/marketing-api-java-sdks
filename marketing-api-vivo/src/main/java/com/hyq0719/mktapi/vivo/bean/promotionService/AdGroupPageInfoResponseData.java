/*
 * Marketing API Vivo商业开放平台
 * Marketing API Vivo商业开放平台
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.vivo.bean.promotionService;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

import java.util.List;

/**
 * @author hyq0719
 * @email yueqi.huang@qq.com
 * @date 2022-02-08 11:34:09
 */
@Data
public class AdGroupPageInfoResponseData implements IBean {

  /**
   * 分页信息
   */
  @SerializedName("pageInfo")
  private PageInfoStruct pageInfo = null;

  /**
   * 对象数据
   */
  @SerializedName("list")
  private List<AdGroupPageInfoListStruct> list = null;

  public AdGroupPageInfoResponseData pageInfo(PageInfoStruct pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  public AdGroupPageInfoResponseData list(List<AdGroupPageInfoListStruct> list) {
    this.list = list;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
