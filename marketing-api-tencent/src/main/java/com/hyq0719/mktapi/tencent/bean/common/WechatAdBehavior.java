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

import java.util.ArrayList;
import java.util.List;

/**
 * 微信再营销，原微信广告行为定向升级为微信再营销
 */
public class WechatAdBehavior implements IBean {
  @SerializedName("actions")
  private List<String> actions = null;

  @SerializedName("excluded_actions")
  private List<String> excludedActions = null;

  public WechatAdBehavior actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public WechatAdBehavior addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<String>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * Get actions
   *
   * @return actions
   */
  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public WechatAdBehavior excludedActions(List<String> excludedActions) {
    this.excludedActions = excludedActions;
    return this;
  }

  public WechatAdBehavior addExcludedActionsItem(String excludedActionsItem) {
    if (this.excludedActions == null) {
      this.excludedActions = new ArrayList<String>();
    }
    this.excludedActions.add(excludedActionsItem);
    return this;
  }

  /**
   * Get excludedActions
   *
   * @return excludedActions
   */
  public List<String> getExcludedActions() {
    return excludedActions;
  }

  public void setExcludedActions(List<String> excludedActions) {
    this.excludedActions = excludedActions;
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
