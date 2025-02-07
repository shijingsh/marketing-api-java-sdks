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

/** 长子链结构 */
@ApiModel(description = "长子链结构")
public class LongSublinkStruct implements IBean {
  @SerializedName("text")
  private String text = null;

  @SerializedName("jump_info")
  private List<LandingPageStructure> jumpInfo = null;

  @SerializedName("tag")
  private String tag = null;

  public LongSublinkStruct text(String text) {
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

  public LongSublinkStruct jumpInfo(List<LandingPageStructure> jumpInfo) {
    this.jumpInfo = jumpInfo;
    return this;
  }

  public LongSublinkStruct addJumpInfoItem(LandingPageStructure jumpInfoItem) {
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

  public LongSublinkStruct tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   *
   * @return tag
   */
  @ApiModelProperty(value = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongSublinkStruct longSublinkStruct = (LongSublinkStruct) o;
    return Objects.equals(this.text, longSublinkStruct.text)
        && Objects.equals(this.jumpInfo, longSublinkStruct.jumpInfo)
        && Objects.equals(this.tag, longSublinkStruct.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, jumpInfo, tag);
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
