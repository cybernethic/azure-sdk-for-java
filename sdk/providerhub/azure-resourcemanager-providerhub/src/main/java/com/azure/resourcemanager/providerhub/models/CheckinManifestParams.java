// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CheckinManifestParams model. */
@Fluent
public final class CheckinManifestParams {
    /*
     * The environment supplied to the checkin manifest operation.
     */
    @JsonProperty(value = "environment", required = true)
    private String environment;

    /*
     * The baseline ARM manifest location supplied to the checkin manifest operation.
     */
    @JsonProperty(value = "baselineArmManifestLocation", required = true)
    private String baselineArmManifestLocation;

    /** Creates an instance of CheckinManifestParams class. */
    public CheckinManifestParams() {
    }

    /**
     * Get the environment property: The environment supplied to the checkin manifest operation.
     *
     * @return the environment value.
     */
    public String environment() {
        return this.environment;
    }

    /**
     * Set the environment property: The environment supplied to the checkin manifest operation.
     *
     * @param environment the environment value to set.
     * @return the CheckinManifestParams object itself.
     */
    public CheckinManifestParams withEnvironment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Get the baselineArmManifestLocation property: The baseline ARM manifest location supplied to the checkin manifest
     * operation.
     *
     * @return the baselineArmManifestLocation value.
     */
    public String baselineArmManifestLocation() {
        return this.baselineArmManifestLocation;
    }

    /**
     * Set the baselineArmManifestLocation property: The baseline ARM manifest location supplied to the checkin manifest
     * operation.
     *
     * @param baselineArmManifestLocation the baselineArmManifestLocation value to set.
     * @return the CheckinManifestParams object itself.
     */
    public CheckinManifestParams withBaselineArmManifestLocation(String baselineArmManifestLocation) {
        this.baselineArmManifestLocation = baselineArmManifestLocation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (environment() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property environment in model CheckinManifestParams"));
        }
        if (baselineArmManifestLocation() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property baselineArmManifestLocation in model CheckinManifestParams"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CheckinManifestParams.class);
}