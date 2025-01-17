// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AutomationActionEventHub;
import org.junit.jupiter.api.Assertions;

public final class AutomationActionEventHubTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutomationActionEventHub model =
            BinaryData
                .fromString(
                    "{\"actionType\":\"EventHub\",\"eventHubResourceId\":\"brlbpgs\",\"sasPolicyName\":\"agnchjhgemuowaky\",\"connectionString\":\"lhjym\"}")
                .toObject(AutomationActionEventHub.class);
        Assertions.assertEquals("brlbpgs", model.eventHubResourceId());
        Assertions.assertEquals("lhjym", model.connectionString());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutomationActionEventHub model =
            new AutomationActionEventHub().withEventHubResourceId("brlbpgs").withConnectionString("lhjym");
        model = BinaryData.fromObject(model).toObject(AutomationActionEventHub.class);
        Assertions.assertEquals("brlbpgs", model.eventHubResourceId());
        Assertions.assertEquals("lhjym", model.connectionString());
    }
}
