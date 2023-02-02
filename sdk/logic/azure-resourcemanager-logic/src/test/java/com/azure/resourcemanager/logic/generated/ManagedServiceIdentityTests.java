// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.ManagedServiceIdentity;
import com.azure.resourcemanager.logic.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.logic.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedServiceIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedServiceIdentity model =
            BinaryData
                .fromString(
                    "{\"type\":\"SystemAssigned\",\"tenantId\":\"4b8b1510-ce33-48d1-bd72-cd050c2bc90f\",\"principalId\":\"3ce46a44-cf79-4238-b8e0-a778777ac38b\",\"userAssignedIdentities\":{\"og\":{\"principalId\":\"qciwqvhkhixuigdt\",\"clientId\":\"bob\"},\"a\":{\"principalId\":\"e\",\"clientId\":\"a\"}}}")
                .toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedServiceIdentity model =
            new ManagedServiceIdentity()
                .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                .withUserAssignedIdentities(mapOf("og", new UserAssignedIdentity(), "a", new UserAssignedIdentity()));
        model = BinaryData.fromObject(model).toObject(ManagedServiceIdentity.class);
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.type());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}