// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/** Samples for ReplicationvCenters List. */
public final class ReplicationvCentersListSamples {
    /*
     * x-ms-original-file: specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2022-10-01/examples/ReplicationvCenters_List.json
     */
    /**
     * Sample code: Gets the list of vCenter registered under the vault.
     *
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void getsTheListOfVCenterRegisteredUnderTheVault(
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationvCenters().list("MadhaviVault", "MadhaviVRG", com.azure.core.util.Context.NONE);
    }
}