package com.hyq0719.mktapi.kuaishou.bean.campaign;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

@Data
public class CampaignUpdateResponseStruct implements IBean {
  @SerializedName("campaign_id")
  private Long campaignId = null;

  public CampaignUpdateResponseStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
