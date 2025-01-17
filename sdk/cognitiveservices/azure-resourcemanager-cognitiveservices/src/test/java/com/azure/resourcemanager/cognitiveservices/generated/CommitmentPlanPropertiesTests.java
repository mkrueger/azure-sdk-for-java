// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPeriod;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlanProperties;
import com.azure.resourcemanager.cognitiveservices.models.HostingModel;
import org.junit.jupiter.api.Assertions;

public final class CommitmentPlanPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommitmentPlanProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Creating\",\"commitmentPlanGuid\":\"mxjezwlw\",\"hostingModel\":\"DisconnectedContainer\",\"planType\":\"qlcvydy\",\"current\":{\"tier\":\"dooaojkniodko\",\"count\":354248500,\"quota\":{\"quantity\":8980911642598746949,\"unit\":\"emmsbvdkc\"},\"startDate\":\"dtjinfw\",\"endDate\":\"fltkacjv\"},\"autoRenew\":false,\"next\":{\"tier\":\"foakgg\",\"count\":1236120195,\"quota\":{\"quantity\":2099147795702198960,\"unit\":\"pulpqblylsyxk\"},\"startDate\":\"nsj\",\"endDate\":\"vti\"},\"last\":{\"tier\":\"sdszue\",\"count\":1236978734,\"quota\":{\"quantity\":6849457451153472340,\"unit\":\"beyvpnqicvinvkjj\"},\"startDate\":\"xrbuukzclew\",\"endDate\":\"mlwpazt\"}}")
                .toObject(CommitmentPlanProperties.class);
        Assertions.assertEquals("mxjezwlw", model.commitmentPlanGuid());
        Assertions.assertEquals(HostingModel.DISCONNECTED_CONTAINER, model.hostingModel());
        Assertions.assertEquals("qlcvydy", model.planType());
        Assertions.assertEquals("dooaojkniodko", model.current().tier());
        Assertions.assertEquals(354248500, model.current().count());
        Assertions.assertEquals(false, model.autoRenew());
        Assertions.assertEquals("foakgg", model.next().tier());
        Assertions.assertEquals(1236120195, model.next().count());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommitmentPlanProperties model =
            new CommitmentPlanProperties()
                .withCommitmentPlanGuid("mxjezwlw")
                .withHostingModel(HostingModel.DISCONNECTED_CONTAINER)
                .withPlanType("qlcvydy")
                .withCurrent(new CommitmentPeriod().withTier("dooaojkniodko").withCount(354248500))
                .withAutoRenew(false)
                .withNext(new CommitmentPeriod().withTier("foakgg").withCount(1236120195));
        model = BinaryData.fromObject(model).toObject(CommitmentPlanProperties.class);
        Assertions.assertEquals("mxjezwlw", model.commitmentPlanGuid());
        Assertions.assertEquals(HostingModel.DISCONNECTED_CONTAINER, model.hostingModel());
        Assertions.assertEquals("qlcvydy", model.planType());
        Assertions.assertEquals("dooaojkniodko", model.current().tier());
        Assertions.assertEquals(354248500, model.current().count());
        Assertions.assertEquals(false, model.autoRenew());
        Assertions.assertEquals("foakgg", model.next().tier());
        Assertions.assertEquals(1236120195, model.next().count());
    }
}
