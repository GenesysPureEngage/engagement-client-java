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
 * SuccessStatus200
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-04T15:11:16.761Z")
public class SuccessStatus200 {
  @SerializedName("code")
  private BigDecimal code = null;

  @SerializedName("message")
  private String message = "Successful";

  @SerializedName("corrId")
  private UUID corrId = null;

  public SuccessStatus200 code(BigDecimal code) {
    this.code = code;
    return this;
  }

   /**
   * GES Status code.
   * @return code
  **/
  @ApiModelProperty(example = "0 - SUCCESS", value = "GES Status code.")
  public BigDecimal getCode() {
    return code;
  }

  public void setCode(BigDecimal code) {
    this.code = code;
  }

  public SuccessStatus200 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "Successful", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SuccessStatus200 corrId(UUID corrId) {
    this.corrId = corrId;
    return this;
  }

   /**
   * Server-side correlation ID associated with the request.
   * @return corrId
  **/
  @ApiModelProperty(value = "Server-side correlation ID associated with the request.")
  public UUID getCorrId() {
    return corrId;
  }

  public void setCorrId(UUID corrId) {
    this.corrId = corrId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessStatus200 successStatus200 = (SuccessStatus200) o;
    return Objects.equals(this.code, successStatus200.code) &&
        Objects.equals(this.message, successStatus200.message) &&
        Objects.equals(this.corrId, successStatus200.corrId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, corrId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessStatus200 {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    corrId: ").append(toIndentedString(corrId)).append("\n");
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

