# CreateCallbackParms

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceName** | **String** | Name of the callback execution service provisioned in GES. | 
**phoneNumber** | **String** | Number to call back. | 
**desiredTime** | [**OffsetDateTime**](OffsetDateTime.md) | Desired time to have the callback. By default, the desired time is the current time. This option format is ISO 8601 yyyy-MM-ddTHH:mm:ss.SSSZ such as 2013-05-28T15:30:00.000Z. |  [optional]
**cbOfferType** | **String** | Type of callback that was originally offered and accepted by the customer. Possible values are ASAP, SCHEDULED, COMBINED_SCHEDULED_AND_ASAP. Note that this is used for reporting purposes only. |  [optional]
**language** | **String** | Preferred language for voice prompts in Designer&#x27;s format. It needs to be in the ISO-639-1 format for the first part (indicating the language) and the ISO Alpha-2 code for the second part (indicating the region which speaks the language). Please check in Designer System Variables under Language for the list of supported values. Here are some sample values, en-US, en-UK, fr-FR, fr-CA, es-ES, es-MX. |  [optional]
**inboundVQ** | **String** | The name of the inbound virtual queue the call would have been placed in if the caller did not accept the callback. This is for reporting the estimated wait time for the inbound virtual queue. |  [optional]
**offerThreshold** | **Integer** | This is the estimated wait time threshold (in seconds) that was used to determine when callback should be offered. |  [optional]
**channel** | **String** | Callback origination channel. |  [optional]
**offerTiming** | **String** | OFF-HOURS when callback (typically scheduled only) was offered outside business hours, ON-HOURS when callback was offered during business hours. If not passed in, then default value is &lt;unspecified&gt;. |  [optional]
**cbOriginationIxnId** | **String** | The Call ID (CallUUID) of the inbound call where callback was offered originally and accepted. For chat scenarios this should be chat interaction id. If not passed in, then default value is &lt;unspecified&gt;\&quot;. |  [optional]
**surveyRP** | **String** | After the callback is complete, the user can be routed to a survey application to provide feedback. If passed in, this will override the value configured in the CALLBACK_SETTINGS data table. |  [optional]
**priority** | **Integer** | The initial priority of the call when placed in the virtual queue. This will override the value configured in the Callback V2 block&#x27;s UI if passed in. The other values configured in the Callback V2 block&#x27;s UI for priority (priority increments and priority limits) will not be modified. |  [optional]
**routePoint** | **String** | Routing point to use when making an outbound call. This will override the value configured in the CALLBACK_SETTINGS data table if passed in. |  [optional]
**userData** | **String** | A hash map of user-specific data that will be associated with the callback. Use hash key names that are considered valid JavaScript variable names - otherwise they will be ignored. For privacy reason, all contents of the user data will not be written to the application logs. |  [optional]
**captchaToken** | **String** | The response key generated from the user&#x27;s captcha interaction. Required if captcha validation is required for the tenant. |  [optional]
**pushChannel** | **String** | The push channel to receive a push notification when the serviceName provided is configured to be USERORIGINATED. Otherwise this is ignored. Currently only supports a value of &#x27;FCM&#x27;. |  [optional]
**pushTarget** | **String** | The push target to receive a push notification when the serviceName provided is configured to be USERORIGINATED. Otherwise this is ignored. |  [optional]
