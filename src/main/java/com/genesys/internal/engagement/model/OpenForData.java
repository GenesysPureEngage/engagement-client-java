/*
 * Callback and Related APIs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0.000.19.004
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
 * OpenForData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-17T03:24:30.191Z")
public class OpenForData {
  @SerializedName("openFor")
  private BigDecimal openFor = null;

  public OpenForData openFor(BigDecimal openFor) {
    this.openFor = openFor;
    return this;
  }

   /**
   * Time in seconds before the office closes.
   * @return openFor
  **/
  @ApiModelProperty(value = "Time in seconds before the office closes.")
  public BigDecimal getOpenFor() {
    return openFor;
  }

  public void setOpenFor(BigDecimal openFor) {
    this.openFor = openFor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenForData openForData = (OpenForData) o;
    return Objects.equals(this.openFor, openForData.openFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openFor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenForData {\n");
    
    sb.append("    openFor: ").append(toIndentedString(openFor)).append("\n");
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

