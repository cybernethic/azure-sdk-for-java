// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.translation.text.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ProfanityMarker. */
public final class ProfanityMarker extends ExpandableStringEnum<ProfanityMarker> {
    /** Static value Asterisk for ProfanityMarker. */
    public static final ProfanityMarker ASTERISK = fromString("Asterisk");

    /** Static value Tag for ProfanityMarker. */
    public static final ProfanityMarker TAG = fromString("Tag");

    /**
     * Creates a new instance of ProfanityMarker value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProfanityMarker() {}

    /**
     * Creates or finds a ProfanityMarker from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProfanityMarker.
     */
    @JsonCreator
    public static ProfanityMarker fromString(String name) {
        return fromString(name, ProfanityMarker.class);
    }

    /**
     * Gets known ProfanityMarker values.
     *
     * @return known ProfanityMarker values.
     */
    public static Collection<ProfanityMarker> values() {
        return values(ProfanityMarker.class);
    }
}
