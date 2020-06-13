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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * CallInRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-11T19:58:42.343Z")
public class CallInRequest {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("toPhoneNumber")
  private String toPhoneNumber = null;

  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("expirationTime")
  private BigDecimal expirationTime = null;

  @SerializedName("accessCode")
  private BigDecimal accessCode = null;

  @SerializedName("fromPhoneNumber")
  private String fromPhoneNumber = null;

  @SerializedName("callbackServiceId")
  private UUID callbackServiceId = null;

  public CallInRequest id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The Click-To-Call-In request ID.
   * @return id
  **/
  @ApiModelProperty(example = "8c78d4e1-c85a-424b-8334-5ff36e07372f", value = "The Click-To-Call-In request ID.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public CallInRequest toPhoneNumber(String toPhoneNumber) {
    this.toPhoneNumber = toPhoneNumber;
    return this;
  }

   /**
   * Phone number to call.
   * @return toPhoneNumber
  **/
  @ApiModelProperty(example = "+19059680004", value = "Phone number to call.")
  public String getToPhoneNumber() {
    return toPhoneNumber;
  }

  public void setToPhoneNumber(String toPhoneNumber) {
    this.toPhoneNumber = toPhoneNumber;
  }

  public CallInRequest groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Name of the Click-To-Call-In resource group.
   * @return groupName
  **/
  @ApiModelProperty(example = "technical_help", value = "Name of the Click-To-Call-In resource group.")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public CallInRequest expirationTime(BigDecimal expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * Expiration time of the request in epoch time format.
   * @return expirationTime
  **/
  @ApiModelProperty(example = "1.53781992821E11", value = "Expiration time of the request in epoch time format.")
  public BigDecimal getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(BigDecimal expirationTime) {
    this.expirationTime = expirationTime;
  }

  public CallInRequest accessCode(BigDecimal accessCode) {
    this.accessCode = accessCode;
    return this;
  }

   /**
   * Access code to use.
   * @return accessCode
  **/
  @ApiModelProperty(example = "123456.0", value = "Access code to use.")
  public BigDecimal getAccessCode() {
    return accessCode;
  }

  public void setAccessCode(BigDecimal accessCode) {
    this.accessCode = accessCode;
  }

  public CallInRequest fromPhoneNumber(String fromPhoneNumber) {
    this.fromPhoneNumber = fromPhoneNumber;
    return this;
  }

   /**
   * Phone number associated with the request.
   * @return fromPhoneNumber
  **/
  @ApiModelProperty(example = "9059683457", value = "Phone number associated with the request.")
  public String getFromPhoneNumber() {
    return fromPhoneNumber;
  }

  public void setFromPhoneNumber(String fromPhoneNumber) {
    this.fromPhoneNumber = fromPhoneNumber;
  }

  public CallInRequest callbackServiceId(UUID callbackServiceId) {
    this.callbackServiceId = callbackServiceId;
    return this;
  }

   /**
   * Callback ID associated with the request.
   * @return callbackServiceId
  **/
  @ApiModelProperty(value = "Callback ID associated with the request.")
  public UUID getCallbackServiceId() {
    return callbackServiceId;
  }

  public void setCallbackServiceId(UUID callbackServiceId) {
    this.callbackServiceId = callbackServiceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallInRequest callInRequest = (CallInRequest) o;
    return Objects.equals(this.id, callInRequest.id) &&
        Objects.equals(this.toPhoneNumber, callInRequest.toPhoneNumber) &&
        Objects.equals(this.groupName, callInRequest.groupName) &&
        Objects.equals(this.expirationTime, callInRequest.expirationTime) &&
        Objects.equals(this.accessCode, callInRequest.accessCode) &&
        Objects.equals(this.fromPhoneNumber, callInRequest.fromPhoneNumber) &&
        Objects.equals(this.callbackServiceId, callInRequest.callbackServiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, toPhoneNumber, groupName, expirationTime, accessCode, fromPhoneNumber, callbackServiceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallInRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    toPhoneNumber: ").append(toIndentedString(toPhoneNumber)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    fromPhoneNumber: ").append(toIndentedString(fromPhoneNumber)).append("\n");
    sb.append("    callbackServiceId: ").append(toIndentedString(callbackServiceId)).append("\n");
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

