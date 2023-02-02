// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

/** Samples for Projects ListByResourceGroup. */
public final class ProjectsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/datamigration/resource-manager/Microsoft.DataMigration/stable/2018-04-19/examples/Projects_List.json
     */
    /**
     * Sample code: Projects_ListByResourceGroup.
     *
     * @param manager Entry point to DataMigrationManager.
     */
    public static void projectsListByResourceGroup(
        com.azure.resourcemanager.datamigration.DataMigrationManager manager) {
        manager.projects().listByResourceGroup("DmsSdkRg", "DmsSdkService", com.azure.core.util.Context.NONE);
    }
}