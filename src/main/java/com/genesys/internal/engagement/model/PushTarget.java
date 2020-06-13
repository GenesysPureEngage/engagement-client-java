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

/**
 * PushTarget
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-11T19:58:42.343Z")
public class PushTarget {
  @SerializedName("channel")
  private String channel = null;

  @SerializedName("target")
  private String target = null;

  public PushTarget channel(String channel) {
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

  public PushTarget target(String target) {
    this.target = target;
    return this;
  }

   /**
   * Token identifying the recipient of the message.
   * @return target
  **/
  @ApiModelProperty(required = true, value = "Token identifying the recipient of the message.")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushTarget pushTarget = (PushTarget) o;
    return Objects.equals(this.channel, pushTarget.channel) &&
        Objects.equals(this.target, pushTarget.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushTarget {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

