// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.resourcemanager.reservations.fluent.models.ChangeDirectoryResponseInner;
import java.util.List;

/** An immutable client-side representation of ChangeDirectoryResponse. */
public interface ChangeDirectoryResponse {
    /**
     * Gets the reservationOrder property: Change directory result for reservation order or reservation.
     *
     * @return the reservationOrder value.
     */
    ChangeDirectoryResult reservationOrder();

    /**
     * Gets the reservations property: The reservations property.
     *
     * @return the reservations value.
     */
    List<ChangeDirectoryResult> reservations();

    /**
     * Gets the inner com.azure.resourcemanager.reservations.fluent.models.ChangeDirectoryResponseInner object.
     *
     * @return the inner object.
     */
    ChangeDirectoryResponseInner innerModel();
}