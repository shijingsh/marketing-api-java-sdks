/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.hyq0719.mktapi.tencent.bean.common;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** 视频组件 */
@ApiModel(description = "视频组件")
public class VideoValueStruct implements IBean {
  @SerializedName("video")
  private VideoStruct video = null;

  @SerializedName("cover_image")
  private ImageStruct coverImage = null;

  public VideoValueStruct video(VideoStruct video) {
    this.video = video;
    return this;
  }

  /**
   * Get video
   *
   * @return video
   */
  @ApiModelProperty(value = "")
  public VideoStruct getVideo() {
    return video;
  }

  public void setVideo(VideoStruct video) {
    this.video = video;
  }

  public VideoValueStruct coverImage(ImageStruct coverImage) {
    this.coverImage = coverImage;
    return this;
  }

  /**
   * Get coverImage
   *
   * @return coverImage
   */
  @ApiModelProperty(value = "")
  public ImageStruct getCoverImage() {
    return coverImage;
  }

  public void setCoverImage(ImageStruct coverImage) {
    this.coverImage = coverImage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoValueStruct videoValueStruct = (VideoValueStruct) o;
    return Objects.equals(this.video, videoValueStruct.video)
        && Objects.equals(this.coverImage, videoValueStruct.coverImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(video, coverImage);
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
