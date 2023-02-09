// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.operationsmanagement.fluent.models.OperationInner;
import com.azure.resourcemanager.operationsmanagement.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class OperationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"bjf\",\"display\":{\"provider\":\"mbmbexppbh\",\"resource\":\"qrolfpf\",\"operation\":\"algbquxigjyjg\"}}")
                .toObject(OperationInner.class);
        Assertions.assertEquals("bjf", model.name());
        Assertions.assertEquals("mbmbexppbh", model.display().provider());
        Assertions.assertEquals("qrolfpf", model.display().resource());
        Assertions.assertEquals("algbquxigjyjg", model.display().operation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationInner model =
            new OperationInner()
                .withName("bjf")
                .withDisplay(
                    new OperationDisplay()
                        .withProvider("mbmbexppbh")
                        .withResource("qrolfpf")
                        .withOperation("algbquxigjyjg"));
        model = BinaryData.fromObject(model).toObject(OperationInner.class);
        Assertions.assertEquals("bjf", model.name());
        Assertions.assertEquals("mbmbexppbh", model.display().provider());
        Assertions.assertEquals("qrolfpf", model.display().resource());
        Assertions.assertEquals("algbquxigjyjg", model.display().operation());
    }
}