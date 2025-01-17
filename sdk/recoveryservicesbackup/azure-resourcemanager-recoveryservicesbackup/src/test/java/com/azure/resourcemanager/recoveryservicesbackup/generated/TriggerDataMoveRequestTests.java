// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DataMoveLevel;
import com.azure.resourcemanager.recoveryservicesbackup.models.TriggerDataMoveRequest;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TriggerDataMoveRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TriggerDataMoveRequest model = BinaryData.fromString(
            "{\"sourceResourceId\":\"amdecte\",\"sourceRegion\":\"f\",\"dataMoveLevel\":\"Container\",\"correlationId\":\"scjeypv\",\"sourceContainerArmIds\":[\"rkgqhcjrefo\",\"gm\",\"qsl\",\"yyvxyqjpkcattpn\"],\"pauseGC\":false}")
            .toObject(TriggerDataMoveRequest.class);
        Assertions.assertEquals("amdecte", model.sourceResourceId());
        Assertions.assertEquals("f", model.sourceRegion());
        Assertions.assertEquals(DataMoveLevel.CONTAINER, model.dataMoveLevel());
        Assertions.assertEquals("scjeypv", model.correlationId());
        Assertions.assertEquals("rkgqhcjrefo", model.sourceContainerArmIds().get(0));
        Assertions.assertEquals(false, model.pauseGC());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TriggerDataMoveRequest model = new TriggerDataMoveRequest().withSourceResourceId("amdecte")
            .withSourceRegion("f").withDataMoveLevel(DataMoveLevel.CONTAINER).withCorrelationId("scjeypv")
            .withSourceContainerArmIds(Arrays.asList("rkgqhcjrefo", "gm", "qsl", "yyvxyqjpkcattpn")).withPauseGC(false);
        model = BinaryData.fromObject(model).toObject(TriggerDataMoveRequest.class);
        Assertions.assertEquals("amdecte", model.sourceResourceId());
        Assertions.assertEquals("f", model.sourceRegion());
        Assertions.assertEquals(DataMoveLevel.CONTAINER, model.dataMoveLevel());
        Assertions.assertEquals("scjeypv", model.correlationId());
        Assertions.assertEquals("rkgqhcjrefo", model.sourceContainerArmIds().get(0));
        Assertions.assertEquals(false, model.pauseGC());
    }
}
