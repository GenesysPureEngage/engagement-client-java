/*
 * Callback and Related APIs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0.000.19.013
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


import com.genesys.internal.engagement.model.QueueStatusResponse200;
import com.genesys.internal.engagement.model.QueueStatusResponse400;
import com.genesys.internal.engagement.model.QueueStatusResponse500;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueueStatusApi {
    private ApiClient apiClient;

    public QueueStatusApi() {
        this(Configuration.getDefaultApiClient());
    }

    public QueueStatusApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for queryQueueStatus
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param queueName Name of the callback queue. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryQueueStatusCall(String xApiKey, String queueName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/callbacks/queue-status/{queue-name}"
            .replaceAll("\\{" + "queue-name" + "\\}", apiClient.escapeString(queueName.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call queryQueueStatusValidateBeforeCall(String xApiKey, String queueName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling queryQueueStatus(Async)");
        }
        
        // verify the required parameter 'queueName' is set
        if (queueName == null) {
            throw new ApiException("Missing the required parameter 'queueName' when calling queryQueueStatus(Async)");
        }
        

        com.squareup.okhttp.Call call = queryQueueStatusCall(xApiKey, queueName, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets the queue&#39;s readiness for callbacks.
     * Retrieves the estimated-wait-time and whether the queue accepts immediate and/or scheduled callbacks.
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param queueName Name of the callback queue. (required)
     * @return QueueStatusResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueueStatusResponse200 queryQueueStatus(String xApiKey, String queueName) throws ApiException {
        ApiResponse<QueueStatusResponse200> resp = queryQueueStatusWithHttpInfo(xApiKey, queueName);
        return resp.getData();
    }

    /**
     * Gets the queue&#39;s readiness for callbacks.
     * Retrieves the estimated-wait-time and whether the queue accepts immediate and/or scheduled callbacks.
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param queueName Name of the callback queue. (required)
     * @return ApiResponse&lt;QueueStatusResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueueStatusResponse200> queryQueueStatusWithHttpInfo(String xApiKey, String queueName) throws ApiException {
        com.squareup.okhttp.Call call = queryQueueStatusValidateBeforeCall(xApiKey, queueName, null, null);
        Type localVarReturnType = new TypeToken<QueueStatusResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the queue&#39;s readiness for callbacks. (asynchronously)
     * Retrieves the estimated-wait-time and whether the queue accepts immediate and/or scheduled callbacks.
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param queueName Name of the callback queue. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryQueueStatusAsync(String xApiKey, String queueName, final ApiCallback<QueueStatusResponse200> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = queryQueueStatusValidateBeforeCall(xApiKey, queueName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueueStatusResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
