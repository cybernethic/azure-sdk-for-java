// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

/** Samples for Fleets GetByResourceGroup. */
public final class FleetsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/aks/preview/2022-09-02-preview/examples/Fleets_Get.json
     */
    /**
     * Sample code: Gets a fleet resource.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsAFleetResource(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getFleets()
            .getByResourceGroupWithResponse("rg1", "fleet-1", com.azure.core.util.Context.NONE);
    }
}