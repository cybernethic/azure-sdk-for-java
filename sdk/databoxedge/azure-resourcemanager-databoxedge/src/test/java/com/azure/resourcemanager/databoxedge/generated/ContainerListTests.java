// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databoxedge.models.ContainerList;

public final class ContainerListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContainerList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"containerStatus\":\"OK\",\"dataFormat\":\"AzureFile\",\"createdDateTime\":\"2021-01-12T19:16:50Z\"},\"id\":\"evseotgqrlltmuwl\",\"name\":\"uwz\",\"type\":\"zxb\"},{\"properties\":{\"containerStatus\":\"Updating\",\"dataFormat\":\"AzureFile\",\"createdDateTime\":\"2021-07-22T16:26:04Z\"},\"id\":\"u\",\"name\":\"muvp\",\"type\":\"ttdumorppxebmnzb\"}],\"nextLink\":\"hjpglkf\"}")
                .toObject(ContainerList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContainerList model = new ContainerList();
        model = BinaryData.fromObject(model).toObject(ContainerList.class);
    }
}