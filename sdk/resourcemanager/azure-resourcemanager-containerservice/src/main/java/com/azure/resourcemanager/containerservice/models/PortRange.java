// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The port range. */
@Fluent
public final class PortRange {
    /*
     * The minimum port that is included in the range. It should be ranged from 1 to 65535, and be less than or equal
     * to portEnd.
     */
    @JsonProperty(value = "portStart")
    private Integer portStart;

    /*
     * The maximum port that is included in the range. It should be ranged from 1 to 65535, and be greater than or
     * equal to portStart.
     */
    @JsonProperty(value = "portEnd")
    private Integer portEnd;

    /*
     * The network protocol of the port.
     */
    @JsonProperty(value = "protocol")
    private Protocol protocol;

    /** Creates an instance of PortRange class. */
    public PortRange() {
    }

    /**
     * Get the portStart property: The minimum port that is included in the range. It should be ranged from 1 to 65535,
     * and be less than or equal to portEnd.
     *
     * @return the portStart value.
     */
    public Integer portStart() {
        return this.portStart;
    }

    /**
     * Set the portStart property: The minimum port that is included in the range. It should be ranged from 1 to 65535,
     * and be less than or equal to portEnd.
     *
     * @param portStart the portStart value to set.
     * @return the PortRange object itself.
     */
    public PortRange withPortStart(Integer portStart) {
        this.portStart = portStart;
        return this;
    }

    /**
     * Get the portEnd property: The maximum port that is included in the range. It should be ranged from 1 to 65535,
     * and be greater than or equal to portStart.
     *
     * @return the portEnd value.
     */
    public Integer portEnd() {
        return this.portEnd;
    }

    /**
     * Set the portEnd property: The maximum port that is included in the range. It should be ranged from 1 to 65535,
     * and be greater than or equal to portStart.
     *
     * @param portEnd the portEnd value to set.
     * @return the PortRange object itself.
     */
    public PortRange withPortEnd(Integer portEnd) {
        this.portEnd = portEnd;
        return this;
    }

    /**
     * Get the protocol property: The network protocol of the port.
     *
     * @return the protocol value.
     */
    public Protocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The network protocol of the port.
     *
     * @param protocol the protocol value to set.
     * @return the PortRange object itself.
     */
    public PortRange withProtocol(Protocol protocol) {
        this.protocol = protocol;
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