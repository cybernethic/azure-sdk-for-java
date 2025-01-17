// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

/** Samples for RuleSets Create. */
public final class RuleSetsCreateSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/RuleSets_Create.json
     */
    /**
     * Sample code: RuleSets_Create.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void ruleSetsCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getRuleSets()
            .createWithResponse("RG", "profile1", "ruleSet1", com.azure.core.util.Context.NONE);
    }
}
