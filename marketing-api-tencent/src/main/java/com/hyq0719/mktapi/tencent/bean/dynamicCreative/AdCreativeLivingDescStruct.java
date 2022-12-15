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

package com.hyq0719.mktapi.tencent.bean.dynamicCreative;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.IBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 轮播文案 */
@ApiModel(description = "轮播文案")
public class AdCreativeLivingDescStruct implements IBean {
  @SerializedName("living_desc_struct_switch")
  private Boolean livingDescStructSwitch = null;

  @SerializedName("living_desc_list")
  private List<String> livingDescList = null;

  public AdCreativeLivingDescStruct livingDescStructSwitch(Boolean livingDescStructSwitch) {
    this.livingDescStructSwitch = livingDescStructSwitch;
    return this;
  }

  /**
   * Get livingDescStructSwitch
   *
   * @return livingDescStructSwitch
   */
  @ApiModelProperty(value = "")
  public Boolean isLivingDescStructSwitch() {
    return livingDescStructSwitch;
  }

  public void setLivingDescStructSwitch(Boolean livingDescStructSwitch) {
    this.livingDescStructSwitch = livingDescStructSwitch;
  }

  public AdCreativeLivingDescStruct livingDescList(List<String> livingDescList) {
    this.livingDescList = livingDescList;
    return this;
  }

  public AdCreativeLivingDescStruct addLivingDescListItem(String livingDescListItem) {
    if (this.livingDescList == null) {
      this.livingDescList = new ArrayList<String>();
    }
    this.livingDescList.add(livingDescListItem);
    return this;
  }

  /**
   * Get livingDescList
   *
   * @return livingDescList
   */
  @ApiModelProperty(value = "")
  public List<String> getLivingDescList() {
    return livingDescList;
  }

  public void setLivingDescList(List<String> livingDescList) {
    this.livingDescList = livingDescList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdCreativeLivingDescStruct adCreativeLivingDescStruct = (AdCreativeLivingDescStruct) o;
    return Objects.equals(
            this.livingDescStructSwitch, adCreativeLivingDescStruct.livingDescStructSwitch)
        && Objects.equals(this.livingDescList, adCreativeLivingDescStruct.livingDescList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(livingDescStructSwitch, livingDescList);
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
