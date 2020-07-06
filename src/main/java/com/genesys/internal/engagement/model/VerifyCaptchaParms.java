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
 * VerifyCaptchaParms
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-02T16:03:45.912Z")
public class VerifyCaptchaParms {
  @SerializedName("siteKey")
  private String siteKey = null;

  @SerializedName("captchaToken")
  private String captchaToken = null;

  public VerifyCaptchaParms siteKey(String siteKey) {
    this.siteKey = siteKey;
    return this;
  }

   /**
   * The public site key for the captcha widget.
   * @return siteKey
  **/
  @ApiModelProperty(required = true, value = "The public site key for the captcha widget.")
  public String getSiteKey() {
    return siteKey;
  }

  public void setSiteKey(String siteKey) {
    this.siteKey = siteKey;
  }

  public VerifyCaptchaParms captchaToken(String captchaToken) {
    this.captchaToken = captchaToken;
    return this;
  }

   /**
   * The response key generated from the user&#39;s captcha interaction.
   * @return captchaToken
  **/
  @ApiModelProperty(required = true, value = "The response key generated from the user's captcha interaction.")
  public String getCaptchaToken() {
    return captchaToken;
  }

  public void setCaptchaToken(String captchaToken) {
    this.captchaToken = captchaToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyCaptchaParms verifyCaptchaParms = (VerifyCaptchaParms) o;
    return Objects.equals(this.siteKey, verifyCaptchaParms.siteKey) &&
        Objects.equals(this.captchaToken, verifyCaptchaParms.captchaToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteKey, captchaToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyCaptchaParms {\n");
    
    sb.append("    siteKey: ").append(toIndentedString(siteKey)).append("\n");
    sb.append("    captchaToken: ").append(toIndentedString(captchaToken)).append("\n");
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

