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
 * ApiErrorStruct
 */
public class ApiErrorStruct implements IBean {
  @SerializedName("type")
  private String type = null;

  @SerializedName("common_param_exception_spec")
  private CommonParamExceptionSpec commonParamExceptionSpec = null;

  public ApiErrorStruct type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ApiErrorStruct commonParamExceptionSpec(
    CommonParamExceptionSpec commonParamExceptionSpec) {
    this.commonParamExceptionSpec = commonParamExceptionSpec;
    return this;
  }

  /**
   * Get commonParamExceptionSpec
   *
   * @return commonParamExceptionSpec
   */
  public CommonParamExceptionSpec getCommonParamExceptionSpec() {
    return commonParamExceptionSpec;
  }

  public void setCommonParamExceptionSpec(CommonParamExceptionSpec commonParamExceptionSpec) {
    this.commonParamExceptionSpec = commonParamExceptionSpec;
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
