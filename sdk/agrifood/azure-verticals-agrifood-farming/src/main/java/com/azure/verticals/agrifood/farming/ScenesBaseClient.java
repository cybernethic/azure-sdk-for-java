// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.verticals.agrifood.farming;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.experimental.http.DynamicRequest;
import com.azure.core.http.HttpMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.util.serializer.ObjectSerializer;

/** Initializes a new instance of the ScenesBaseClient type. */
@ServiceClient(builder = FarmBeatsClientBuilder.class)
public final class ScenesBaseClient {
    private final String endpoint;

    private final String apiVersion;

    private final HttpPipeline httpPipeline;

    private final ObjectSerializer serializer;

    /**
     * Initializes an instance of ScenesBaseClient client.
     *
     * @param endpoint The endpoint of your FarmBeats resource (protocol and hostname, for example:
     *     https://{resourceName}.farmbeats.azure.net).
     * @param apiVersion Api Version.
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializer The serializer to serialize an object into a string.
     */
    ScenesBaseClient(String endpoint, String apiVersion, HttpPipeline httpPipeline, ObjectSerializer serializer) {
        this.endpoint = endpoint;
        this.apiVersion = apiVersion;
        this.httpPipeline = httpPipeline;
        this.serializer = serializer;
    }

    /**
     * Returns a paginated list of scene resources.
     *
     * <p><strong>Optional Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Optional Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Description</th></tr>
     *     <tr><td>source</td><td>String</td><td>Source name of scene data, default value Sentinel_2_L2A (Sentinel 2 L2A).</td></tr>
     *     <tr><td>startDateTime</td><td>OffsetDateTime</td><td>Scene start UTC datetime (inclusive), sample format: yyyy-MM-ddThh:mm:ssZ.</td></tr>
     *     <tr><td>endDateTime</td><td>OffsetDateTime</td><td>Scene end UTC datetime (inclusive), sample format: yyyy-MM-dThh:mm:ssZ.</td></tr>
     *     <tr><td>maxCloudCoveragePercentage</td><td>Double</td><td>Filter scenes with cloud coverage percentage less than max value. Range [0 to 100.0].</td></tr>
     *     <tr><td>maxDarkPixelCoveragePercentage</td><td>Double</td><td>Filter scenes with dark pixel coverage percentage less than max value. Range [0 to 100.0].</td></tr>
     *     <tr><td>imageNames</td><td>List&lt;String&gt;</td><td>List of image names to be filtered.</td></tr>
     *     <tr><td>imageResolutions</td><td>List&lt;Double&gt;</td><td>List of image resolutions in meters to be filtered.</td></tr>
     *     <tr><td>imageFormats</td><td>List&lt;String&gt;</td><td>List of image formats to be filtered.</td></tr>
     *     <tr><td>maxPageSize</td><td>Integer</td><td>Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.</td></tr>
     *     <tr><td>skipToken</td><td>String</td><td>Skip token for getting next set of results.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             sceneDateTime: OffsetDateTime
     *             provider: String
     *             source: String
     *             imageFiles: [
     *                 {
     *                     fileLink: String
     *                     name: String
     *                     imageFormat: String(TIF)
     *                     resolution: Double
     *                 }
     *             ]
     *             imageFormat: String(TIF)
     *             cloudCoverPercentage: Double
     *             darkPixelPercentage: Double
     *             ndviMedianValue: Double
     *             boundaryId: String
     *             farmerId: String
     *             id: String
     *             eTag: String
     *         }
     *     ]
     *     skipToken: String
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param provider Provider name of scene data.
     * @param farmerId FarmerId.
     * @param boundaryId BoundaryId.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest list(String provider, String farmerId, String boundaryId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/scenes")
                .setPathParam("Endpoint", endpoint)
                .addQueryParam("provider", provider)
                .addQueryParam("farmerId", farmerId)
                .addQueryParam("boundaryId", boundaryId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Create a satellite data ingestion job.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     farmerId: String
     *     boundaryId: String
     *     startDateTime: OffsetDateTime
     *     endDateTime: OffsetDateTime
     *     provider: String(Microsoft)
     *     source: String(Sentinel_2_L2A)
     *     data: {
     *         imageNames: [
     *             String
     *         ]
     *         imageFormats: [
     *             String
     *         ]
     *         imageResolutions: [
     *             double
     *         ]
     *     }
     *     id: String
     *     status: String
     *     durationInSeconds: Double
     *     message: String
     *     createdDateTime: OffsetDateTime
     *     lastActionDateTime: OffsetDateTime
     *     startTime: OffsetDateTime
     *     endTime: OffsetDateTime
     *     name: String
     *     description: String
     *     properties: {
     *         String: Object
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * (recursive schema, see above)
     * }</pre>
     *
     * @param jobId JobId provided by user.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest createSatelliteDataIngestionJob(String jobId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/scenes/satellite/ingest-data/{jobId}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("jobId", jobId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.PUT);
    }

    /**
     * Get a satellite data ingestion job.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     farmerId: String
     *     boundaryId: String
     *     startDateTime: OffsetDateTime
     *     endDateTime: OffsetDateTime
     *     provider: String(Microsoft)
     *     source: String(Sentinel_2_L2A)
     *     data: {
     *         imageNames: [
     *             String
     *         ]
     *         imageFormats: [
     *             String
     *         ]
     *         imageResolutions: [
     *             double
     *         ]
     *     }
     *     id: String
     *     status: String
     *     durationInSeconds: Double
     *     message: String
     *     createdDateTime: OffsetDateTime
     *     lastActionDateTime: OffsetDateTime
     *     startTime: OffsetDateTime
     *     endTime: OffsetDateTime
     *     name: String
     *     description: String
     *     properties: {
     *         String: Object
     *     }
     * }
     * }</pre>
     *
     * @param jobId ID of the job.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest getSatelliteDataIngestionJobDetails(String jobId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/scenes/satellite/ingest-data/{jobId}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("jobId", jobId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Downloads and returns file stream as response for the given input filePath.
     *
     * @param filePath cloud storage path of scene file.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest download(String filePath) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/scenes/downloadFiles")
                .setPathParam("Endpoint", endpoint)
                .addQueryParam("filePath", filePath)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/octet-stream, application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             sceneDateTime: OffsetDateTime
     *             provider: String
     *             source: String
     *             imageFiles: [
     *                 {
     *                     fileLink: String
     *                     name: String
     *                     imageFormat: String(TIF)
     *                     resolution: Double
     *                 }
     *             ]
     *             imageFormat: String(TIF)
     *             cloudCoverPercentage: Double
     *             darkPixelPercentage: Double
     *             ndviMedianValue: Double
     *             boundaryId: String
     *             farmerId: String
     *             id: String
     *             eTag: String
     *         }
     *     ]
     *     skipToken: String
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest listNext(String nextLink) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/{nextLink}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("nextLink", nextLink)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Create an empty DynamicRequest with the serializer and pipeline initialized for this client.
     *
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest invoke() {
        return new DynamicRequest(serializer, httpPipeline);
    }
}