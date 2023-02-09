// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.azurestack.models.DataDiskImage;
import com.azure.resourcemanager.azurestack.models.OsDiskImage;
import com.azure.resourcemanager.azurestack.models.VirtualMachineExtensionProductProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Product information. */
@Immutable
public final class ExtendedProductProperties extends VirtualMachineExtensionProductProperties {
    /*
     * Specifies product version.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * OS disk image used by product.
     */
    @JsonProperty(value = "osDiskImage", access = JsonProperty.Access.WRITE_ONLY)
    private OsDiskImage osDiskImage;

    /*
     * List of attached data disks.
     */
    @JsonProperty(value = "dataDiskImages", access = JsonProperty.Access.WRITE_ONLY)
    private List<DataDiskImage> dataDiskImages;

    /** Creates an instance of ExtendedProductProperties class. */
    public ExtendedProductProperties() {
    }

    /**
     * Get the version property: Specifies product version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the osDiskImage property: OS disk image used by product.
     *
     * @return the osDiskImage value.
     */
    public OsDiskImage osDiskImage() {
        return this.osDiskImage;
    }

    /**
     * Get the dataDiskImages property: List of attached data disks.
     *
     * @return the dataDiskImages value.
     */
    public List<DataDiskImage> dataDiskImages() {
        return this.dataDiskImages;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (osDiskImage() != null) {
            osDiskImage().validate();
        }
        if (dataDiskImages() != null) {
            dataDiskImages().forEach(e -> e.validate());
        }
    }
}