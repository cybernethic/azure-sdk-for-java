// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The properties that define a service in a service topology. */
@Immutable
public final class ServiceResourceProperties extends ServiceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceResourceProperties.class);

    /** {@inheritDoc} */
    @Override
    public ServiceResourceProperties withTargetLocation(String targetLocation) {
        super.withTargetLocation(targetLocation);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServiceResourceProperties withTargetSubscriptionId(String targetSubscriptionId) {
        super.withTargetSubscriptionId(targetSubscriptionId);
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