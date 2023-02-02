// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.generated;

/** Samples for Recommendations Generate. */
public final class RecommendationsGenerateSamples {
    /*
     * x-ms-original-file: specification/advisor/resource-manager/Microsoft.Advisor/stable/2020-01-01/examples/GenerateRecommendations.json
     */
    /**
     * Sample code: GenerateRecommendations.
     *
     * @param manager Entry point to AdvisorManager.
     */
    public static void generateRecommendations(com.azure.resourcemanager.advisor.AdvisorManager manager) {
        manager.recommendations().generateWithResponse(com.azure.core.util.Context.NONE);
    }
}