// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** HyperV Replica Blue policy input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("HyperVReplica2012R2")
@Fluent
public final class HyperVReplicaBluePolicyInput extends HyperVReplicaPolicyInput {
    /*
     * A value indicating the replication interval.
     */
    @JsonProperty(value = "replicationFrequencyInSeconds")
    private Integer replicationFrequencyInSeconds;

    /** Creates an instance of HyperVReplicaBluePolicyInput class. */
    public HyperVReplicaBluePolicyInput() {
    }

    /**
     * Get the replicationFrequencyInSeconds property: A value indicating the replication interval.
     *
     * @return the replicationFrequencyInSeconds value.
     */
    public Integer replicationFrequencyInSeconds() {
        return this.replicationFrequencyInSeconds;
    }

    /**
     * Set the replicationFrequencyInSeconds property: A value indicating the replication interval.
     *
     * @param replicationFrequencyInSeconds the replicationFrequencyInSeconds value to set.
     * @return the HyperVReplicaBluePolicyInput object itself.
     */
    public HyperVReplicaBluePolicyInput withReplicationFrequencyInSeconds(Integer replicationFrequencyInSeconds) {
        this.replicationFrequencyInSeconds = replicationFrequencyInSeconds;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HyperVReplicaBluePolicyInput withRecoveryPoints(Integer recoveryPoints) {
        super.withRecoveryPoints(recoveryPoints);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HyperVReplicaBluePolicyInput withApplicationConsistentSnapshotFrequencyInHours(
        Integer applicationConsistentSnapshotFrequencyInHours) {
        super.withApplicationConsistentSnapshotFrequencyInHours(applicationConsistentSnapshotFrequencyInHours);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HyperVReplicaBluePolicyInput withCompression(String compression) {
        super.withCompression(compression);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HyperVReplicaBluePolicyInput withInitialReplicationMethod(String initialReplicationMethod) {
        super.withInitialReplicationMethod(initialReplicationMethod);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HyperVReplicaBluePolicyInput withOnlineReplicationStartTime(String onlineReplicationStartTime) {
        super.withOnlineReplicationStartTime(onlineReplicationStartTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HyperVReplicaBluePolicyInput withOfflineReplicationImportPath(String offlineReplicationImportPath) {
        super.withOfflineReplicationImportPath(offlineReplicationImportPath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HyperVReplicaBluePolicyInput withOfflineReplicationExportPath(String offlineReplicationExportPath) {
        super.withOfflineReplicationExportPath(offlineReplicationExportPath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HyperVReplicaBluePolicyInput withReplicationPort(Integer replicationPort) {
        super.withReplicationPort(replicationPort);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HyperVReplicaBluePolicyInput withAllowedAuthenticationType(Integer allowedAuthenticationType) {
        super.withAllowedAuthenticationType(allowedAuthenticationType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HyperVReplicaBluePolicyInput withReplicaDeletion(String replicaDeletion) {
        super.withReplicaDeletion(replicaDeletion);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}