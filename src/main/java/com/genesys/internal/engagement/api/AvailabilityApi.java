/*
 * Callback and Related APIs
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0.000.19.016
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


import com.genesys.internal.engagement.model.AvailabilitiesResponse200;
import com.genesys.internal.engagement.model.AvailabilitiesResponse400;
import com.genesys.internal.engagement.model.AvailabilitiesResponse500;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import com.genesys.internal.engagement.model.OpenForResponse200;
import com.genesys.internal.engagement.model.OpenForResponse400;
import com.genesys.internal.engagement.model.OpenForResponse500;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AvailabilityApi {
    private ApiClient apiClient;

    public AvailabilityApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AvailabilityApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for openFor
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param serviceName Name of the callback execution service provisioned in GES. (required)
     * @param start Start date in ISO 8601 format. If no timezone is provided, UTC is assumed and this must be specified in yyyy-MM-ddTHH:mm:ss.SSSZ format. If a timezone is specified, then this must be specified in yyyy-MM-ddTHH:mm:ss.SSS format. If no start time is provided, the start time is assumed to be the current time. (optional)
     * @param timezone Timezone to use if start and/or end time are not specified in any specific timezone. For a list of possible values, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call openForCall(String xApiKey, String serviceName, OffsetDateTime start, String timezone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/callbacks/open-for/{service-name}"
            .replaceAll("\\{" + "service-name" + "\\}", apiClient.escapeString(serviceName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
        if (timezone != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("timezone", timezone));

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
    private com.squareup.okhttp.Call openForValidateBeforeCall(String xApiKey, String serviceName, OffsetDateTime start, String timezone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling openFor(Async)");
        }
        
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new ApiException("Missing the required parameter 'serviceName' when calling openFor(Async)");
        }
        

        com.squareup.okhttp.Call call = openForCall(xApiKey, serviceName, start, timezone, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets Office Open Duration.
     * Retrieves how long the office will stay open in seconds.
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param serviceName Name of the callback execution service provisioned in GES. (required)
     * @param start Start date in ISO 8601 format. If no timezone is provided, UTC is assumed and this must be specified in yyyy-MM-ddTHH:mm:ss.SSSZ format. If a timezone is specified, then this must be specified in yyyy-MM-ddTHH:mm:ss.SSS format. If no start time is provided, the start time is assumed to be the current time. (optional)
     * @param timezone Timezone to use if start and/or end time are not specified in any specific timezone. For a list of possible values, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones (optional)
     * @return OpenForResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OpenForResponse200 openFor(String xApiKey, String serviceName, OffsetDateTime start, String timezone) throws ApiException {
        ApiResponse<OpenForResponse200> resp = openForWithHttpInfo(xApiKey, serviceName, start, timezone);
        return resp.getData();
    }

    /**
     * Gets Office Open Duration.
     * Retrieves how long the office will stay open in seconds.
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param serviceName Name of the callback execution service provisioned in GES. (required)
     * @param start Start date in ISO 8601 format. If no timezone is provided, UTC is assumed and this must be specified in yyyy-MM-ddTHH:mm:ss.SSSZ format. If a timezone is specified, then this must be specified in yyyy-MM-ddTHH:mm:ss.SSS format. If no start time is provided, the start time is assumed to be the current time. (optional)
     * @param timezone Timezone to use if start and/or end time are not specified in any specific timezone. For a list of possible values, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones (optional)
     * @return ApiResponse&lt;OpenForResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OpenForResponse200> openForWithHttpInfo(String xApiKey, String serviceName, OffsetDateTime start, String timezone) throws ApiException {
        com.squareup.okhttp.Call call = openForValidateBeforeCall(xApiKey, serviceName, start, timezone, null, null);
        Type localVarReturnType = new TypeToken<OpenForResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets Office Open Duration. (asynchronously)
     * Retrieves how long the office will stay open in seconds.
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param serviceName Name of the callback execution service provisioned in GES. (required)
     * @param start Start date in ISO 8601 format. If no timezone is provided, UTC is assumed and this must be specified in yyyy-MM-ddTHH:mm:ss.SSSZ format. If a timezone is specified, then this must be specified in yyyy-MM-ddTHH:mm:ss.SSS format. If no start time is provided, the start time is assumed to be the current time. (optional)
     * @param timezone Timezone to use if start and/or end time are not specified in any specific timezone. For a list of possible values, see https://en.wikipedia.org/wiki/List_of_tz_database_time_zones (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call openForAsync(String xApiKey, String serviceName, OffsetDateTime start, String timezone, final ApiCallback<OpenForResponse200> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = openForValidateBeforeCall(xApiKey, serviceName, start, timezone, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OpenForResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for queryAvailabilityV2
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param serviceName Name of the callback execution service provisioned in GES. (required)
     * @param start Start date in ISO 8601 format. If no timezone is provided, UTC is assumed and this must be specified in yyyy-MM-ddTHH:mm:ss.SSSZ format. If a timezone is specified, then this must be specified in yyyy-MM-ddTHH:mm:ss.SSS format. If no start time is provided, the start time is assumed to be the current time. (optional)
     * @param startMS Start date in epoch time, that is, the number of milliseconds since 00:00:00, Thursday, 1 January 1970 (UTC). You must also set the endMS or numberOfDays parameter; otherwise, the end date is assumed to be the startMS date. If you set the startMS parameter, do not set the start or timestamp parameters. (optional)
     * @param numberOfDays Used as an alternative to the end date. If neither end nor numberOfDays is specified, the end date is assumed to be the start date. (optional)
     * @param end End date in ISO 8601 format. If no timezone is provided, UTC is assumed and this must be specified in yyyy-MM-ddTHH:mm:ss.SSSZ format. If a timezone is specified, then this must be specified in yyyy-MM-ddTHH:mm:ss.SSS format. If neither end nor numberOfDays is specified, the end time is assumed to be the start time.  (optional)
     * @param endMS End date in epoch time, that is, the number of milliseconds since 00:00:00, Thursday, 1 January 1970 (UTC). Set only one of the end, endMS, or numberOfDays parameters. (optional)
     * @param timezone Timezone for the start and end date parameters. If not specified, the default is UTC. Additionally, the response object will return the localTime fields formatted in this timezone. For a list of possible values, see the TZ column of the list in https://en.wikipedia.org/wiki/List_of_tz_database_time_zones (optional)
     * @param maxTimeSlots Maximum number of time slots to include in the response when the office is open and its capacity is above zero. Use this parameter to improve the performance of the query over a long period of time. (optional)
     * @param reportBusy If true, the response includes the slots where the office is open and where callbacks are booked to full capacity. By default, reportBusy is false. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call queryAvailabilityV2Call(String xApiKey, String serviceName, OffsetDateTime start, BigDecimal startMS, BigDecimal numberOfDays, OffsetDateTime end, BigDecimal endMS, String timezone, BigDecimal maxTimeSlots, Boolean reportBusy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/callbacks/availability/{service-name}"
            .replaceAll("\\{" + "service-name" + "\\}", apiClient.escapeString(serviceName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
        if (startMS != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startMS", startMS));
        if (numberOfDays != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("numberOfDays", numberOfDays));
        if (end != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end", end));
        if (endMS != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endMS", endMS));
        if (timezone != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("timezone", timezone));
        if (maxTimeSlots != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("maxTimeSlots", maxTimeSlots));
        if (reportBusy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("reportBusy", reportBusy));

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
    private com.squareup.okhttp.Call queryAvailabilityV2ValidateBeforeCall(String xApiKey, String serviceName, OffsetDateTime start, BigDecimal startMS, BigDecimal numberOfDays, OffsetDateTime end, BigDecimal endMS, String timezone, BigDecimal maxTimeSlots, Boolean reportBusy, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling queryAvailabilityV2(Async)");
        }
        
        // verify the required parameter 'serviceName' is set
        if (serviceName == null) {
            throw new ApiException("Missing the required parameter 'serviceName' when calling queryAvailabilityV2(Async)");
        }
        

        com.squareup.okhttp.Call call = queryAvailabilityV2Call(xApiKey, serviceName, start, startMS, numberOfDays, end, endMS, timezone, maxTimeSlots, reportBusy, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Gets available time slots for a given queue.
     * Retrieves a map of slots in which the office capacity is not full.
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param serviceName Name of the callback execution service provisioned in GES. (required)
     * @param start Start date in ISO 8601 format. If no timezone is provided, UTC is assumed and this must be specified in yyyy-MM-ddTHH:mm:ss.SSSZ format. If a timezone is specified, then this must be specified in yyyy-MM-ddTHH:mm:ss.SSS format. If no start time is provided, the start time is assumed to be the current time. (optional)
     * @param startMS Start date in epoch time, that is, the number of milliseconds since 00:00:00, Thursday, 1 January 1970 (UTC). You must also set the endMS or numberOfDays parameter; otherwise, the end date is assumed to be the startMS date. If you set the startMS parameter, do not set the start or timestamp parameters. (optional)
     * @param numberOfDays Used as an alternative to the end date. If neither end nor numberOfDays is specified, the end date is assumed to be the start date. (optional)
     * @param end End date in ISO 8601 format. If no timezone is provided, UTC is assumed and this must be specified in yyyy-MM-ddTHH:mm:ss.SSSZ format. If a timezone is specified, then this must be specified in yyyy-MM-ddTHH:mm:ss.SSS format. If neither end nor numberOfDays is specified, the end time is assumed to be the start time.  (optional)
     * @param endMS End date in epoch time, that is, the number of milliseconds since 00:00:00, Thursday, 1 January 1970 (UTC). Set only one of the end, endMS, or numberOfDays parameters. (optional)
     * @param timezone Timezone for the start and end date parameters. If not specified, the default is UTC. Additionally, the response object will return the localTime fields formatted in this timezone. For a list of possible values, see the TZ column of the list in https://en.wikipedia.org/wiki/List_of_tz_database_time_zones (optional)
     * @param maxTimeSlots Maximum number of time slots to include in the response when the office is open and its capacity is above zero. Use this parameter to improve the performance of the query over a long period of time. (optional)
     * @param reportBusy If true, the response includes the slots where the office is open and where callbacks are booked to full capacity. By default, reportBusy is false. (optional)
     * @return AvailabilitiesResponse200
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AvailabilitiesResponse200 queryAvailabilityV2(String xApiKey, String serviceName, OffsetDateTime start, BigDecimal startMS, BigDecimal numberOfDays, OffsetDateTime end, BigDecimal endMS, String timezone, BigDecimal maxTimeSlots, Boolean reportBusy) throws ApiException {
        ApiResponse<AvailabilitiesResponse200> resp = queryAvailabilityV2WithHttpInfo(xApiKey, serviceName, start, startMS, numberOfDays, end, endMS, timezone, maxTimeSlots, reportBusy);
        return resp.getData();
    }

    /**
     * Gets available time slots for a given queue.
     * Retrieves a map of slots in which the office capacity is not full.
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param serviceName Name of the callback execution service provisioned in GES. (required)
     * @param start Start date in ISO 8601 format. If no timezone is provided, UTC is assumed and this must be specified in yyyy-MM-ddTHH:mm:ss.SSSZ format. If a timezone is specified, then this must be specified in yyyy-MM-ddTHH:mm:ss.SSS format. If no start time is provided, the start time is assumed to be the current time. (optional)
     * @param startMS Start date in epoch time, that is, the number of milliseconds since 00:00:00, Thursday, 1 January 1970 (UTC). You must also set the endMS or numberOfDays parameter; otherwise, the end date is assumed to be the startMS date. If you set the startMS parameter, do not set the start or timestamp parameters. (optional)
     * @param numberOfDays Used as an alternative to the end date. If neither end nor numberOfDays is specified, the end date is assumed to be the start date. (optional)
     * @param end End date in ISO 8601 format. If no timezone is provided, UTC is assumed and this must be specified in yyyy-MM-ddTHH:mm:ss.SSSZ format. If a timezone is specified, then this must be specified in yyyy-MM-ddTHH:mm:ss.SSS format. If neither end nor numberOfDays is specified, the end time is assumed to be the start time.  (optional)
     * @param endMS End date in epoch time, that is, the number of milliseconds since 00:00:00, Thursday, 1 January 1970 (UTC). Set only one of the end, endMS, or numberOfDays parameters. (optional)
     * @param timezone Timezone for the start and end date parameters. If not specified, the default is UTC. Additionally, the response object will return the localTime fields formatted in this timezone. For a list of possible values, see the TZ column of the list in https://en.wikipedia.org/wiki/List_of_tz_database_time_zones (optional)
     * @param maxTimeSlots Maximum number of time slots to include in the response when the office is open and its capacity is above zero. Use this parameter to improve the performance of the query over a long period of time. (optional)
     * @param reportBusy If true, the response includes the slots where the office is open and where callbacks are booked to full capacity. By default, reportBusy is false. (optional)
     * @return ApiResponse&lt;AvailabilitiesResponse200&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AvailabilitiesResponse200> queryAvailabilityV2WithHttpInfo(String xApiKey, String serviceName, OffsetDateTime start, BigDecimal startMS, BigDecimal numberOfDays, OffsetDateTime end, BigDecimal endMS, String timezone, BigDecimal maxTimeSlots, Boolean reportBusy) throws ApiException {
        com.squareup.okhttp.Call call = queryAvailabilityV2ValidateBeforeCall(xApiKey, serviceName, start, startMS, numberOfDays, end, endMS, timezone, maxTimeSlots, reportBusy, null, null);
        Type localVarReturnType = new TypeToken<AvailabilitiesResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets available time slots for a given queue. (asynchronously)
     * Retrieves a map of slots in which the office capacity is not full.
     * @param xApiKey API Key. For example,  Z2y9eiTiQZ4ceKNpxy1YAarhpvxJXPCj4rFrbVep (required)
     * @param serviceName Name of the callback execution service provisioned in GES. (required)
     * @param start Start date in ISO 8601 format. If no timezone is provided, UTC is assumed and this must be specified in yyyy-MM-ddTHH:mm:ss.SSSZ format. If a timezone is specified, then this must be specified in yyyy-MM-ddTHH:mm:ss.SSS format. If no start time is provided, the start time is assumed to be the current time. (optional)
     * @param startMS Start date in epoch time, that is, the number of milliseconds since 00:00:00, Thursday, 1 January 1970 (UTC). You must also set the endMS or numberOfDays parameter; otherwise, the end date is assumed to be the startMS date. If you set the startMS parameter, do not set the start or timestamp parameters. (optional)
     * @param numberOfDays Used as an alternative to the end date. If neither end nor numberOfDays is specified, the end date is assumed to be the start date. (optional)
     * @param end End date in ISO 8601 format. If no timezone is provided, UTC is assumed and this must be specified in yyyy-MM-ddTHH:mm:ss.SSSZ format. If a timezone is specified, then this must be specified in yyyy-MM-ddTHH:mm:ss.SSS format. If neither end nor numberOfDays is specified, the end time is assumed to be the start time.  (optional)
     * @param endMS End date in epoch time, that is, the number of milliseconds since 00:00:00, Thursday, 1 January 1970 (UTC). Set only one of the end, endMS, or numberOfDays parameters. (optional)
     * @param timezone Timezone for the start and end date parameters. If not specified, the default is UTC. Additionally, the response object will return the localTime fields formatted in this timezone. For a list of possible values, see the TZ column of the list in https://en.wikipedia.org/wiki/List_of_tz_database_time_zones (optional)
     * @param maxTimeSlots Maximum number of time slots to include in the response when the office is open and its capacity is above zero. Use this parameter to improve the performance of the query over a long period of time. (optional)
     * @param reportBusy If true, the response includes the slots where the office is open and where callbacks are booked to full capacity. By default, reportBusy is false. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call queryAvailabilityV2Async(String xApiKey, String serviceName, OffsetDateTime start, BigDecimal startMS, BigDecimal numberOfDays, OffsetDateTime end, BigDecimal endMS, String timezone, BigDecimal maxTimeSlots, Boolean reportBusy, final ApiCallback<AvailabilitiesResponse200> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = queryAvailabilityV2ValidateBeforeCall(xApiKey, serviceName, start, startMS, numberOfDays, end, endMS, timezone, maxTimeSlots, reportBusy, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AvailabilitiesResponse200>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
