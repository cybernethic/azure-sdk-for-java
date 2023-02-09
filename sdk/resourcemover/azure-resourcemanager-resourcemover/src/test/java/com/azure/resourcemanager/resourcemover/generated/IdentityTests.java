// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcemover.models.Identity;
import com.azure.resourcemanager.resourcemover.models.ResourceIdentityType;
import org.junit.jupiter.api.Assertions;

public final class IdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Identity model =
            BinaryData
                .fromString("{\"type\":\"None\",\"principalId\":\"gnufoooj\",\"tenantId\":\"ifsqesaagdfmg\"}")
                .toObject(Identity.class);
        Assertions.assertEquals(ResourceIdentityType.NONE, model.type());
        Assertions.assertEquals("gnufoooj", model.principalId());
        Assertions.assertEquals("ifsqesaagdfmg", model.tenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Identity model =
            new Identity()
                .withType(ResourceIdentityType.NONE)
                .withPrincipalId("gnufoooj")
                .withTenantId("ifsqesaagdfmg");
        model = BinaryData.fromObject(model).toObject(Identity.class);
        Assertions.assertEquals(ResourceIdentityType.NONE, model.type());
        Assertions.assertEquals("gnufoooj", model.principalId());
        Assertions.assertEquals("ifsqesaagdfmg", model.tenantId());
    }
}