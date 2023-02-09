// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentSkuDefinitionSku;
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironmentSkuName;
import org.junit.jupiter.api.Assertions;

public final class IntegrationServiceEnvironmentSkuDefinitionSkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationServiceEnvironmentSkuDefinitionSku model =
            BinaryData
                .fromString("{\"name\":\"Developer\",\"tier\":\"xdza\"}")
                .toObject(IntegrationServiceEnvironmentSkuDefinitionSku.class);
        Assertions.assertEquals(IntegrationServiceEnvironmentSkuName.DEVELOPER, model.name());
        Assertions.assertEquals("xdza", model.tier());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationServiceEnvironmentSkuDefinitionSku model =
            new IntegrationServiceEnvironmentSkuDefinitionSku()
                .withName(IntegrationServiceEnvironmentSkuName.DEVELOPER)
                .withTier("xdza");
        model = BinaryData.fromObject(model).toObject(IntegrationServiceEnvironmentSkuDefinitionSku.class);
        Assertions.assertEquals(IntegrationServiceEnvironmentSkuName.DEVELOPER, model.name());
        Assertions.assertEquals("xdza", model.tier());
    }
}