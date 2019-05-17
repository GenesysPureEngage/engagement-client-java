# CallbacksApi

All URIs are relative to *///engagement/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bookCallbackExternal**](CallbacksApi.md#bookCallbackExternal) | **POST** /callbacks/create | Creates a new callback.
[**cancelCallback**](CallbacksApi.md#cancelCallback) | **POST** /callbacks/cancel | Cancels an existing callback.
[**queryCallbackById**](CallbacksApi.md#queryCallbackById) | **POST** /callbacks/retrieve | Queries an existing callback.

<a name="bookCallbackExternal"></a>
# **bookCallbackExternal**
> CreateCallbackResponse200 bookCallbackExternal(body, xApiKey)

Creates a new callback.

Initiates a callback request.

### Example
```java
// Import classes:
//import com.genesys.engagement.ApiException;
//import com.genesys.engagement.api.CallbacksApi;


CallbacksApi apiInstance = new CallbacksApi();
CreateCallbackParms body = new CreateCallbackParms(); // CreateCallbackParms | Callback properties.
String xApiKey = "xApiKey_example"; // String | API Key
try {
    CreateCallbackResponse200 result = apiInstance.bookCallbackExternal(body, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallbacksApi#bookCallbackExternal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateCallbackParms**](CreateCallbackParms.md)| Callback properties. |
 **xApiKey** | [**String**](.md)| API Key |

### Return type

[**CreateCallbackResponse200**](CreateCallbackResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelCallback"></a>
# **cancelCallback**
> CancelCallbackResponse200 cancelCallback(body, xApiKey)

Cancels an existing callback.

Cancels an existing callback by its callback ID.

### Example
```java
// Import classes:
//import com.genesys.engagement.ApiException;
//import com.genesys.engagement.api.CallbacksApi;


CallbacksApi apiInstance = new CallbacksApi();
CallbackIdParms body = new CallbackIdParms(); // CallbackIdParms | Callback properties.
String xApiKey = "xApiKey_example"; // String | API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep
try {
    CancelCallbackResponse200 result = apiInstance.cancelCallback(body, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallbacksApi#cancelCallback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CallbackIdParms**](CallbackIdParms.md)| Callback properties. |
 **xApiKey** | [**String**](.md)| API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep |

### Return type

[**CancelCallbackResponse200**](CancelCallbackResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryCallbackById"></a>
# **queryCallbackById**
> GetCallbackResponse200 queryCallbackById(body, xApiKey)

Queries an existing callback.

Queries an existing callback by its callack ID.

### Example
```java
// Import classes:
//import com.genesys.engagement.ApiException;
//import com.genesys.engagement.api.CallbacksApi;


CallbacksApi apiInstance = new CallbacksApi();
CallbackIdParms body = new CallbackIdParms(); // CallbackIdParms | Callback properties.
String xApiKey = "xApiKey_example"; // String | API Key
try {
    GetCallbackResponse200 result = apiInstance.queryCallbackById(body, xApiKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallbacksApi#queryCallbackById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CallbackIdParms**](CallbackIdParms.md)| Callback properties. |
 **xApiKey** | [**String**](.md)| API Key |

### Return type

[**GetCallbackResponse200**](GetCallbackResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

