/*
 * Callback and Related APIs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0.000.19.013
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
import org.threeten.bp.OffsetDateTime;

/**
 * Slot
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-24T21:45:14.209Z")
public class Slot {
  @SerializedName("utcTime")
  private OffsetDateTime utcTime = null;

  @SerializedName("localTime")
  private OffsetDateTime localTime = null;

  @SerializedName("capacity")
  private BigDecimal capacity = null;

  @SerializedName("total")
  private BigDecimal total = null;

  public Slot utcTime(OffsetDateTime utcTime) {
    this.utcTime = utcTime;
    return this;
  }

   /**
   * Get utcTime
   * @return utcTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUtcTime() {
    return utcTime;
  }

  public void setUtcTime(OffsetDateTime utcTime) {
    this.utcTime = utcTime;
  }

  public Slot localTime(OffsetDateTime localTime) {
    this.localTime = localTime;
    return this;
  }

   /**
   * Get localTime
   * @return localTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLocalTime() {
    return localTime;
  }

  public void setLocalTime(OffsetDateTime localTime) {
    this.localTime = localTime;
  }

  public Slot capacity(BigDecimal capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * @return capacity
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCapacity() {
    return capacity;
  }

  public void setCapacity(BigDecimal capacity) {
    this.capacity = capacity;
  }

  public Slot total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Slot slot = (Slot) o;
    return Objects.equals(this.utcTime, slot.utcTime) &&
        Objects.equals(this.localTime, slot.localTime) &&
        Objects.equals(this.capacity, slot.capacity) &&
        Objects.equals(this.total, slot.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utcTime, localTime, capacity, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Slot {\n");
    
    sb.append("    utcTime: ").append(toIndentedString(utcTime)).append("\n");
    sb.append("    localTime: ").append(toIndentedString(localTime)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

