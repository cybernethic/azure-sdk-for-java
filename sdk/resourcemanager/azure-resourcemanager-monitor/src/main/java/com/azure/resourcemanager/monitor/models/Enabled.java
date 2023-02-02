// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The flag which indicates whether the Log Search rule is enabled. Value should be true or false. */
public final class Enabled extends ExpandableStringEnum<Enabled> {
    /** Static value true for Enabled. */
    public static final Enabled TRUE = fromString("true");

    /** Static value false for Enabled. */
    public static final Enabled FALSE = fromString("false");

    /**
     * Creates or finds a Enabled from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Enabled.
     */
    @JsonCreator
    public static Enabled fromString(String name) {
        return fromString(name, Enabled.class);
    }

    /**
     * Gets known Enabled values.
     *
     * @return known Enabled values.
     */
    public static Collection<Enabled> values() {
        return values(Enabled.class);
    }
}