// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A managed server DNS alias acquisition request. */
@Fluent
public final class ManagedServerDnsAliasAcquisition {
    /*
     * The resource ID of the managed server DNS alias that will be acquired to point to this managed server instead.
     */
    @JsonProperty(value = "oldManagedServerDnsAliasResourceId", required = true)
    private String oldManagedServerDnsAliasResourceId;

    /** Creates an instance of ManagedServerDnsAliasAcquisition class. */
    public ManagedServerDnsAliasAcquisition() {
    }

    /**
     * Get the oldManagedServerDnsAliasResourceId property: The resource ID of the managed server DNS alias that will be
     * acquired to point to this managed server instead.
     *
     * @return the oldManagedServerDnsAliasResourceId value.
     */
    public String oldManagedServerDnsAliasResourceId() {
        return this.oldManagedServerDnsAliasResourceId;
    }

    /**
     * Set the oldManagedServerDnsAliasResourceId property: The resource ID of the managed server DNS alias that will be
     * acquired to point to this managed server instead.
     *
     * @param oldManagedServerDnsAliasResourceId the oldManagedServerDnsAliasResourceId value to set.
     * @return the ManagedServerDnsAliasAcquisition object itself.
     */
    public ManagedServerDnsAliasAcquisition withOldManagedServerDnsAliasResourceId(
        String oldManagedServerDnsAliasResourceId) {
        this.oldManagedServerDnsAliasResourceId = oldManagedServerDnsAliasResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (oldManagedServerDnsAliasResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property oldManagedServerDnsAliasResourceId in model"
                            + " ManagedServerDnsAliasAcquisition"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedServerDnsAliasAcquisition.class);
}