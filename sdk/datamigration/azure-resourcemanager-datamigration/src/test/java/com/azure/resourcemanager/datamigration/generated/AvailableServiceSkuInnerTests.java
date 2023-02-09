// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.fluent.models.AvailableServiceSkuInner;
import com.azure.resourcemanager.datamigration.models.AvailableServiceSkuCapacity;
import com.azure.resourcemanager.datamigration.models.AvailableServiceSkuSku;
import com.azure.resourcemanager.datamigration.models.ServiceScalability;
import org.junit.jupiter.api.Assertions;

public final class AvailableServiceSkuInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvailableServiceSkuInner model =
            BinaryData
                .fromString(
                    "{\"resourceType\":\"yb\",\"sku\":{\"name\":\"e\",\"family\":\"ytb\",\"size\":\"qfou\",\"tier\":\"mmnkzsmodmgl\"},\"capacity\":{\"minimum\":1767486045,\"maximum\":2107455615,\"default\":815963973,\"scaleType\":\"manual\"}}")
                .toObject(AvailableServiceSkuInner.class);
        Assertions.assertEquals("yb", model.resourceType());
        Assertions.assertEquals("e", model.sku().name());
        Assertions.assertEquals("ytb", model.sku().family());
        Assertions.assertEquals("qfou", model.sku().size());
        Assertions.assertEquals("mmnkzsmodmgl", model.sku().tier());
        Assertions.assertEquals(1767486045, model.capacity().minimum());
        Assertions.assertEquals(2107455615, model.capacity().maximum());
        Assertions.assertEquals(815963973, model.capacity().defaultProperty());
        Assertions.assertEquals(ServiceScalability.MANUAL, model.capacity().scaleType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvailableServiceSkuInner model =
            new AvailableServiceSkuInner()
                .withResourceType("yb")
                .withSku(
                    new AvailableServiceSkuSku()
                        .withName("e")
                        .withFamily("ytb")
                        .withSize("qfou")
                        .withTier("mmnkzsmodmgl"))
                .withCapacity(
                    new AvailableServiceSkuCapacity()
                        .withMinimum(1767486045)
                        .withMaximum(2107455615)
                        .withDefaultProperty(815963973)
                        .withScaleType(ServiceScalability.MANUAL));
        model = BinaryData.fromObject(model).toObject(AvailableServiceSkuInner.class);
        Assertions.assertEquals("yb", model.resourceType());
        Assertions.assertEquals("e", model.sku().name());
        Assertions.assertEquals("ytb", model.sku().family());
        Assertions.assertEquals("qfou", model.sku().size());
        Assertions.assertEquals("mmnkzsmodmgl", model.sku().tier());
        Assertions.assertEquals(1767486045, model.capacity().minimum());
        Assertions.assertEquals(2107455615, model.capacity().maximum());
        Assertions.assertEquals(815963973, model.capacity().defaultProperty());
        Assertions.assertEquals(ServiceScalability.MANUAL, model.capacity().scaleType());
    }
}