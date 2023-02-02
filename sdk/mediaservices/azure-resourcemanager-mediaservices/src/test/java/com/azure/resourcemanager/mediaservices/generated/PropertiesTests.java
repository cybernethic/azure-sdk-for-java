// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.Properties;

public final class PropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Properties model =
            BinaryData
                .fromString(
                    "{\"serviceSpecification\":{\"logSpecifications\":[{\"name\":\"dphlxaolt\",\"displayName\":\"trg\",\"blobDuration\":\"bpf\"},{\"name\":\"s\",\"displayName\":\"zgvfcjrwz\",\"blobDuration\":\"xjtfelluwfzit\"},{\"name\":\"peqfpjkjl\",\"displayName\":\"fpdvhpfxxypi\",\"blobDuration\":\"nmayhuybb\"}],\"metricSpecifications\":[{\"name\":\"epoo\",\"displayName\":\"nuvamiheogna\",\"displayDescription\":\"zxtheotusivyevcc\",\"unit\":\"Bytes\",\"aggregationType\":\"Total\",\"lockAggregationType\":\"Total\",\"supportedAggregationTypes\":[],\"dimensions\":[],\"enableRegionalMdmAccount\":true,\"sourceMdmAccount\":\"zrnf\",\"sourceMdmNamespace\":\"xgispemvtzfkufu\",\"supportedTimeGrainTypes\":[]},{\"name\":\"ofx\",\"displayName\":\"ofjaeqjhqjb\",\"displayDescription\":\"v\",\"unit\":\"Bytes\",\"aggregationType\":\"Average\",\"lockAggregationType\":\"Total\",\"supportedAggregationTypes\":[],\"dimensions\":[],\"enableRegionalMdmAccount\":true,\"sourceMdmAccount\":\"nbybkzgcwrwcl\",\"sourceMdmNamespace\":\"wrljdouskc\",\"supportedTimeGrainTypes\":[]},{\"name\":\"ocrcjdk\",\"displayName\":\"nh\",\"displayDescription\":\"njbiksqrglssain\",\"unit\":\"Bytes\",\"aggregationType\":\"Average\",\"lockAggregationType\":\"Average\",\"supportedAggregationTypes\":[],\"dimensions\":[],\"enableRegionalMdmAccount\":true,\"sourceMdmAccount\":\"pee\",\"sourceMdmNamespace\":\"mgxsab\",\"supportedTimeGrainTypes\":[]}]}}")
                .toObject(Properties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Properties model = new Properties();
        model = BinaryData.fromObject(model).toObject(Properties.class);
    }
}