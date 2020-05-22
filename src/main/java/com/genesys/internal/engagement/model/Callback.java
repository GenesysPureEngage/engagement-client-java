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
import org.threeten.bp.OffsetDateTime;

/**
 * Callback
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T15:28:46.182Z")
public class Callback {
  @SerializedName("id")
  private UUID id = null;

  @SerializedName("desiredTime")
  private OffsetDateTime desiredTime = null;

  @SerializedName("callbackState")
  private String callbackState = null;

  @SerializedName("callbackReason")
  private String callbackReason = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("positionInQueue")
  private BigDecimal positionInQueue = null;

  @SerializedName("estimatedWaitTime")
  private BigDecimal estimatedWaitTime = null;

  public Callback id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The callback ID.
   * @return id
  **/
  @ApiModelProperty(value = "The callback ID.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Callback desiredTime(OffsetDateTime desiredTime) {
    this.desiredTime = desiredTime;
    return this;
  }

   /**
   * Desired time of the callback in UTC.
   * @return desiredTime
  **/
  @ApiModelProperty(value = "Desired time of the callback in UTC.")
  public OffsetDateTime getDesiredTime() {
    return desiredTime;
  }

  public void setDesiredTime(OffsetDateTime desiredTime) {
    this.desiredTime = desiredTime;
  }

  public Callback callbackState(String callbackState) {
    this.callbackState = callbackState;
    return this;
  }

   /**
   * Current state of the callback. Possible values are - SCHEDULED, QUEUED, ROUTING, PROCESSING, COMPLETED.
   * @return callbackState
  **/
  @ApiModelProperty(value = "Current state of the callback. Possible values are - SCHEDULED, QUEUED, ROUTING, PROCESSING, COMPLETED.")
  public String getCallbackState() {
    return callbackState;
  }

  public void setCallbackState(String callbackState) {
    this.callbackState = callbackState;
  }

  public Callback callbackReason(String callbackReason) {
    this.callbackReason = callbackReason;
    return this;
  }

   /**
   * Provides a reason for completion. This is only provided if the callback is in a COMPLETED state.
   * @return callbackReason
  **/
  @ApiModelProperty(value = "Provides a reason for completion. This is only provided if the callback is in a COMPLETED state.")
  public String getCallbackReason() {
    return callbackReason;
  }

  public void setCallbackReason(String callbackReason) {
    this.callbackReason = callbackReason;
  }

  public Callback phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Number to call back.
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Number to call back.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Callback positionInQueue(BigDecimal positionInQueue) {
    this.positionInQueue = positionInQueue;
    return this;
  }

   /**
   * Position in queue. This property is only provided if the callback is in one of the following state - QUEUED, ROUTING, or PROCESSING.
   * @return positionInQueue
  **/
  @ApiModelProperty(value = "Position in queue. This property is only provided if the callback is in one of the following state - QUEUED, ROUTING, or PROCESSING.")
  public BigDecimal getPositionInQueue() {
    return positionInQueue;
  }

  public void setPositionInQueue(BigDecimal positionInQueue) {
    this.positionInQueue = positionInQueue;
  }

  public Callback estimatedWaitTime(BigDecimal estimatedWaitTime) {
    this.estimatedWaitTime = estimatedWaitTime;
    return this;
  }

   /**
   * Expected waiting time (in seconds). This property is only provided if the callback is in one of the following state - QUEUED, ROUTING, or PROCESSING.
   * @return estimatedWaitTime
  **/
  @ApiModelProperty(value = "Expected waiting time (in seconds). This property is only provided if the callback is in one of the following state - QUEUED, ROUTING, or PROCESSING.")
  public BigDecimal getEstimatedWaitTime() {
    return estimatedWaitTime;
  }

  public void setEstimatedWaitTime(BigDecimal estimatedWaitTime) {
    this.estimatedWaitTime = estimatedWaitTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Callback callback = (Callback) o;
    return Objects.equals(this.id, callback.id) &&
        Objects.equals(this.desiredTime, callback.desiredTime) &&
        Objects.equals(this.callbackState, callback.callbackState) &&
        Objects.equals(this.callbackReason, callback.callbackReason) &&
        Objects.equals(this.phoneNumber, callback.phoneNumber) &&
        Objects.equals(this.positionInQueue, callback.positionInQueue) &&
        Objects.equals(this.estimatedWaitTime, callback.estimatedWaitTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, desiredTime, callbackState, callbackReason, phoneNumber, positionInQueue, estimatedWaitTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Callback {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    desiredTime: ").append(toIndentedString(desiredTime)).append("\n");
    sb.append("    callbackState: ").append(toIndentedString(callbackState)).append("\n");
    sb.append("    callbackReason: ").append(toIndentedString(callbackReason)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    positionInQueue: ").append(toIndentedString(positionInQueue)).append("\n");
    sb.append("    estimatedWaitTime: ").append(toIndentedString(estimatedWaitTime)).append("\n");
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

