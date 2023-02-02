// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.LatencyMetric;

public final class LatencyMetricTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LatencyMetric model =
            BinaryData
                .fromString(
                    "{\"name\":\"vhezrkgqhcj\",\"endDateTimeUTC\":\"fovgmkqsleyyvxy\",\"aValue\":16.411882,\"bValue\":90.606155,\"delta\":4.740429,\"deltaPercent\":98.90796,\"aCLower95CI\":82.56238,\"aHUpper95CI\":10.539704,\"bCLower95CI\":26.154089,\"bUpper95CI\":85.224434}")
                .toObject(LatencyMetric.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LatencyMetric model = new LatencyMetric();
        model = BinaryData.fromObject(model).toObject(LatencyMetric.class);
    }
}