// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

/** Samples for PrivateEndpointConnections Get. */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/databricks/resource-manager/Microsoft.Databricks/preview/2021-04-01-preview/examples/PrivateEndpointConnectionsGet.json
     */
    /**
     * Sample code: Get a private endpoint connection.
     *
     * @param manager Entry point to AzureDatabricksManager.
     */
    public static void getAPrivateEndpointConnection(
        com.azure.resourcemanager.databricks.AzureDatabricksManager manager) {
        manager
            .privateEndpointConnections()
            .getWithResponse(
                "myResourceGroup",
                "myWorkspace",
                "myWorkspace.23456789-1111-1111-1111-111111111111",
                com.azure.core.util.Context.NONE);
    }
}