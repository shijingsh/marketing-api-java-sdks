package com.hyq0719.mktapi.oceanengine.bean.creative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import lombok.Data;

@Data
public class VideoInfoStruct implements IBean {
  @SerializedName("video_id")
  private String videoId = null;

  public VideoInfoStruct videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }
}
