// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import java.io.IOException;

/** Samples for IntegrationAccountSessions CreateOrUpdate. */
public final class IntegrationAccountSessionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccountSessions_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update an integration account session.
     *
     * @param manager Entry point to LogicManager.
     */
    public static void createOrUpdateAnIntegrationAccountSession(com.azure.resourcemanager.logic.LogicManager manager)
        throws IOException {
        manager
            .integrationAccountSessions()
            .define("testsession123-ICN")
            .withRegion((String) null)
            .withExistingIntegrationAccount("testrg123", "testia123")
            .withContent(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize(
                        "{\"controlNumber\":\"1234\",\"controlNumberChangedTime\":\"2017-02-21T22:30:11.9923759Z\"}",
                        Object.class,
                        SerializerEncoding.JSON))
            .create();
    }
}