package com.hyq0719.mktapi.tencent.bean.common;

import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;

import java.util.List;

public class ResponseListData<T> implements IBean {
  @SerializedName("list")
  private List<T> list;

  public ResponseListData(List<T> list) {
    this.list = list;
  }

  public List<T> getList() {
    return list;
  }

  public void setList(List<T> list) {
    this.list = list;
  }
}
