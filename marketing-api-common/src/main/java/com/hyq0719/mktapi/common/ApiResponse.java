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

package com.hyq0719.mktapi.common;

import java.util.List;
import java.util.Map;

/**
 * API response returned by API call.
 *
 * @param <T> The type of data that is deserialized from response body
 */
public class ApiResponse<T> {
  private final int statusCode;
  private final Map<String, List<String>> headers;
  private final T data;
  private final String param;
  /**
   * @param statusCode The status code of HTTP response
   * @param headers    The headers of HTTP response
   */
  public ApiResponse(int statusCode, Map<String, List<String>> headers) {
    this(statusCode, headers, null,"");
  }

  /**
   * @param statusCode The status code of HTTP response
   * @param headers    The headers of HTTP response
   * @param data       The object deserialized from response bod
   */
  public ApiResponse(int statusCode, Map<String, List<String>> headers, T data,String param) {
    this.statusCode = statusCode;
    this.headers = headers;
    this.data = data;
    this.param = param;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public Map<String, List<String>> getHeaders() {
    return headers;
  }

  public T getData() {
    return data;
  }

  public String getParam() {
    return param;
  }
}
