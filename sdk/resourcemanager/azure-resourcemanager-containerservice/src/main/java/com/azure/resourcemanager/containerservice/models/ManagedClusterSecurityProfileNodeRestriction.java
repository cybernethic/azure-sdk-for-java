// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Node Restriction settings for the security profile. */
@Fluent
public final class ManagedClusterSecurityProfileNodeRestriction {
    /*
     * Whether to enable Node Restriction
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /** Creates an instance of ManagedClusterSecurityProfileNodeRestriction class. */
    public ManagedClusterSecurityProfileNodeRestriction() {
    }

    /**
     * Get the enabled property: Whether to enable Node Restriction.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether to enable Node Restriction.
     *
     * @param enabled the enabled value to set.
     * @return the ManagedClusterSecurityProfileNodeRestriction object itself.
     */
    public ManagedClusterSecurityProfileNodeRestriction withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}