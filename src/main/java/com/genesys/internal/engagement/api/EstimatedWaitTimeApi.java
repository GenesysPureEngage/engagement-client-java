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


import com.genesys.internal.engagement.model.EstimatedWaitTimeResponse200;
import com.genesys.internal.engagement.model.EstimatedWaitTimeResponse400;
import com.genesys.internal.engagement.model.EstimatedWaitTimeResponse500;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstimatedWaitTimeApi {
    private ApiClient apiClient;

    public EstimatedWaitTimeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EstimatedWaitTimeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for estimatedWaitTimeAPI1
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param virtualQueues One or more virtual queue names specified as a comma-delimited string. (required)
     * @param mode EstimatedWaitTime calculation mode. You can set this value to mode1, mode2, or mode3. If not specified, the default value is mode2. If mode&#x3D;mode1, the system checks how fast interactions go through the virtual queue and how many interactions are still pending. Note that mode1 only considers that last 32 interactions in the queue. The system ignores the current agent availability and does not immediately adjust the EstimatedWaitTime if, for example, all of the agents handling the queue suddenly logout. If mode&#x3D;mode2, the system checks how fast interactions go through the virtual queue and how many interactions are pending. Additionally, the system takes into account the agents who have historically been handling interactions of the Virtual Queue. If there are no agents logged in, a value of -1 is returned. If mode&#x3D;mode3, the statistics calculation from the Statistics Server, and not from the Routing Server, are used. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call estimatedWaitTimeAPI1Call(String xApiKey, String virtualQueues, String mode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/estimated-wait-time";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (virtualQueues != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("virtual-queues", virtualQueues));
        if (mode != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("mode", mode));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call estimatedWaitTimeAPI1ValidateBeforeCall(String xApiKey, String virtualQueues, String mode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling estimatedWaitTimeAPI1(Async)");
        }
        
        // verify the required parameter 'virtualQueues' is set
        if (virtualQueues == null) {
            throw new ApiException("Missing the required parameter 'virtualQueues' when calling estimatedWaitTimeAPI1(Async)");
        }
        

        com.squareup.okhttp.Call call = estimatedWaitTimeAPI1Call(xApiKey, virtualQueues, mode, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves the estimated wait time for one or more virtual queues.
     * Retrieves the estimated wait time for one or more virtual queues.
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param virtualQueues One or more virtual queue names specified as a comma-delimited string. (required)
     * @param mode EstimatedWaitTime calculation mode. You can set this value to mode1, mode2, or mode3. If not specified, the default value is mode2. If mode&#x3D;mode1, the system checks how fast interactions go through the virtual queue and how many interactions are still pending. Note that mode1 only considers that last 32 interactions in the queue. The system ignores the current agent availability and does not immediately adjust the EstimatedWaitTime if, for example, all of the agents handling the queue suddenly logout. If mode&#x3D;mode2, the system checks how fast interactions go through the virtual queue and how many interactions are pending. Additionally, the system takes into account the agents who have historically been handling interactions of the Virtual Queue. If there are no agents logged in, a value of -1 is returned. If mode&#x3D;mode3, the statistics calculation from the Statistics Server, and not from the Routing Server, are used. (optional)
     * @return EstimatedWaitTimeResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EstimatedWaitTimeResponse200 estimatedWaitTimeAPI1(String xApiKey, String virtualQueues, String mode) throws ApiException {
        ApiResponse<EstimatedWaitTimeResponse200> resp = estimatedWaitTimeAPI1WithHttpInfo(xApiKey, virtualQueues, mode);
        return resp.getData();
    }

    /**
     * Retrieves the estimated wait time for one or more virtual queues.
     * Retrieves the estimated wait time for one or more virtual queues.
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param virtualQueues One or more virtual queue names specified as a comma-delimited string. (required)
     * @param mode EstimatedWaitTime calculation mode. You can set this value to mode1, mode2, or mode3. If not specified, the default value is mode2. If mode&#x3D;mode1, the system checks how fast interactions go through the virtual queue and how many interactions are still pending. Note that mode1 only considers that last 32 interactions in the queue. The system ignores the current agent availability and does not immediately adjust the EstimatedWaitTime if, for example, all of the agents handling the queue suddenly logout. If mode&#x3D;mode2, the system checks how fast interactions go through the virtual queue and how many interactions are pending. Additionally, the system takes into account the agents who have historically been handling interactions of the Virtual Queue. If there are no agents logged in, a value of -1 is returned. If mode&#x3D;mode3, the statistics calculation from the Statistics Server, and not from the Routing Server, are used. (optional)
     * @return ApiResponse&lt;EstimatedWaitTimeResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EstimatedWaitTimeResponse200> estimatedWaitTimeAPI1WithHttpInfo(String xApiKey, String virtualQueues, String mode) throws ApiException {
        com.squareup.okhttp.Call call = estimatedWaitTimeAPI1ValidateBeforeCall(xApiKey, virtualQueues, mode, null, null);
        Type localVarReturnType = new TypeToken<EstimatedWaitTimeResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves the estimated wait time for one or more virtual queues. (asynchronously)
     * Retrieves the estimated wait time for one or more virtual queues.
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param virtualQueues One or more virtual queue names specified as a comma-delimited string. (required)
     * @param mode EstimatedWaitTime calculation mode. You can set this value to mode1, mode2, or mode3. If not specified, the default value is mode2. If mode&#x3D;mode1, the system checks how fast interactions go through the virtual queue and how many interactions are still pending. Note that mode1 only considers that last 32 interactions in the queue. The system ignores the current agent availability and does not immediately adjust the EstimatedWaitTime if, for example, all of the agents handling the queue suddenly logout. If mode&#x3D;mode2, the system checks how fast interactions go through the virtual queue and how many interactions are pending. Additionally, the system takes into account the agents who have historically been handling interactions of the Virtual Queue. If there are no agents logged in, a value of -1 is returned. If mode&#x3D;mode3, the statistics calculation from the Statistics Server, and not from the Routing Server, are used. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call estimatedWaitTimeAPI1Async(String xApiKey, String virtualQueues, String mode, final ApiCallback<EstimatedWaitTimeResponse200> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = estimatedWaitTimeAPI1ValidateBeforeCall(xApiKey, virtualQueues, mode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EstimatedWaitTimeResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
