# CallInApi

All URIs are relative to *///engagement/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callInRequests**](CallInApi.md#callInRequests) | **POST** /call-in/requests/create | Creates a Click-to-call-in request.

<a name="callInRequests"></a>
# **callInRequests**
> CallInRequestsResponse200 callInRequests(body, xApiKey)

Creates a Click-to-call-in request.

Creates a Click-To-Call-in request to retrieve the inbound call instructions such as the number to dial and an optional pin.

### Example
```java
// Import classes:
//import com.genesys.engagement.ApiException;
//import com.genesys.engagement.api.CallInApi;


CallInApi apiInstance = new CallInApi();
CallInRequestsParms body = new CallInRequestsParms(); // CallInRequestsParms | Request properties.
String xApiKey = "xApiKey_example"; // String | API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep
try {
    CallInRequestsResponse200 result = apiInstance.callInRequests(body, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallInApi#callInRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CallInRequestsParms**](CallInRequestsParms.md)| Request properties. |
 **xApiKey** | [**String**](.md)| API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep |

### Return type

[**CallInRequestsResponse200**](CallInRequestsResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

