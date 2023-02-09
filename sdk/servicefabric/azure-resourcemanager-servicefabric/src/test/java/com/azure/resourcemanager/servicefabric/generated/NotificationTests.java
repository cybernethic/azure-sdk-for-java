// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.models.Notification;
import com.azure.resourcemanager.servicefabric.models.NotificationCategory;
import com.azure.resourcemanager.servicefabric.models.NotificationChannel;
import com.azure.resourcemanager.servicefabric.models.NotificationLevel;
import com.azure.resourcemanager.servicefabric.models.NotificationTarget;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NotificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Notification model =
            BinaryData
                .fromString(
                    "{\"isEnabled\":true,\"notificationCategory\":\"WaveProgress\",\"notificationLevel\":\"All\",\"notificationTargets\":[{\"notificationChannel\":\"EmailUser\",\"receivers\":[\"gispemvtzfkufubl\",\"ofx\",\"eofjaeqjh\",\"jbasvmsmjqulngs\"]},{\"notificationChannel\":\"EmailUser\",\"receivers\":[\"bybkzgcwrwclxx\",\"rljdouskcqv\",\"ocrcjdk\",\"tnhxbn\"]},{\"notificationChannel\":\"EmailUser\",\"receivers\":[\"ksqrglssai\",\"qpjwnzlljfm\"]}]}")
                .toObject(Notification.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals(NotificationCategory.WAVE_PROGRESS, model.notificationCategory());
        Assertions.assertEquals(NotificationLevel.ALL, model.notificationLevel());
        Assertions
            .assertEquals(NotificationChannel.EMAIL_USER, model.notificationTargets().get(0).notificationChannel());
        Assertions.assertEquals("gispemvtzfkufubl", model.notificationTargets().get(0).receivers().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Notification model =
            new Notification()
                .withIsEnabled(true)
                .withNotificationCategory(NotificationCategory.WAVE_PROGRESS)
                .withNotificationLevel(NotificationLevel.ALL)
                .withNotificationTargets(
                    Arrays
                        .asList(
                            new NotificationTarget()
                                .withNotificationChannel(NotificationChannel.EMAIL_USER)
                                .withReceivers(
                                    Arrays.asList("gispemvtzfkufubl", "ofx", "eofjaeqjh", "jbasvmsmjqulngs")),
                            new NotificationTarget()
                                .withNotificationChannel(NotificationChannel.EMAIL_USER)
                                .withReceivers(Arrays.asList("bybkzgcwrwclxx", "rljdouskcqv", "ocrcjdk", "tnhxbn")),
                            new NotificationTarget()
                                .withNotificationChannel(NotificationChannel.EMAIL_USER)
                                .withReceivers(Arrays.asList("ksqrglssai", "qpjwnzlljfm"))));
        model = BinaryData.fromObject(model).toObject(Notification.class);
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals(NotificationCategory.WAVE_PROGRESS, model.notificationCategory());
        Assertions.assertEquals(NotificationLevel.ALL, model.notificationLevel());
        Assertions
            .assertEquals(NotificationChannel.EMAIL_USER, model.notificationTargets().get(0).notificationChannel());
        Assertions.assertEquals("gispemvtzfkufubl", model.notificationTargets().get(0).receivers().get(0));
    }
}