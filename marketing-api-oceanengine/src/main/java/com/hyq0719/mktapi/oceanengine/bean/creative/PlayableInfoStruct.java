package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

@Data
public class PlayableInfoStruct implements IBean {
  @SerializedName("playable_url")
  private String playableUrl = null;

  public PlayableInfoStruct playableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
