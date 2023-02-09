// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.AS2AgreementContent;
import com.azure.resourcemanager.logic.models.AS2OneWayAgreement;
import com.azure.resourcemanager.logic.models.AgreementContent;
import com.azure.resourcemanager.logic.models.EdifactAgreementContent;
import com.azure.resourcemanager.logic.models.EdifactOneWayAgreement;
import com.azure.resourcemanager.logic.models.X12AgreementContent;
import com.azure.resourcemanager.logic.models.X12OneWayAgreement;

public final class AgreementContentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AgreementContent model =
            BinaryData
                .fromString(
                    "{\"aS2\":{\"receiveAgreement\":{},\"sendAgreement\":{}},\"x12\":{\"receiveAgreement\":{},\"sendAgreement\":{}},\"edifact\":{\"receiveAgreement\":{},\"sendAgreement\":{}}}")
                .toObject(AgreementContent.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AgreementContent model =
            new AgreementContent()
                .withAS2(
                    new AS2AgreementContent()
                        .withReceiveAgreement(new AS2OneWayAgreement())
                        .withSendAgreement(new AS2OneWayAgreement()))
                .withX12(
                    new X12AgreementContent()
                        .withReceiveAgreement(new X12OneWayAgreement())
                        .withSendAgreement(new X12OneWayAgreement()))
                .withEdifact(
                    new EdifactAgreementContent()
                        .withReceiveAgreement(new EdifactOneWayAgreement())
                        .withSendAgreement(new EdifactOneWayAgreement()));
        model = BinaryData.fromObject(model).toObject(AgreementContent.class);
    }
}