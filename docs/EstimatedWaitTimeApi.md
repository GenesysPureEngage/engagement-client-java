# EstimatedWaitTimeApi

All URIs are relative to *///engagement/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**estimatedWaitTimeAPI1**](EstimatedWaitTimeApi.md#estimatedWaitTimeAPI1) | **GET** /estimated-wait-time | Retrieves the estimated wait time for one or more virtual queues.

<a name="estimatedWaitTimeAPI1"></a>
# **estimatedWaitTimeAPI1**
> EstimatedWaitTimeResponse200 estimatedWaitTimeAPI1(xApiKey, virtualQueues, mode)

Retrieves the estimated wait time for one or more virtual queues.

Retrieves the estimated wait time for one or more virtual queues.

### Example
```java
// Import classes:
//import com.genesys.engagement.ApiException;
//import com.genesys.engagement.api.EstimatedWaitTimeApi;


EstimatedWaitTimeApi apiInstance = new EstimatedWaitTimeApi();
String xApiKey = "xApiKey_example"; // String | API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep
String virtualQueues = "virtualQueues_example"; // String | One or more virtual queue names specified as a comma-delimited string.
String mode = "mode_example"; // String | EstimatedWaitTime calculation mode. You can set this value to mode1, mode2, or mode3. If not specified, the default value is mode2. If mode=mode1, the system checks how fast interactions go through the virtual queue and how many interactions are still pending. Note that mode1 only considers that last 32 interactions in the queue. The system ignores the current agent availability and does not immediately adjust the EstimatedWaitTime if, for example, all of the agents handling the queue suddenly logout. If mode=mode2, the system checks how fast interactions go through the virtual queue and how many interactions are pending. Additionally, the system takes into account the agents who have historically been handling interactions of the Virtual Queue. If there are no agents logged in, a value of -1 is returned. If mode=mode3, the statistics calculation from the Statistics Server, and not from the Routing Server, are used.
try {
    EstimatedWaitTimeResponse200 result = apiInstance.estimatedWaitTimeAPI1(xApiKey, virtualQueues, mode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EstimatedWaitTimeApi#estimatedWaitTimeAPI1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xApiKey** | [**String**](.md)| API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep |
 **virtualQueues** | [**String**](.md)| One or more virtual queue names specified as a comma-delimited string. |
 **mode** | [**String**](.md)| EstimatedWaitTime calculation mode. You can set this value to mode1, mode2, or mode3. If not specified, the default value is mode2. If mode&#x3D;mode1, the system checks how fast interactions go through the virtual queue and how many interactions are still pending. Note that mode1 only considers that last 32 interactions in the queue. The system ignores the current agent availability and does not immediately adjust the EstimatedWaitTime if, for example, all of the agents handling the queue suddenly logout. If mode&#x3D;mode2, the system checks how fast interactions go through the virtual queue and how many interactions are pending. Additionally, the system takes into account the agents who have historically been handling interactions of the Virtual Queue. If there are no agents logged in, a value of -1 is returned. If mode&#x3D;mode3, the statistics calculation from the Statistics Server, and not from the Routing Server, are used. | [optional]

### Return type

[**EstimatedWaitTimeResponse200**](EstimatedWaitTimeResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

