/*
 * Marketing API 巨量引擎
 * Marketing API 巨量引擎
 *
 * Do not edit the class manually.
 */
package com.hyq0719.mktapi.oceanengine.bean.material;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.TokenKey;
import lombok.Data;

import java.util.List;

@Data
public class FileVideoUpdateRequest implements TokenKey {
  /**
   * 广告主ID
   */
  @SerializedName("advertiser_id")
  private Long advertiserId = null;

  /**
   * 限制最多 100 个
   */
  @SerializedName("videos")
  private List<VideosStruct> videos = null;


  public FileVideoUpdateRequest advertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  public FileVideoUpdateRequest videos(List<VideosStruct> videos) {
    this.videos = videos;
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
