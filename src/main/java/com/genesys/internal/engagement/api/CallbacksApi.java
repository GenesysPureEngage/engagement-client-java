/*
 * Callback and Related APIs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0.000.19.004
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


import com.genesys.internal.engagement.model.CallbackIdParms;
import com.genesys.internal.engagement.model.CallbackResponse500;
import com.genesys.internal.engagement.model.CancelCallbackResponse200;
import com.genesys.internal.engagement.model.CancelCallbackResponse400;
import com.genesys.internal.engagement.model.CancelCallbackResponse404;
import com.genesys.internal.engagement.model.CreateCallbackParms;
import com.genesys.internal.engagement.model.CreateCallbackResponse200;
import com.genesys.internal.engagement.model.CreateCallbackResponse400;
import com.genesys.internal.engagement.model.CreateCallbackResponse429;
import com.genesys.internal.engagement.model.GetCallbackResponse200;
import com.genesys.internal.engagement.model.GetCallbackResponse400;
import com.genesys.internal.engagement.model.GetCallbackResponse404;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CallbacksApi {
    private ApiClient apiClient;

    public CallbacksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CallbacksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for bookCallbackExternal
     * @param xApiKey API Key (required)
     * @param body Callback properties. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call bookCallbackExternalCall(String xApiKey, CreateCallbackParms body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/callbacks/create";

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
    private com.squareup.okhttp.Call bookCallbackExternalValidateBeforeCall(String xApiKey, CreateCallbackParms body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling bookCallbackExternal(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling bookCallbackExternal(Async)");
        }
        

        com.squareup.okhttp.Call call = bookCallbackExternalCall(xApiKey, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates a new callback.
     * Initiates a callback request.
     * @param xApiKey API Key (required)
     * @param body Callback properties. (required)
     * @return CreateCallbackResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateCallbackResponse200 bookCallbackExternal(String xApiKey, CreateCallbackParms body) throws ApiException {
        ApiResponse<CreateCallbackResponse200> resp = bookCallbackExternalWithHttpInfo(xApiKey, body);
        return resp.getData();
    }

    /**
     * Creates a new callback.
     * Initiates a callback request.
     * @param xApiKey API Key (required)
     * @param body Callback properties. (required)
     * @return ApiResponse&lt;CreateCallbackResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateCallbackResponse200> bookCallbackExternalWithHttpInfo(String xApiKey, CreateCallbackParms body) throws ApiException {
        com.squareup.okhttp.Call call = bookCallbackExternalValidateBeforeCall(xApiKey, body, null, null);
        Type localVarReturnType = new TypeToken<CreateCallbackResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a new callback. (asynchronously)
     * Initiates a callback request.
     * @param xApiKey API Key (required)
     * @param body Callback properties. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call bookCallbackExternalAsync(String xApiKey, CreateCallbackParms body, final ApiCallback<CreateCallbackResponse200> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = bookCallbackExternalValidateBeforeCall(xApiKey, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateCallbackResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for cancelCallback
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param body Callback properties. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cancelCallbackCall(String xApiKey, CallbackIdParms body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/callbacks/cancel";

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
    private com.squareup.okhttp.Call cancelCallbackValidateBeforeCall(String xApiKey, CallbackIdParms body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling cancelCallback(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling cancelCallback(Async)");
        }
        

        com.squareup.okhttp.Call call = cancelCallbackCall(xApiKey, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Cancels an existing callback.
     * Cancels an existing callback by its callback ID.
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param body Callback properties. (required)
     * @return CancelCallbackResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CancelCallbackResponse200 cancelCallback(String xApiKey, CallbackIdParms body) throws ApiException {
        ApiResponse<CancelCallbackResponse200> resp = cancelCallbackWithHttpInfo(xApiKey, body);
        return resp.getData();
    }

    /**
     * Cancels an existing callback.
     * Cancels an existing callback by its callback ID.
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param body Callback properties. (required)
     * @return ApiResponse&lt;CancelCallbackResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CancelCallbackResponse200> cancelCallbackWithHttpInfo(String xApiKey, CallbackIdParms body) throws ApiException {
        com.squareup.okhttp.Call call = cancelCallbackValidateBeforeCall(xApiKey, body, null, null);
        Type localVarReturnType = new TypeToken<CancelCallbackResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Cancels an existing callback. (asynchronously)
     * Cancels an existing callback by its callback ID.
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param body Callback properties. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cancelCallbackAsync(String xApiKey, CallbackIdParms body, final ApiCallback<CancelCallbackResponse200> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cancelCallbackValidateBeforeCall(xApiKey, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CancelCallbackResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for queryCallbackById
     * @param xApiKey API Key (required)
     * @param body Callback properties. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryCallbackByIdCall(String xApiKey, CallbackIdParms body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/callbacks/retrieve";

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
    private com.squareup.okhttp.Call queryCallbackByIdValidateBeforeCall(String xApiKey, CallbackIdParms body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling queryCallbackById(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling queryCallbackById(Async)");
        }
        

        com.squareup.okhttp.Call call = queryCallbackByIdCall(xApiKey, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Queries an existing callback.
     * Queries an existing callback by its callback ID.
     * @param xApiKey API Key (required)
     * @param body Callback properties. (required)
     * @return GetCallbackResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetCallbackResponse200 queryCallbackById(String xApiKey, CallbackIdParms body) throws ApiException {
        ApiResponse<GetCallbackResponse200> resp = queryCallbackByIdWithHttpInfo(xApiKey, body);
        return resp.getData();
    }

    /**
     * Queries an existing callback.
     * Queries an existing callback by its callback ID.
     * @param xApiKey API Key (required)
     * @param body Callback properties. (required)
     * @return ApiResponse&lt;GetCallbackResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetCallbackResponse200> queryCallbackByIdWithHttpInfo(String xApiKey, CallbackIdParms body) throws ApiException {
        com.squareup.okhttp.Call call = queryCallbackByIdValidateBeforeCall(xApiKey, body, null, null);
        Type localVarReturnType = new TypeToken<GetCallbackResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Queries an existing callback. (asynchronously)
     * Queries an existing callback by its callback ID.
     * @param xApiKey API Key (required)
     * @param body Callback properties. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryCallbackByIdAsync(String xApiKey, CallbackIdParms body, final ApiCallback<GetCallbackResponse200> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = queryCallbackByIdValidateBeforeCall(xApiKey, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetCallbackResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
