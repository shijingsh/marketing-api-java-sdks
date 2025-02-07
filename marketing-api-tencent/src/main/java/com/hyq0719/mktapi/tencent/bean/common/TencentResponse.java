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
import com.hyq0719.mktapi.common.bean.CodeKey;
import com.xiushang.common.intf.Response;

import java.util.ArrayList;
import java.util.List;


/**
 * CampaignsAddResponse
 */
public class TencentResponse<T> implements CodeKey, Response<T> {
  @SerializedName("code")
  private Long code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("message_cn")
  private String messageCn = null;

  @SerializedName("errors")
  private List<ApiErrorStruct> errors = null;

  @SerializedName("data")
  private T data = null;

  public TencentResponse code(Long code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   *
   * @return code
   */
  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public TencentResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   *
   * @return message
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public TencentResponse messageCn(String messageCn) {
    this.messageCn = messageCn;
    return this;
  }

  /**
   * Get messageCn
   *
   * @return messageCn
   */
  public String getMessageCn() {
    return messageCn;
  }

  public void setMessageCn(String messageCn) {
    this.messageCn = messageCn;
  }

  public TencentResponse errors(List<ApiErrorStruct> errors) {
    this.errors = errors;
    return this;
  }

  public TencentResponse addErrorsItem(ApiErrorStruct errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ApiErrorStruct>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   *
   * @return errors
   */
  public List<ApiErrorStruct> getErrors() {
    return errors;
  }

  public void setErrors(List<ApiErrorStruct> errors) {
    this.errors = errors;
  }

  public TencentResponse data(T data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   *
   * @return data
   */
  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  @Override
  public Long getCodeKey() {
    return code;
  }

  @Override
  public String getMsg() {
    return message;
  }

  public boolean isSuccessful() {
    return code.equals(0L);
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

  @Override
  public int code() {
    if(code==null){
      return 0;
    }
    return code.intValue();
  }

  @Override
  public String message() {
    return message;
  }

  @Override
  public T data() {
    return data;
  }
}
