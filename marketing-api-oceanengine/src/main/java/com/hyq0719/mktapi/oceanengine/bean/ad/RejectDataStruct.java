package com.hyq0719.mktapi.oceanengine.bean.ad;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

@Data
public class RejectDataStruct implements IBean {
  @SerializedName("reject_item")
  private String rejectItem = null;

  @SerializedName("reject_reason")
  private String rejectReason = null;

  public RejectDataStruct rejectItem(String rejectItem) {
    this.rejectItem = rejectItem;
    return this;
  }

  public RejectDataStruct rejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
