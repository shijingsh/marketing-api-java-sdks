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
 * 行为兴趣意向定向
 */
public class BehaviorOrInterest implements IBean {
  @SerializedName("interest")
  private Interest interest = null;

  @SerializedName("behavior")
  private List<BehaviorStruct> behavior = null;

  @SerializedName("intention")
  private Intention intention = null;

  public BehaviorOrInterest interest(Interest interest) {
    this.interest = interest;
    return this;
  }

  /**
   * Get interest
   *
   * @return interest
   */
  public Interest getInterest() {
    return interest;
  }

  public void setInterest(Interest interest) {
    this.interest = interest;
  }

  public BehaviorOrInterest behavior(List<BehaviorStruct> behavior) {
    this.behavior = behavior;
    return this;
  }

  public BehaviorOrInterest addBehaviorItem(BehaviorStruct behaviorItem) {
    if (this.behavior == null) {
      this.behavior = new ArrayList<BehaviorStruct>();
    }
    this.behavior.add(behaviorItem);
    return this;
  }

  /**
   * Get behavior
   *
   * @return behavior
   */
  public List<BehaviorStruct> getBehavior() {
    return behavior;
  }

  public void setBehavior(List<BehaviorStruct> behavior) {
    this.behavior = behavior;
  }

  public BehaviorOrInterest intention(Intention intention) {
    this.intention = intention;
    return this;
  }

  /**
   * Get intention
   *
   * @return intention
   */
  public Intention getIntention() {
    return intention;
  }

  public void setIntention(Intention intention) {
    this.intention = intention;
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
