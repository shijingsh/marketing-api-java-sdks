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
public class PageInfoStruct implements IBean {

  /**
   * 搜索页码
   */
  @SerializedName("page")
  private Integer page = null;

  /**
   * 一页显示的数据条数
   */
  @SerializedName("page_size")
  private Integer pageSize = null;

  /**
   * 总条数
   */
  @SerializedName("total_number")
  private Integer totalNumber = null;

  /**
   * 总页数
   */
  @SerializedName("total_page")
  private Integer totalPage = null;

  public PageInfoStruct page (Integer page) {
    this.page = page;
    return this;
  }

  public PageInfoStruct pageSize (Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public PageInfoStruct totalNumber (Integer totalNumber) {
    this.totalNumber = totalNumber;
    return this;
  }

  public PageInfoStruct totalPage (Integer totalPage) {
    this.totalPage = totalPage;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

}
