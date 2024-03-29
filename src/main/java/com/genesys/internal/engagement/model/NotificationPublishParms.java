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

/**
 * NotificationPublishParms
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-03T19:46:33.534Z")
public class NotificationPublishParms {
  @SerializedName("channel")
  private String channel = null;

  @SerializedName("target")
  private String target = null;

  @SerializedName("event")
  private String event = null;

  @SerializedName("validate_only")
  private Boolean validateOnly = null;

  public NotificationPublishParms channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Channel name. The only accepted value is &#39;FCM&#39; for now.
   * @return channel
  **/
  @ApiModelProperty(example = "FCM", required = true, value = "Channel name. The only accepted value is 'FCM' for now.")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public NotificationPublishParms target(String target) {
    this.target = target;
    return this;
  }

   /**
   * Unique identifier of the recipient of the message. For FCM, this is the &#39;registration token&#39;.
   * @return target
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the recipient of the message. For FCM, this is the 'registration token'.")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public NotificationPublishParms event(String event) {
    this.event = event;
    return this;
  }

   /**
   * notification object as documented by Firebase Messaging
   * @return event
  **/
  @ApiModelProperty(example = "", required = true, value = "notification object as documented by Firebase Messaging")
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public NotificationPublishParms validateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
  }

   /**
   * Enables a dry-run option provided by Firebase. When enabled Firebase validates credentials, recipient, and message structure, but doesn&#39;t actually deliver the message.
   * @return validateOnly
  **/
  @ApiModelProperty(value = "Enables a dry-run option provided by Firebase. When enabled Firebase validates credentials, recipient, and message structure, but doesn't actually deliver the message.")
  public Boolean isValidateOnly() {
    return validateOnly;
  }

  public void setValidateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationPublishParms notificationPublishParms = (NotificationPublishParms) o;
    return Objects.equals(this.channel, notificationPublishParms.channel) &&
        Objects.equals(this.target, notificationPublishParms.target) &&
        Objects.equals(this.event, notificationPublishParms.event) &&
        Objects.equals(this.validateOnly, notificationPublishParms.validateOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, target, event, validateOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationPublishParms {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    validateOnly: ").append(toIndentedString(validateOnly)).append("\n");
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

