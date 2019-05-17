# AvailabilityApi

All URIs are relative to *///engagement/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**openFor**](AvailabilityApi.md#openFor) | **GET** /callbacks/open-for/{service-name} | Gets Office Open Duration.
[**queryAvailabilityV2**](AvailabilityApi.md#queryAvailabilityV2) | **GET** /callbacks/availability/{service-name} | Gets available timeslots for a given queue.

<a name="openFor"></a>
# **openFor**
> OpenForResponse200 openFor(xApiKey, serviceName, start, timezone)

Gets Office Open Duration.

Retrieves how long the office will stay open in seconds.

### Example
```java
// Import classes:
//import com.genesys.engagement.ApiException;
//import com.genesys.engagement.api.AvailabilityApi;


AvailabilityApi apiInstance = new AvailabilityApi();
String xApiKey = "xApiKey_example"; // String | API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep
String serviceName = "serviceName_example"; // String | Name of the callback execution service provisioned in GES.
String start = "start_example"; // String | Start date in ISO 8601 format, using UTC as timezone: YYYY-MM-ddTHH:mm:ssZ. If not specified, the start date is assumed to be now.
String timezone = "timezone_example"; // String | Timezone to use if start and/or end time are not specified in any specific timezone. For a list of possible values, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
try {
    OpenForResponse200 result = apiInstance.openFor(xApiKey, serviceName, start, timezone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvailabilityApi#openFor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | [**String**](.md)| API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep |
 **serviceName** | [**String**](.md)| Name of the callback execution service provisioned in GES. |
 **start** | [**String**](.md)| Start date in ISO 8601 format, using UTC as timezone: YYYY-MM-ddTHH:mm:ssZ. If not specified, the start date is assumed to be now. | [optional]
 **timezone** | [**String**](.md)| Timezone to use if start and/or end time are not specified in any specific timezone. For a list of possible values, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones | [optional]

### Return type

[**OpenForResponse200**](OpenForResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryAvailabilityV2"></a>
# **queryAvailabilityV2**
> AvailabilitiesResponse200 queryAvailabilityV2(xApiKey, serviceName, start, startMS, numberOfDays, end, endMS, timezone, maxTimeSlots, reportBusy)

Gets available timeslots for a given queue.

Retrieves a map of slots in which the office capacity is not full.

### Example
```java
// Import classes:
//import com.genesys.engagement.ApiException;
//import com.genesys.engagement.api.AvailabilityApi;


AvailabilityApi apiInstance = new AvailabilityApi();
String xApiKey = "xApiKey_example"; // String | API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep
String serviceName = "serviceName_example"; // String | Name of the callback execution service provisioned in GES.
String start = "start_example"; // String | Start date in ISO 8601 format, using UTC as the timezone: yyyy-MM-ddTHH:mm:ss.SSSZ. If not specified, the start date is assumed to be now.
Integer startMS = 56; // Integer | Start date in epoch time, that is, the number of milliseconds since 00:00:00, Thursday, 1 January 1970 (UTC). You must also set the endMS or numberOfDays parameter; otherwise, the end date is assumed to be the startMS date. If you set the startMS parameter, do not set the start or timestamp parameters.
Integer numberOfDays = 56; // Integer | Used as an alternative to the end date. If neither end nor numberOfDays is specified, the end date is assumed to be the start date.
String end = "end_example"; // String | End date in ISO 8601 format, using UTC as timezone: yyyy-MM-ddTHH:mm:ss.SSSZ. If neither end nor numberOfDays is specified, the end date is assumed to be the start date.
Integer endMS = 56; // Integer | End date in epoch time, that is, the number of milliseconds since 00:00:00, Thursday, 1 January 1970 (UTC). Set only one of the end, endMS, or numberOfDays parameters.
String timezone = "timezone_example"; // String | Timezone for the start and end date parameters. If not specified, the default is UTC. Additionally, the response object will return the localTime fields formatted in this timezone. For a list of possible values, see the TZ column of the list in https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
Integer maxTimeSlots = 56; // Integer | Maximum number of time slots to include in the response when the office is open and its capacity is above zero. Use this parameter to improve the performance of the query over a long period of time.
Boolean reportBusy = true; // Boolean | If true, the response includes the slots where the office is open and where callbacks are booked to full capacity. By default, reportBusy is false.
try {
    AvailabilitiesResponse200 result = apiInstance.queryAvailabilityV2(xApiKey, serviceName, start, startMS, numberOfDays, end, endMS, timezone, maxTimeSlots, reportBusy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvailabilityApi#queryAvailabilityV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | [**String**](.md)| API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep |
 **serviceName** | [**String**](.md)| Name of the callback execution service provisioned in GES. |
 **start** | [**String**](.md)| Start date in ISO 8601 format, using UTC as the timezone: yyyy-MM-ddTHH:mm:ss.SSSZ. If not specified, the start date is assumed to be now. | [optional]
 **startMS** | [**Integer**](.md)| Start date in epoch time, that is, the number of milliseconds since 00:00:00, Thursday, 1 January 1970 (UTC). You must also set the endMS or numberOfDays parameter; otherwise, the end date is assumed to be the startMS date. If you set the startMS parameter, do not set the start or timestamp parameters. | [optional]
 **numberOfDays** | [**Integer**](.md)| Used as an alternative to the end date. If neither end nor numberOfDays is specified, the end date is assumed to be the start date. | [optional]
 **end** | [**String**](.md)| End date in ISO 8601 format, using UTC as timezone: yyyy-MM-ddTHH:mm:ss.SSSZ. If neither end nor numberOfDays is specified, the end date is assumed to be the start date. | [optional]
 **endMS** | [**Integer**](.md)| End date in epoch time, that is, the number of milliseconds since 00:00:00, Thursday, 1 January 1970 (UTC). Set only one of the end, endMS, or numberOfDays parameters. | [optional]
 **timezone** | [**String**](.md)| Timezone for the start and end date parameters. If not specified, the default is UTC. Additionally, the response object will return the localTime fields formatted in this timezone. For a list of possible values, see the TZ column of the list in https://en.wikipedia.org/wiki/List_of_tz_database_time_zones | [optional]
 **maxTimeSlots** | [**Integer**](.md)| Maximum number of time slots to include in the response when the office is open and its capacity is above zero. Use this parameter to improve the performance of the query over a long period of time. | [optional]
 **reportBusy** | [**Boolean**](.md)| If true, the response includes the slots where the office is open and where callbacks are booked to full capacity. By default, reportBusy is false. | [optional]

### Return type

[**AvailabilitiesResponse200**](AvailabilitiesResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

