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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * CallInRequestsParms
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-03T19:46:33.534Z")
public class CallInRequestsParms {
  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("fromPhoneNumber")
  private String fromPhoneNumber = null;

  @SerializedName("userData")
  private Map<String, Object> userData = null;

  @SerializedName("callbackServiceId")
  private UUID callbackServiceId = null;

  public CallInRequestsParms groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Name of the Click-To-Call-In resource group.
   * @return groupName
  **/
  @ApiModelProperty(required = true, value = "Name of the Click-To-Call-In resource group.")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public CallInRequestsParms fromPhoneNumber(String fromPhoneNumber) {
    this.fromPhoneNumber = fromPhoneNumber;
    return this;
  }

   /**
   * Phone number associated with the request.
   * @return fromPhoneNumber
  **/
  @ApiModelProperty(value = "Phone number associated with the request.")
  public String getFromPhoneNumber() {
    return fromPhoneNumber;
  }

  public void setFromPhoneNumber(String fromPhoneNumber) {
    this.fromPhoneNumber = fromPhoneNumber;
  }

  public CallInRequestsParms userData(Map<String, Object> userData) {
    this.userData = userData;
    return this;
  }

  public CallInRequestsParms putUserDataItem(String key, Object userDataItem) {
    if (this.userData == null) {
      this.userData = new HashMap<String, Object>();
    }
    this.userData.put(key, userDataItem);
    return this;
  }

   /**
   * A hash map of user-specific data associated with the request. System accepts only hash key names that match valid JavaScript variable names and ignores other names. For privacy reasons, the system does not write all the user data in the application&#39;s log files.
   * @return userData
  **/
  @ApiModelProperty(example = "{\"priority\":\"high\",\"email\":\"joe@smith.com\"}", value = "A hash map of user-specific data associated with the request. System accepts only hash key names that match valid JavaScript variable names and ignores other names. For privacy reasons, the system does not write all the user data in the application's log files.")
  public Map<String, Object> getUserData() {
    return userData;
  }

  public void setUserData(Map<String, Object> userData) {
    this.userData = userData;
  }

  public CallInRequestsParms callbackServiceId(UUID callbackServiceId) {
    this.callbackServiceId = callbackServiceId;
    return this;
  }

   /**
   * A valid callback ID that will be associated with this Click-To-Call-In request.
   * @return callbackServiceId
  **/
  @ApiModelProperty(value = "A valid callback ID that will be associated with this Click-To-Call-In request.")
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
    CallInRequestsParms callInRequestsParms = (CallInRequestsParms) o;
    return Objects.equals(this.groupName, callInRequestsParms.groupName) &&
        Objects.equals(this.fromPhoneNumber, callInRequestsParms.fromPhoneNumber) &&
        Objects.equals(this.userData, callInRequestsParms.userData) &&
        Objects.equals(this.callbackServiceId, callInRequestsParms.callbackServiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, fromPhoneNumber, userData, callbackServiceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallInRequestsParms {\n");
    
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    fromPhoneNumber: ").append(toIndentedString(fromPhoneNumber)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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

