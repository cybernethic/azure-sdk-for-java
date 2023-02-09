// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.resourcemanager.maintenance.fluent.models.ConfigurationAssignmentInner;

/** Samples for ConfigurationAssignments CreateOrUpdate. */
public final class ConfigurationAssignmentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/maintenance/resource-manager/Microsoft.Maintenance/stable/2021-05-01/examples/ConfigurationAssignments_CreateOrUpdate.json
     */
    /**
     * Sample code: ConfigurationAssignments_CreateOrUpdate.
     *
     * @param manager Entry point to MaintenanceManager.
     */
    public static void configurationAssignmentsCreateOrUpdate(
        com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager
            .configurationAssignments()
            .createOrUpdateWithResponse(
                "examplerg",
                "Microsoft.Compute",
                "virtualMachineScaleSets",
                "smdtest1",
                "workervmConfiguration",
                new ConfigurationAssignmentInner()
                    .withMaintenanceConfigurationId(
                        "/subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourcegroups/examplerg/providers/Microsoft.Maintenance/maintenanceConfigurations/configuration1"),
                com.azure.core.util.Context.NONE);
    }
}