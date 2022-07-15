package com.hyq0719.mktapi.kuaishou.bean.campaign;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

import java.util.List;

@Data
public class CampaignUpdateStatusResponseStruct implements IBean {
  @SerializedName("campaign_ids")
  private List<Long> campaignIds = null;

  public CampaignUpdateStatusResponseStruct campaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
