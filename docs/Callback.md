# Callback

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**java.util.UUID**](java.util.UUID.md) | The callback ID. |  [optional]
**desiredTime** | [**OffsetDateTime**](OffsetDateTime.md) | Desired time of the callback in UTC. |  [optional]
**callbackState** | **String** | Current state of the callback. Possible values are - SCHEDULED, QUEUED, ROUTING, PROCESSING, COMPLETED. |  [optional]
**callbackReason** | **String** | Provides a reason for completion. This is only provided if the callback is in a COMPLETED state. |  [optional]
**phoneNumber** | **String** | Number to call back. |  [optional]
**positionInQueue** | **Integer** | Position in queue. This property is only provided if the callback is in one of the following state - QUEUED, ROUTING, or PROCESSING. |  [optional]
**estimatedWaitTime** | **Integer** | Expected waiting time (in seconds). This property is only provided if the callback is in one of the following state - QUEUED, ROUTING, or PROCESSING. |  [optional]
