// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.DatabaseSecurityAlertPolicyInner;
import com.azure.resourcemanager.sql.models.SecurityAlertPolicyName;
import com.azure.resourcemanager.sql.models.SecurityAlertPolicyState;
import java.util.Arrays;

/** Samples for DatabaseSecurityAlertPolicies CreateOrUpdate. */
public final class DatabaseSecurityAlertPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/DatabaseSecurityAlertCreateMax.json
     */
    /**
     * Sample code: Update a database's threat detection policy with all parameters.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateADatabaseSThreatDetectionPolicyWithAllParameters(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDatabaseSecurityAlertPolicies()
            .createOrUpdateWithResponse(
                "securityalert-4799",
                "securityalert-6440",
                "testdb",
                SecurityAlertPolicyName.DEFAULT,
                new DatabaseSecurityAlertPolicyInner()
                    .withState(SecurityAlertPolicyState.ENABLED)
                    .withDisabledAlerts(Arrays.asList("Sql_Injection", "Usage_Anomaly"))
                    .withEmailAddresses(Arrays.asList("test@microsoft.com", "user@microsoft.com"))
                    .withEmailAccountAdmins(true)
                    .withStorageEndpoint("https://mystorage.blob.core.windows.net")
                    .withStorageAccountAccessKey("fakeTokenPlaceholder")
                    .withRetentionDays(6),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/DatabaseSecurityAlertCreateMin.json
     */
    /**
     * Sample code: Update a database's threat detection policy with minimal parameters.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateADatabaseSThreatDetectionPolicyWithMinimalParameters(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDatabaseSecurityAlertPolicies()
            .createOrUpdateWithResponse(
                "securityalert-4799",
                "securityalert-6440",
                "testdb",
                SecurityAlertPolicyName.DEFAULT,
                new DatabaseSecurityAlertPolicyInner().withState(SecurityAlertPolicyState.ENABLED),
                Context.NONE);
    }
}