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

/**
 * QueueStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-11T19:58:42.343Z")
public class QueueStatus {
  @SerializedName("ewt")
  private BigDecimal ewt = null;

  @SerializedName("offerImmediateCallback")
  private Boolean offerImmediateCallback = null;

  @SerializedName("offerScheduledCallback")
  private Boolean offerScheduledCallback = null;

  public QueueStatus ewt(BigDecimal ewt) {
    this.ewt = ewt;
    return this;
  }

   /**
   * Current estimated wait time in seconds. If ewt is -1 and offerImmediateCallback is true, then that indicates that there has not been any interactions on the queue yet. If ewt is -1 and offerImmediateCallback is false, then that indicates that there are no agents logged to the queue.
   * @return ewt
  **/
  @ApiModelProperty(value = "Current estimated wait time in seconds. If ewt is -1 and offerImmediateCallback is true, then that indicates that there has not been any interactions on the queue yet. If ewt is -1 and offerImmediateCallback is false, then that indicates that there are no agents logged to the queue.")
  public BigDecimal getEwt() {
    return ewt;
  }

  public void setEwt(BigDecimal ewt) {
    this.ewt = ewt;
  }

  public QueueStatus offerImmediateCallback(Boolean offerImmediateCallback) {
    this.offerImmediateCallback = offerImmediateCallback;
    return this;
  }

   /**
   * True if the immediateCallbackEnabled setting is true for the queue and if booking an immediate callback at the current time is forecast to be made before the end of the office hours.
   * @return offerImmediateCallback
  **/
  @ApiModelProperty(value = "True if the immediateCallbackEnabled setting is true for the queue and if booking an immediate callback at the current time is forecast to be made before the end of the office hours.")
  public Boolean isOfferImmediateCallback() {
    return offerImmediateCallback;
  }

  public void setOfferImmediateCallback(Boolean offerImmediateCallback) {
    this.offerImmediateCallback = offerImmediateCallback;
  }

  public QueueStatus offerScheduledCallback(Boolean offerScheduledCallback) {
    this.offerScheduledCallback = offerScheduledCallback;
    return this;
  }

   /**
   * True if the scheduledCallbackEnabled setting for the queue is true.
   * @return offerScheduledCallback
  **/
  @ApiModelProperty(value = "True if the scheduledCallbackEnabled setting for the queue is true.")
  public Boolean isOfferScheduledCallback() {
    return offerScheduledCallback;
  }

  public void setOfferScheduledCallback(Boolean offerScheduledCallback) {
    this.offerScheduledCallback = offerScheduledCallback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueStatus queueStatus = (QueueStatus) o;
    return Objects.equals(this.ewt, queueStatus.ewt) &&
        Objects.equals(this.offerImmediateCallback, queueStatus.offerImmediateCallback) &&
        Objects.equals(this.offerScheduledCallback, queueStatus.offerScheduledCallback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ewt, offerImmediateCallback, offerScheduledCallback);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueStatus {\n");
    
    sb.append("    ewt: ").append(toIndentedString(ewt)).append("\n");
    sb.append("    offerImmediateCallback: ").append(toIndentedString(offerImmediateCallback)).append("\n");
    sb.append("    offerScheduledCallback: ").append(toIndentedString(offerScheduledCallback)).append("\n");
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

