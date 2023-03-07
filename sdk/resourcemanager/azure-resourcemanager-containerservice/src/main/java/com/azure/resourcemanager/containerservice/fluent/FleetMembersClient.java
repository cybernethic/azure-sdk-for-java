// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.containerservice.fluent.models.FleetMemberInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in FleetMembersClient. */
public interface FleetMembersClient {
    /**
     * Lists the members of a fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List FleetMembers operation as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<FleetMemberInner> listByFleetAsync(String resourceGroupName, String fleetName);

    /**
     * Lists the members of a fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List FleetMembers operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FleetMemberInner> listByFleet(String resourceGroupName, String fleetName);

    /**
     * Lists the members of a fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from the List FleetMembers operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FleetMemberInner> listByFleet(String resourceGroupName, String fleetName, Context context);

    /**
     * Gets a Fleet member.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Fleet member along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<FleetMemberInner>> getWithResponseAsync(
        String resourceGroupName, String fleetName, String fleetMemberName);

    /**
     * Gets a Fleet member.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Fleet member on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<FleetMemberInner> getAsync(String resourceGroupName, String fleetName, String fleetMemberName);

    /**
     * Gets a Fleet member.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Fleet member along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FleetMemberInner> getWithResponse(
        String resourceGroupName, String fleetName, String fleetMemberName, Context context);

    /**
     * Gets a Fleet member.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Fleet member.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FleetMemberInner get(String resourceGroupName, String fleetName, String fleetMemberName);

    /**
     * Creates or updates a fleet member.
     *
     * <p>A member contains a reference to an existing Kubernetes cluster. Creating a member makes the referenced
     * cluster join the Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @param parameters The Fleet member to create or update.
     * @param ifMatch Omit this value to always overwrite the current resource. Specify the last-seen ETag value to
     *     prevent accidentally overwriting concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new resource to be created and prevent updating an existing resource.
     *     Other values will result in a 412 Pre-condition Failed response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a member of the Fleet along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String fleetName,
        String fleetMemberName,
        FleetMemberInner parameters,
        String ifMatch,
        String ifNoneMatch);

    /**
     * Creates or updates a fleet member.
     *
     * <p>A member contains a reference to an existing Kubernetes cluster. Creating a member makes the referenced
     * cluster join the Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @param parameters The Fleet member to create or update.
     * @param ifMatch Omit this value to always overwrite the current resource. Specify the last-seen ETag value to
     *     prevent accidentally overwriting concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new resource to be created and prevent updating an existing resource.
     *     Other values will result in a 412 Pre-condition Failed response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a member of the Fleet.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<FleetMemberInner>, FleetMemberInner> beginCreateOrUpdateAsync(
        String resourceGroupName,
        String fleetName,
        String fleetMemberName,
        FleetMemberInner parameters,
        String ifMatch,
        String ifNoneMatch);

    /**
     * Creates or updates a fleet member.
     *
     * <p>A member contains a reference to an existing Kubernetes cluster. Creating a member makes the referenced
     * cluster join the Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @param parameters The Fleet member to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a member of the Fleet.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<FleetMemberInner>, FleetMemberInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String fleetName, String fleetMemberName, FleetMemberInner parameters);

    /**
     * Creates or updates a fleet member.
     *
     * <p>A member contains a reference to an existing Kubernetes cluster. Creating a member makes the referenced
     * cluster join the Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @param parameters The Fleet member to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a member of the Fleet.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FleetMemberInner>, FleetMemberInner> beginCreateOrUpdate(
        String resourceGroupName, String fleetName, String fleetMemberName, FleetMemberInner parameters);

    /**
     * Creates or updates a fleet member.
     *
     * <p>A member contains a reference to an existing Kubernetes cluster. Creating a member makes the referenced
     * cluster join the Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @param parameters The Fleet member to create or update.
     * @param ifMatch Omit this value to always overwrite the current resource. Specify the last-seen ETag value to
     *     prevent accidentally overwriting concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new resource to be created and prevent updating an existing resource.
     *     Other values will result in a 412 Pre-condition Failed response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a member of the Fleet.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<FleetMemberInner>, FleetMemberInner> beginCreateOrUpdate(
        String resourceGroupName,
        String fleetName,
        String fleetMemberName,
        FleetMemberInner parameters,
        String ifMatch,
        String ifNoneMatch,
        Context context);

    /**
     * Creates or updates a fleet member.
     *
     * <p>A member contains a reference to an existing Kubernetes cluster. Creating a member makes the referenced
     * cluster join the Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @param parameters The Fleet member to create or update.
     * @param ifMatch Omit this value to always overwrite the current resource. Specify the last-seen ETag value to
     *     prevent accidentally overwriting concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new resource to be created and prevent updating an existing resource.
     *     Other values will result in a 412 Pre-condition Failed response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a member of the Fleet on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<FleetMemberInner> createOrUpdateAsync(
        String resourceGroupName,
        String fleetName,
        String fleetMemberName,
        FleetMemberInner parameters,
        String ifMatch,
        String ifNoneMatch);

    /**
     * Creates or updates a fleet member.
     *
     * <p>A member contains a reference to an existing Kubernetes cluster. Creating a member makes the referenced
     * cluster join the Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @param parameters The Fleet member to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a member of the Fleet on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<FleetMemberInner> createOrUpdateAsync(
        String resourceGroupName, String fleetName, String fleetMemberName, FleetMemberInner parameters);

    /**
     * Creates or updates a fleet member.
     *
     * <p>A member contains a reference to an existing Kubernetes cluster. Creating a member makes the referenced
     * cluster join the Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @param parameters The Fleet member to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a member of the Fleet.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FleetMemberInner createOrUpdate(
        String resourceGroupName, String fleetName, String fleetMemberName, FleetMemberInner parameters);

    /**
     * Creates or updates a fleet member.
     *
     * <p>A member contains a reference to an existing Kubernetes cluster. Creating a member makes the referenced
     * cluster join the Fleet.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @param parameters The Fleet member to create or update.
     * @param ifMatch Omit this value to always overwrite the current resource. Specify the last-seen ETag value to
     *     prevent accidentally overwriting concurrent changes.
     * @param ifNoneMatch Set to '*' to allow a new resource to be created and prevent updating an existing resource.
     *     Other values will result in a 412 Pre-condition Failed response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a member of the Fleet.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FleetMemberInner createOrUpdate(
        String resourceGroupName,
        String fleetName,
        String fleetMemberName,
        FleetMemberInner parameters,
        String ifMatch,
        String ifNoneMatch,
        Context context);

    /**
     * Deletes a fleet member.
     *
     * <p>Deleting a Fleet member results in the member cluster leaving fleet. The Member azure resource is deleted upon
     * success. The underlying cluster is not deleted.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @param ifMatch Omit this value to always overwrite the current resource. Specify the last-seen ETag value to
     *     prevent accidentally overwriting concurrent changes.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String fleetName, String fleetMemberName, String ifMatch);

    /**
     * Deletes a fleet member.
     *
     * <p>Deleting a Fleet member results in the member cluster leaving fleet. The Member azure resource is deleted upon
     * success. The underlying cluster is not deleted.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @param ifMatch Omit this value to always overwrite the current resource. Specify the last-seen ETag value to
     *     prevent accidentally overwriting concurrent changes.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String fleetName, String fleetMemberName, String ifMatch);

    /**
     * Deletes a fleet member.
     *
     * <p>Deleting a Fleet member results in the member cluster leaving fleet. The Member azure resource is deleted upon
     * success. The underlying cluster is not deleted.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String fleetName, String fleetMemberName);

    /**
     * Deletes a fleet member.
     *
     * <p>Deleting a Fleet member results in the member cluster leaving fleet. The Member azure resource is deleted upon
     * success. The underlying cluster is not deleted.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String fleetName, String fleetMemberName);

    /**
     * Deletes a fleet member.
     *
     * <p>Deleting a Fleet member results in the member cluster leaving fleet. The Member azure resource is deleted upon
     * success. The underlying cluster is not deleted.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @param ifMatch Omit this value to always overwrite the current resource. Specify the last-seen ETag value to
     *     prevent accidentally overwriting concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String fleetName, String fleetMemberName, String ifMatch, Context context);

    /**
     * Deletes a fleet member.
     *
     * <p>Deleting a Fleet member results in the member cluster leaving fleet. The Member azure resource is deleted upon
     * success. The underlying cluster is not deleted.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @param ifMatch Omit this value to always overwrite the current resource. Specify the last-seen ETag value to
     *     prevent accidentally overwriting concurrent changes.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String fleetName, String fleetMemberName, String ifMatch);

    /**
     * Deletes a fleet member.
     *
     * <p>Deleting a Fleet member results in the member cluster leaving fleet. The Member azure resource is deleted upon
     * success. The underlying cluster is not deleted.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String fleetName, String fleetMemberName);

    /**
     * Deletes a fleet member.
     *
     * <p>Deleting a Fleet member results in the member cluster leaving fleet. The Member azure resource is deleted upon
     * success. The underlying cluster is not deleted.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String fleetName, String fleetMemberName);

    /**
     * Deletes a fleet member.
     *
     * <p>Deleting a Fleet member results in the member cluster leaving fleet. The Member azure resource is deleted upon
     * success. The underlying cluster is not deleted.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param fleetName The name of the Fleet resource.
     * @param fleetMemberName The name of the Fleet member resource.
     * @param ifMatch Omit this value to always overwrite the current resource. Specify the last-seen ETag value to
     *     prevent accidentally overwriting concurrent changes.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String fleetName, String fleetMemberName, String ifMatch, Context context);
}