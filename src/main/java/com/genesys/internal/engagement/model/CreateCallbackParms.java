/*
 * Callback and Related APIs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0.000.19.007
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.engagement.model;

import java.util.Objects;
import java.util.Arrays;
import com.genesys.internal.engagement.model.PushTarget;
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
import org.threeten.bp.OffsetDateTime;

/**
 * CreateCallbackParms
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-20T13:37:22.453Z")
public class CreateCallbackParms {
  @SerializedName("serviceName")
  private String serviceName = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("desiredTime")
  private OffsetDateTime desiredTime = null;

  @SerializedName("cbOfferType")
  private String cbOfferType = "ASAP if the request does not include the desiredTime parameter and SCHEDULED if the request includes the desiredTime parameter.";

  @SerializedName("language")
  private String language = "en-US";

  @SerializedName("inboundVQ")
  private String inboundVQ = null;

  @SerializedName("offerThreshold")
  private BigDecimal offerThreshold = null;

  @SerializedName("channel")
  private String channel = null;

  @SerializedName("offerTiming")
  private String offerTiming = null;

  @SerializedName("cbOriginationIxnId")
  private String cbOriginationIxnId = null;

  @SerializedName("surveyRP")
  private String surveyRP = null;

  @SerializedName("priority")
  private BigDecimal priority = null;

  @SerializedName("routePoint")
  private String routePoint = null;

  @SerializedName("userData")
  private String userData = null;

  @SerializedName("captchaToken")
  private String captchaToken = null;

  @SerializedName("pushTargets")
  private List<PushTarget> pushTargets = null;

  public CreateCallbackParms serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Name of the callback execution service provisioned in GES.
   * @return serviceName
  **/
  @ApiModelProperty(required = true, value = "Name of the callback execution service provisioned in GES.")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public CreateCallbackParms phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Number to call back.
   * @return phoneNumber
  **/
  @ApiModelProperty(required = true, value = "Number to call back.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CreateCallbackParms desiredTime(OffsetDateTime desiredTime) {
    this.desiredTime = desiredTime;
    return this;
  }

   /**
   * Desired time to have the callback. By default, the desired time is the current time. This option format is ISO 8601 yyyy-MM-ddTHH:mm:ss.SSSZ such as 2013-05-28T15:30:00.000Z.
   * @return desiredTime
  **/
  @ApiModelProperty(value = "Desired time to have the callback. By default, the desired time is the current time. This option format is ISO 8601 yyyy-MM-ddTHH:mm:ss.SSSZ such as 2013-05-28T15:30:00.000Z.")
  public OffsetDateTime getDesiredTime() {
    return desiredTime;
  }

  public void setDesiredTime(OffsetDateTime desiredTime) {
    this.desiredTime = desiredTime;
  }

  public CreateCallbackParms cbOfferType(String cbOfferType) {
    this.cbOfferType = cbOfferType;
    return this;
  }

   /**
   * Type of callback that was originally offered and accepted by the customer. Possible values are ASAP, SCHEDULED, COMBINED_SCHEDULED_AND_ASAP. Note that this is used for reporting purposes only.
   * @return cbOfferType
  **/
  @ApiModelProperty(value = "Type of callback that was originally offered and accepted by the customer. Possible values are ASAP, SCHEDULED, COMBINED_SCHEDULED_AND_ASAP. Note that this is used for reporting purposes only.")
  public String getCbOfferType() {
    return cbOfferType;
  }

  public void setCbOfferType(String cbOfferType) {
    this.cbOfferType = cbOfferType;
  }

  public CreateCallbackParms language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Preferred language for voice prompts in Designer&#39;s format. It needs to be in the ISO-639-1 format for the first part (indicating the language) and the ISO Alpha-2 code for the second part (indicating the region which speaks the language). Please check in Designer System Variables under Language for the list of supported values. Here are some sample values, en-US, en-UK, fr-FR, fr-CA, es-ES, es-MX.
   * @return language
  **/
  @ApiModelProperty(example = "en-US", value = "Preferred language for voice prompts in Designer's format. It needs to be in the ISO-639-1 format for the first part (indicating the language) and the ISO Alpha-2 code for the second part (indicating the region which speaks the language). Please check in Designer System Variables under Language for the list of supported values. Here are some sample values, en-US, en-UK, fr-FR, fr-CA, es-ES, es-MX.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public CreateCallbackParms inboundVQ(String inboundVQ) {
    this.inboundVQ = inboundVQ;
    return this;
  }

   /**
   * The name of the inbound virtual queue the call would have been placed in if the caller did not accept the callback. This is for reporting the estimated wait time for the inbound virtual queue.
   * @return inboundVQ
  **/
  @ApiModelProperty(value = "The name of the inbound virtual queue the call would have been placed in if the caller did not accept the callback. This is for reporting the estimated wait time for the inbound virtual queue.")
  public String getInboundVQ() {
    return inboundVQ;
  }

  public void setInboundVQ(String inboundVQ) {
    this.inboundVQ = inboundVQ;
  }

  public CreateCallbackParms offerThreshold(BigDecimal offerThreshold) {
    this.offerThreshold = offerThreshold;
    return this;
  }

   /**
   * This is the estimated wait time threshold (in seconds) that was used to determine when callback should be offered.
   * @return offerThreshold
  **/
  @ApiModelProperty(value = "This is the estimated wait time threshold (in seconds) that was used to determine when callback should be offered.")
  public BigDecimal getOfferThreshold() {
    return offerThreshold;
  }

  public void setOfferThreshold(BigDecimal offerThreshold) {
    this.offerThreshold = offerThreshold;
  }

  public CreateCallbackParms channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Callback origination channel.
   * @return channel
  **/
  @ApiModelProperty(value = "Callback origination channel.")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public CreateCallbackParms offerTiming(String offerTiming) {
    this.offerTiming = offerTiming;
    return this;
  }

   /**
   * OFF-HOURS when callback (typically scheduled only) was offered outside business hours, ON-HOURS when callback was offered during business hours. If not passed in, then default value is &lt;unspecified&gt;.
   * @return offerTiming
  **/
  @ApiModelProperty(value = "OFF-HOURS when callback (typically scheduled only) was offered outside business hours, ON-HOURS when callback was offered during business hours. If not passed in, then default value is <unspecified>.")
  public String getOfferTiming() {
    return offerTiming;
  }

  public void setOfferTiming(String offerTiming) {
    this.offerTiming = offerTiming;
  }

  public CreateCallbackParms cbOriginationIxnId(String cbOriginationIxnId) {
    this.cbOriginationIxnId = cbOriginationIxnId;
    return this;
  }

   /**
   * The Call ID (CallUUID) of the inbound call where callback was offered originally and accepted. For chat scenarios this should be chat interaction id. If not passed in, then default value is &lt;unspecified&gt;\&quot;.
   * @return cbOriginationIxnId
  **/
  @ApiModelProperty(value = "The Call ID (CallUUID) of the inbound call where callback was offered originally and accepted. For chat scenarios this should be chat interaction id. If not passed in, then default value is <unspecified>\".")
  public String getCbOriginationIxnId() {
    return cbOriginationIxnId;
  }

  public void setCbOriginationIxnId(String cbOriginationIxnId) {
    this.cbOriginationIxnId = cbOriginationIxnId;
  }

  public CreateCallbackParms surveyRP(String surveyRP) {
    this.surveyRP = surveyRP;
    return this;
  }

   /**
   * After the callback is complete, the user can be routed to a survey application to provide feedback. If passed in, this will override the value configured in the CALLBACK_SETTINGS data table.
   * @return surveyRP
  **/
  @ApiModelProperty(value = "After the callback is complete, the user can be routed to a survey application to provide feedback. If passed in, this will override the value configured in the CALLBACK_SETTINGS data table.")
  public String getSurveyRP() {
    return surveyRP;
  }

  public void setSurveyRP(String surveyRP) {
    this.surveyRP = surveyRP;
  }

  public CreateCallbackParms priority(BigDecimal priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The initial priority of the call when placed in the virtual queue. This will override the value configured in the Callback V2 block&#39;s UI if passed in. The other values configured in the Callback V2 block&#39;s UI for priority (priority increments and priority limits) will not be modified.
   * @return priority
  **/
  @ApiModelProperty(value = "The initial priority of the call when placed in the virtual queue. This will override the value configured in the Callback V2 block's UI if passed in. The other values configured in the Callback V2 block's UI for priority (priority increments and priority limits) will not be modified.")
  public BigDecimal getPriority() {
    return priority;
  }

  public void setPriority(BigDecimal priority) {
    this.priority = priority;
  }

  public CreateCallbackParms routePoint(String routePoint) {
    this.routePoint = routePoint;
    return this;
  }

   /**
   * Routing point to use when making an outbound call. This will override the value configured in the CALLBACK_SETTINGS data table if passed in.
   * @return routePoint
  **/
  @ApiModelProperty(value = "Routing point to use when making an outbound call. This will override the value configured in the CALLBACK_SETTINGS data table if passed in.")
  public String getRoutePoint() {
    return routePoint;
  }

  public void setRoutePoint(String routePoint) {
    this.routePoint = routePoint;
  }

  public CreateCallbackParms userData(String userData) {
    this.userData = userData;
    return this;
  }

   /**
   * A hash map of user-specific data that will be associated with the callback. Use hash key names that are considered valid JavaScript variable names - otherwise they will be ignored. For privacy reason, all contents of the user data will not be written to the application logs.
   * @return userData
  **/
  @ApiModelProperty(example = "", value = "A hash map of user-specific data that will be associated with the callback. Use hash key names that are considered valid JavaScript variable names - otherwise they will be ignored. For privacy reason, all contents of the user data will not be written to the application logs.")
  public String getUserData() {
    return userData;
  }

  public void setUserData(String userData) {
    this.userData = userData;
  }

  public CreateCallbackParms captchaToken(String captchaToken) {
    this.captchaToken = captchaToken;
    return this;
  }

   /**
   * The response key generated from the user&#39;s captcha interaction. Required if captcha validation is required for the tenant.
   * @return captchaToken
  **/
  @ApiModelProperty(value = "The response key generated from the user's captcha interaction. Required if captcha validation is required for the tenant.")
  public String getCaptchaToken() {
    return captchaToken;
  }

  public void setCaptchaToken(String captchaToken) {
    this.captchaToken = captchaToken;
  }

  public CreateCallbackParms pushTargets(List<PushTarget> pushTargets) {
    this.pushTargets = pushTargets;
    return this;
  }

  public CreateCallbackParms addPushTargetsItem(PushTarget pushTargetsItem) {
    if (this.pushTargets == null) {
      this.pushTargets = new ArrayList<PushTarget>();
    }
    this.pushTargets.add(pushTargetsItem);
    return this;
  }

   /**
   * An array of push notification channels and targets that will receive a push notification when the serviceName provided is configured to be USERORIGINATED.
   * @return pushTargets
  **/
  @ApiModelProperty(value = "An array of push notification channels and targets that will receive a push notification when the serviceName provided is configured to be USERORIGINATED.")
  public List<PushTarget> getPushTargets() {
    return pushTargets;
  }

  public void setPushTargets(List<PushTarget> pushTargets) {
    this.pushTargets = pushTargets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCallbackParms createCallbackParms = (CreateCallbackParms) o;
    return Objects.equals(this.serviceName, createCallbackParms.serviceName) &&
        Objects.equals(this.phoneNumber, createCallbackParms.phoneNumber) &&
        Objects.equals(this.desiredTime, createCallbackParms.desiredTime) &&
        Objects.equals(this.cbOfferType, createCallbackParms.cbOfferType) &&
        Objects.equals(this.language, createCallbackParms.language) &&
        Objects.equals(this.inboundVQ, createCallbackParms.inboundVQ) &&
        Objects.equals(this.offerThreshold, createCallbackParms.offerThreshold) &&
        Objects.equals(this.channel, createCallbackParms.channel) &&
        Objects.equals(this.offerTiming, createCallbackParms.offerTiming) &&
        Objects.equals(this.cbOriginationIxnId, createCallbackParms.cbOriginationIxnId) &&
        Objects.equals(this.surveyRP, createCallbackParms.surveyRP) &&
        Objects.equals(this.priority, createCallbackParms.priority) &&
        Objects.equals(this.routePoint, createCallbackParms.routePoint) &&
        Objects.equals(this.userData, createCallbackParms.userData) &&
        Objects.equals(this.captchaToken, createCallbackParms.captchaToken) &&
        Objects.equals(this.pushTargets, createCallbackParms.pushTargets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, phoneNumber, desiredTime, cbOfferType, language, inboundVQ, offerThreshold, channel, offerTiming, cbOriginationIxnId, surveyRP, priority, routePoint, userData, captchaToken, pushTargets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCallbackParms {\n");
    
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    desiredTime: ").append(toIndentedString(desiredTime)).append("\n");
    sb.append("    cbOfferType: ").append(toIndentedString(cbOfferType)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    inboundVQ: ").append(toIndentedString(inboundVQ)).append("\n");
    sb.append("    offerThreshold: ").append(toIndentedString(offerThreshold)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    offerTiming: ").append(toIndentedString(offerTiming)).append("\n");
    sb.append("    cbOriginationIxnId: ").append(toIndentedString(cbOriginationIxnId)).append("\n");
    sb.append("    surveyRP: ").append(toIndentedString(surveyRP)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    routePoint: ").append(toIndentedString(routePoint)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    captchaToken: ").append(toIndentedString(captchaToken)).append("\n");
    sb.append("    pushTargets: ").append(toIndentedString(pushTargets)).append("\n");
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

