/*
 * Callback and Related APIs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0.000.19.016
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.engagement.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * EstimatedWaitTime
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-03T19:46:33.534Z")
public class EstimatedWaitTime {
  @SerializedName("virtualQueue")
  private String virtualQueue = null;

  @SerializedName("estimatedWaitTime")
  private BigDecimal estimatedWaitTime = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("resultCode")
  private BigDecimal resultCode = null;

  public EstimatedWaitTime virtualQueue(String virtualQueue) {
    this.virtualQueue = virtualQueue;
    return this;
  }

   /**
   * Name of the virtual queue
   * @return virtualQueue
  **/
  @ApiModelProperty(required = true, value = "Name of the virtual queue")
  public String getVirtualQueue() {
    return virtualQueue;
  }

  public void setVirtualQueue(String virtualQueue) {
    this.virtualQueue = virtualQueue;
  }

  public EstimatedWaitTime estimatedWaitTime(BigDecimal estimatedWaitTime) {
    this.estimatedWaitTime = estimatedWaitTime;
    return this;
  }

   /**
   * Estimated wait time (in seconds) for the call. If unknown, this value is set to -1.
   * @return estimatedWaitTime
  **/
  @ApiModelProperty(required = true, value = "Estimated wait time (in seconds) for the call. If unknown, this value is set to -1.")
  public BigDecimal getEstimatedWaitTime() {
    return estimatedWaitTime;
  }

  public void setEstimatedWaitTime(BigDecimal estimatedWaitTime) {
    this.estimatedWaitTime = estimatedWaitTime;
  }

  public EstimatedWaitTime message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Contains the reason why the Estimated wait time can not be obtained.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "Contains the reason why the Estimated wait time can not be obtained.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public EstimatedWaitTime resultCode(BigDecimal resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * 0 for valid estimatedWaitTime, -1 if there have been no interactions in the VQ so the EWT is unknown, -2 if there are no agents logged in for this queue
   * @return resultCode
  **/
  @ApiModelProperty(required = true, value = "0 for valid estimatedWaitTime, -1 if there have been no interactions in the VQ so the EWT is unknown, -2 if there are no agents logged in for this queue")
  public BigDecimal getResultCode() {
    return resultCode;
  }

  public void setResultCode(BigDecimal resultCode) {
    this.resultCode = resultCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimatedWaitTime estimatedWaitTime = (EstimatedWaitTime) o;
    return Objects.equals(this.virtualQueue, estimatedWaitTime.virtualQueue) &&
        Objects.equals(this.estimatedWaitTime, estimatedWaitTime.estimatedWaitTime) &&
        Objects.equals(this.message, estimatedWaitTime.message) &&
        Objects.equals(this.resultCode, estimatedWaitTime.resultCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(virtualQueue, estimatedWaitTime, message, resultCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimatedWaitTime {\n");
    
    sb.append("    virtualQueue: ").append(toIndentedString(virtualQueue)).append("\n");
    sb.append("    estimatedWaitTime: ").append(toIndentedString(estimatedWaitTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
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

