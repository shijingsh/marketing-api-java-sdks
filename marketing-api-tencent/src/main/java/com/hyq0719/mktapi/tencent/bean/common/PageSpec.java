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


/**
 * 落地页信息
 */
public class PageSpec implements IBean {
  @SerializedName("page_id")
  private Long pageId = null;

  @SerializedName("page_url")
  private String pageUrl = null;

  @SerializedName("mini_program_spec")
  private AdcreativeMiniProgramSpec miniProgramSpec = null;

  @SerializedName("mini_game_spec")
  private MiniGameSpec miniGameSpec = null;

  @SerializedName("override_canvas_head_option")
  private String overrideCanvasHeadOption = null;

  public PageSpec pageId(Long pageId) {
    this.pageId = pageId;
    return this;
  }

  /**
   * Get pageId
   *
   * @return pageId
   */
  public Long getPageId() {
    return pageId;
  }

  public void setPageId(Long pageId) {
    this.pageId = pageId;
  }

  public PageSpec pageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
    return this;
  }

  /**
   * Get pageUrl
   *
   * @return pageUrl
   */
  public String getPageUrl() {
    return pageUrl;
  }

  public void setPageUrl(String pageUrl) {
    this.pageUrl = pageUrl;
  }

  public PageSpec miniProgramSpec(AdcreativeMiniProgramSpec miniProgramSpec) {
    this.miniProgramSpec = miniProgramSpec;
    return this;
  }

  /**
   * Get miniProgramSpec
   *
   * @return miniProgramSpec
   */
  public AdcreativeMiniProgramSpec getMiniProgramSpec() {
    return miniProgramSpec;
  }

  public void setMiniProgramSpec(AdcreativeMiniProgramSpec miniProgramSpec) {
    this.miniProgramSpec = miniProgramSpec;
  }

  public PageSpec miniGameSpec(MiniGameSpec miniGameSpec) {
    this.miniGameSpec = miniGameSpec;
    return this;
  }

  /**
   * Get miniGameSpec
   *
   * @return miniGameSpec
   */
  public MiniGameSpec getMiniGameSpec() {
    return miniGameSpec;
  }

  public void setMiniGameSpec(MiniGameSpec miniGameSpec) {
    this.miniGameSpec = miniGameSpec;
  }

  public PageSpec overrideCanvasHeadOption(String overrideCanvasHeadOption) {
    this.overrideCanvasHeadOption = overrideCanvasHeadOption;
    return this;
  }

  /**
   * Get overrideCanvasHeadOption
   *
   * @return overrideCanvasHeadOption
   */
  public String getOverrideCanvasHeadOption() {
    return overrideCanvasHeadOption;
  }

  public void setOverrideCanvasHeadOption(String overrideCanvasHeadOption) {
    this.overrideCanvasHeadOption = overrideCanvasHeadOption;
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
