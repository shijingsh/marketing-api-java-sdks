package com.hyq0719.mktapi.kuaishou.bean.common;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.hyq0719.mktapi.common.bean.CodeKey;
import lombok.Data;

/**
 * KshResponse
 */
@Data
public class KshResponse<T> implements CodeKey {
  @SerializedName("code")
  private Long code = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("data")
  private T data = null;

  @SerializedName("request_id")
  private String requestId = null;

  public KshResponse code(Long code) {
    this.code = code;
    return this;
  }

  public KshResponse message(String message) {
    this.message = message;
    return this;
  }

  public KshResponse data(T data) {
    this.data = data;
    return this;
  }

  public KshResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
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
