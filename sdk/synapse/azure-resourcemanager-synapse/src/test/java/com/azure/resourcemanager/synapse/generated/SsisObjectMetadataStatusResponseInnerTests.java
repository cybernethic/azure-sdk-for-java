// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.SsisObjectMetadataStatusResponseInner;
import org.junit.jupiter.api.Assertions;

public final class SsisObjectMetadataStatusResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SsisObjectMetadataStatusResponseInner model =
            BinaryData
                .fromString("{\"status\":\"rpqaf\",\"name\":\"ug\",\"properties\":\"n\",\"error\":\"yetefyp\"}")
                .toObject(SsisObjectMetadataStatusResponseInner.class);
        Assertions.assertEquals("rpqaf", model.status());
        Assertions.assertEquals("ug", model.name());
        Assertions.assertEquals("n", model.properties());
        Assertions.assertEquals("yetefyp", model.error());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SsisObjectMetadataStatusResponseInner model =
            new SsisObjectMetadataStatusResponseInner()
                .withStatus("rpqaf")
                .withName("ug")
                .withProperties("n")
                .withError("yetefyp");
        model = BinaryData.fromObject(model).toObject(SsisObjectMetadataStatusResponseInner.class);
        Assertions.assertEquals("rpqaf", model.status());
        Assertions.assertEquals("ug", model.name());
        Assertions.assertEquals("n", model.properties());
        Assertions.assertEquals("yetefyp", model.error());
    }
}