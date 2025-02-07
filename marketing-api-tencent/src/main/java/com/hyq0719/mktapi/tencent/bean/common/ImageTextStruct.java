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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 图文结构 */
@ApiModel(description = "图文结构")
public class ImageTextStruct implements IBean {
  @SerializedName("image")
  private ImageStruct image = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("jump_info")
  private List<LandingPageStructure> jumpInfo = null;

  public ImageTextStruct image(ImageStruct image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   *
   * @return image
   */
  @ApiModelProperty(value = "")
  public ImageStruct getImage() {
    return image;
  }

  public void setImage(ImageStruct image) {
    this.image = image;
  }

  public ImageTextStruct text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   *
   * @return text
   */
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ImageTextStruct jumpInfo(List<LandingPageStructure> jumpInfo) {
    this.jumpInfo = jumpInfo;
    return this;
  }

  public ImageTextStruct addJumpInfoItem(LandingPageStructure jumpInfoItem) {
    if (this.jumpInfo == null) {
      this.jumpInfo = new ArrayList<LandingPageStructure>();
    }
    this.jumpInfo.add(jumpInfoItem);
    return this;
  }

  /**
   * Get jumpInfo
   *
   * @return jumpInfo
   */
  @ApiModelProperty(value = "")
  public List<LandingPageStructure> getJumpInfo() {
    return jumpInfo;
  }

  public void setJumpInfo(List<LandingPageStructure> jumpInfo) {
    this.jumpInfo = jumpInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageTextStruct imageTextStruct = (ImageTextStruct) o;
    return Objects.equals(this.image, imageTextStruct.image)
        && Objects.equals(this.text, imageTextStruct.text)
        && Objects.equals(this.jumpInfo, imageTextStruct.jumpInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, text, jumpInfo);
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
