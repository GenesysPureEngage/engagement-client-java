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


package com.genesys.internal.engagement.api;

import com.genesys.internal.common.ApiCallback;
import com.genesys.internal.common.ApiClient;
import com.genesys.internal.common.ApiException;
import com.genesys.internal.common.ApiResponse;
import com.genesys.internal.common.Configuration;
import com.genesys.internal.common.Pair;
import com.genesys.internal.common.ProgressRequestBody;
import com.genesys.internal.common.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.genesys.internal.engagement.model.CallInRequestsParms;
import com.genesys.internal.engagement.model.CallInRequestsResponse200;
import com.genesys.internal.engagement.model.CallInRequestsResponse400;
import com.genesys.internal.engagement.model.CallInRequestsResponse500;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CallInApi {
    private ApiClient apiClient;

    public CallInApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CallInApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for callInRequests
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param body Request properties. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call callInRequestsCall(String xApiKey, CallInRequestsParms body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/call-in/requests/create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call callInRequestsValidateBeforeCall(String xApiKey, CallInRequestsParms body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling callInRequests(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling callInRequests(Async)");
        }
        

        com.squareup.okhttp.Call call = callInRequestsCall(xApiKey, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates a Click-to-call-in request.
     * Creates a Click-To-Call-in request to retrieve the inbound call instructions such as the number to dial and an optional pin.
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param body Request properties. (required)
     * @return CallInRequestsResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CallInRequestsResponse200 callInRequests(String xApiKey, CallInRequestsParms body) throws ApiException {
        ApiResponse<CallInRequestsResponse200> resp = callInRequestsWithHttpInfo(xApiKey, body);
        return resp.getData();
    }

    /**
     * Creates a Click-to-call-in request.
     * Creates a Click-To-Call-in request to retrieve the inbound call instructions such as the number to dial and an optional pin.
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param body Request properties. (required)
     * @return ApiResponse&lt;CallInRequestsResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CallInRequestsResponse200> callInRequestsWithHttpInfo(String xApiKey, CallInRequestsParms body) throws ApiException {
        com.squareup.okhttp.Call call = callInRequestsValidateBeforeCall(xApiKey, body, null, null);
        Type localVarReturnType = new TypeToken<CallInRequestsResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a Click-to-call-in request. (asynchronously)
     * Creates a Click-To-Call-in request to retrieve the inbound call instructions such as the number to dial and an optional pin.
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param body Request properties. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call callInRequestsAsync(String xApiKey, CallInRequestsParms body, final ApiCallback<CallInRequestsResponse200> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = callInRequestsValidateBeforeCall(xApiKey, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CallInRequestsResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
