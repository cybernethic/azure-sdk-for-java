// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.StreamingLocatorContentKey;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class StreamingLocatorContentKeyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StreamingLocatorContentKey model =
            BinaryData
                .fromString(
                    "{\"id\":\"89118e21-7b62-4f1e-922a-7517207a4213\",\"type\":\"CommonEncryptionCbcs\",\"labelReferenceInStreamingPolicy\":\"um\",\"value\":\"p\",\"policyName\":\"ebmnzbtbhjpglk\",\"tracks\":[{\"trackSelections\":[]},{\"trackSelections\":[]}]}")
                .toObject(StreamingLocatorContentKey.class);
        Assertions.assertEquals(UUID.fromString("89118e21-7b62-4f1e-922a-7517207a4213"), model.id());
        Assertions.assertEquals("um", model.labelReferenceInStreamingPolicy());
        Assertions.assertEquals("p", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StreamingLocatorContentKey model =
            new StreamingLocatorContentKey()
                .withId(UUID.fromString("89118e21-7b62-4f1e-922a-7517207a4213"))
                .withLabelReferenceInStreamingPolicy("um")
                .withValue("p");
        model = BinaryData.fromObject(model).toObject(StreamingLocatorContentKey.class);
        Assertions.assertEquals(UUID.fromString("89118e21-7b62-4f1e-922a-7517207a4213"), model.id());
        Assertions.assertEquals("um", model.labelReferenceInStreamingPolicy());
        Assertions.assertEquals("p", model.value());
    }
}