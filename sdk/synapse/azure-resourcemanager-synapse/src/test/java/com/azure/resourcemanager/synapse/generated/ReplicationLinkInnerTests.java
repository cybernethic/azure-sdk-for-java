// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.ReplicationLinkInner;

public final class ReplicationLinkInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReplicationLinkInner model =
            BinaryData
                .fromString(
                    "{\"location\":\"dfznudaodv\",\"properties\":{\"isTerminationAllowed\":true,\"replicationMode\":\"blylpstdbh\",\"partnerServer\":\"srzdzucerscdn\",\"partnerDatabase\":\"evfiwjmygt\",\"partnerLocation\":\"slswtm\",\"role\":\"Secondary\",\"partnerRole\":\"Primary\",\"startTime\":\"2021-10-28T16:23:15Z\",\"percentComplete\":1861097710,\"replicationState\":\"CATCH_UP\"},\"id\":\"emwabnet\",\"name\":\"hhszh\",\"type\":\"d\"}")
                .toObject(ReplicationLinkInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReplicationLinkInner model = new ReplicationLinkInner();
        model = BinaryData.fromObject(model).toObject(ReplicationLinkInner.class);
    }
}