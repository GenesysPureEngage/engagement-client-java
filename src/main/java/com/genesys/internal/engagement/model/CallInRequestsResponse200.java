/*
 * Callback and Related APIs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0.000.19.015
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.engagement.model;

import java.util.Objects;
import java.util.Arrays;
import com.genesys.internal.engagement.model.CallInRequest;
import com.genesys.internal.engagement.model.SuccessStatus200;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CallInRequestsResponse200
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-23T11:12:19.161Z")
public class CallInRequestsResponse200 {
  @SerializedName("status")
  private SuccessStatus200 status = null;

  @SerializedName("data")
  private CallInRequest data = null;

  public CallInRequestsResponse200 status(SuccessStatus200 status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public SuccessStatus200 getStatus() {
    return status;
  }

  public void setStatus(SuccessStatus200 status) {
    this.status = status;
  }

  public CallInRequestsResponse200 data(CallInRequest data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public CallInRequest getData() {
    return data;
  }

  public void setData(CallInRequest data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallInRequestsResponse200 callInRequestsResponse200 = (CallInRequestsResponse200) o;
    return Objects.equals(this.status, callInRequestsResponse200.status) &&
        Objects.equals(this.data, callInRequestsResponse200.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallInRequestsResponse200 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

