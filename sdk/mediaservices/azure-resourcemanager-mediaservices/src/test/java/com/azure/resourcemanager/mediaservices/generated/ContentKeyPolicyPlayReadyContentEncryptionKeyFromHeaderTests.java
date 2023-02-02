// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader;

public final class ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader model =
            BinaryData
                .fromString(
                    "{\"@odata.type\":\"#Microsoft.Media.ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader\"}")
                .toObject(ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader model =
            new ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader();
        model = BinaryData.fromObject(model).toObject(ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeader.class);
    }
}