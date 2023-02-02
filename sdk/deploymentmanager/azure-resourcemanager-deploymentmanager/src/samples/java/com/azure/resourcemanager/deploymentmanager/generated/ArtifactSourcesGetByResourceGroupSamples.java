// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

/** Samples for ArtifactSources GetByResourceGroup. */
public final class ArtifactSourcesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/deploymentmanager/resource-manager/Microsoft.DeploymentManager/preview/2019-11-01-preview/examples/artifactsource_get.json
     */
    /**
     * Sample code: Get artifact source.
     *
     * @param manager Entry point to DeploymentManager.
     */
    public static void getArtifactSource(com.azure.resourcemanager.deploymentmanager.DeploymentManager manager) {
        manager
            .artifactSources()
            .getByResourceGroupWithResponse("myResourceGroup", "myArtifactSource", com.azure.core.util.Context.NONE);
    }
}