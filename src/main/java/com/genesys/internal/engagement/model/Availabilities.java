/*
 * Callback and Related APIs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0.000.19.012
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.engagement.model;

import java.util.Objects;
import java.util.Arrays;
import com.genesys.internal.engagement.model.Slot;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Availabilities
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-17T21:31:18.919Z")
public class Availabilities {
  @SerializedName("slots")
  private List<Slot> slots = null;

  @SerializedName("durationMin")
  private BigDecimal durationMin = null;

  @SerializedName("timezone")
  private String timezone = null;

  public Availabilities slots(List<Slot> slots) {
    this.slots = slots;
    return this;
  }

  public Availabilities addSlotsItem(Slot slotsItem) {
    if (this.slots == null) {
      this.slots = new ArrayList<Slot>();
    }
    this.slots.add(slotsItem);
    return this;
  }

   /**
   * Get slots
   * @return slots
  **/
  @ApiModelProperty(value = "")
  public List<Slot> getSlots() {
    return slots;
  }

  public void setSlots(List<Slot> slots) {
    this.slots = slots;
  }

  public Availabilities durationMin(BigDecimal durationMin) {
    this.durationMin = durationMin;
    return this;
  }

   /**
   * Get durationMin
   * @return durationMin
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDurationMin() {
    return durationMin;
  }

  public void setDurationMin(BigDecimal durationMin) {
    this.durationMin = durationMin;
  }

  public Availabilities timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * For a list of possible values, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
   * @return timezone
  **/
  @ApiModelProperty(value = "For a list of possible values, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Availabilities availabilities = (Availabilities) o;
    return Objects.equals(this.slots, availabilities.slots) &&
        Objects.equals(this.durationMin, availabilities.durationMin) &&
        Objects.equals(this.timezone, availabilities.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slots, durationMin, timezone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Availabilities {\n");
    
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
    sb.append("    durationMin: ").append(toIndentedString(durationMin)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

