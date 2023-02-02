// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.PolicyInner;
import com.azure.resourcemanager.devtestlabs.models.PolicyEvaluatorType;
import com.azure.resourcemanager.devtestlabs.models.PolicyFactName;
import com.azure.resourcemanager.devtestlabs.models.PolicyList;
import com.azure.resourcemanager.devtestlabs.models.PolicyStatus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PolicyListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PolicyList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"description\":\"cpqjlihhyu\",\"status\":\"Disabled\",\"factName\":\"UserOwnedLabVmCount\",\"factData\":\"dvlmfwdgzxul\",\"threshold\":\"vpa\",\"evaluatorType\":\"MaxValuePolicy\",\"createdDate\":\"2021-04-21T20:41:03Z\",\"provisioningState\":\"zvxurisjnhny\",\"uniqueIdentifier\":\"ifqjz\"},\"location\":\"xmrhu\",\"tags\":{\"upauut\":\"pcesutrg\"},\"id\":\"woqhihe\",\"name\":\"qg\",\"type\":\"zpnfqntcypsxj\"},{\"properties\":{\"description\":\"oimwkslirc\",\"status\":\"Enabled\",\"factName\":\"ScheduleEditPermission\",\"factData\":\"dfcea\",\"threshold\":\"lhvygdyftu\",\"evaluatorType\":\"MaxValuePolicy\",\"createdDate\":\"2021-02-18T05:18:14Z\",\"provisioningState\":\"wjslbiwkojgcyzt\",\"uniqueIdentifier\":\"mznbaeqphch\"},\"location\":\"nrnrp\",\"tags\":{\"ydv\":\"uwrykqgaifmvikl\",\"volvtn\":\"hbejdznxcvdsrhnj\",\"fzg\":\"v\"},\"id\":\"mjdftu\",\"name\":\"jltduceam\",\"type\":\"mczuo\"}],\"nextLink\":\"jw\"}")
                .toObject(PolicyList.class);
        Assertions.assertEquals("xmrhu", model.value().get(0).location());
        Assertions.assertEquals("pcesutrg", model.value().get(0).tags().get("upauut"));
        Assertions.assertEquals("cpqjlihhyu", model.value().get(0).description());
        Assertions.assertEquals(PolicyStatus.DISABLED, model.value().get(0).status());
        Assertions.assertEquals(PolicyFactName.USER_OWNED_LAB_VM_COUNT, model.value().get(0).factName());
        Assertions.assertEquals("dvlmfwdgzxul", model.value().get(0).factData());
        Assertions.assertEquals("vpa", model.value().get(0).threshold());
        Assertions.assertEquals(PolicyEvaluatorType.MAX_VALUE_POLICY, model.value().get(0).evaluatorType());
        Assertions.assertEquals("jw", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PolicyList model =
            new PolicyList()
                .withValue(
                    Arrays
                        .asList(
                            new PolicyInner()
                                .withLocation("xmrhu")
                                .withTags(mapOf("upauut", "pcesutrg"))
                                .withDescription("cpqjlihhyu")
                                .withStatus(PolicyStatus.DISABLED)
                                .withFactName(PolicyFactName.USER_OWNED_LAB_VM_COUNT)
                                .withFactData("dvlmfwdgzxul")
                                .withThreshold("vpa")
                                .withEvaluatorType(PolicyEvaluatorType.MAX_VALUE_POLICY),
                            new PolicyInner()
                                .withLocation("nrnrp")
                                .withTags(mapOf("ydv", "uwrykqgaifmvikl", "volvtn", "hbejdznxcvdsrhnj", "fzg", "v"))
                                .withDescription("oimwkslirc")
                                .withStatus(PolicyStatus.ENABLED)
                                .withFactName(PolicyFactName.SCHEDULE_EDIT_PERMISSION)
                                .withFactData("dfcea")
                                .withThreshold("lhvygdyftu")
                                .withEvaluatorType(PolicyEvaluatorType.MAX_VALUE_POLICY)))
                .withNextLink("jw");
        model = BinaryData.fromObject(model).toObject(PolicyList.class);
        Assertions.assertEquals("xmrhu", model.value().get(0).location());
        Assertions.assertEquals("pcesutrg", model.value().get(0).tags().get("upauut"));
        Assertions.assertEquals("cpqjlihhyu", model.value().get(0).description());
        Assertions.assertEquals(PolicyStatus.DISABLED, model.value().get(0).status());
        Assertions.assertEquals(PolicyFactName.USER_OWNED_LAB_VM_COUNT, model.value().get(0).factName());
        Assertions.assertEquals("dvlmfwdgzxul", model.value().get(0).factData());
        Assertions.assertEquals("vpa", model.value().get(0).threshold());
        Assertions.assertEquals(PolicyEvaluatorType.MAX_VALUE_POLICY, model.value().get(0).evaluatorType());
        Assertions.assertEquals("jw", model.nextLink());
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