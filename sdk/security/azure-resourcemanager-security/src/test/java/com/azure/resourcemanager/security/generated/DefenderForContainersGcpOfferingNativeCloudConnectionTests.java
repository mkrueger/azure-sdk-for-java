// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderForContainersGcpOfferingNativeCloudConnection;
import org.junit.jupiter.api.Assertions;

public final class DefenderForContainersGcpOfferingNativeCloudConnectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderForContainersGcpOfferingNativeCloudConnection model =
            BinaryData
                .fromString("{\"serviceAccountEmailAddress\":\"ajq\",\"workloadIdentityProviderId\":\"kpeexpgeumilh\"}")
                .toObject(DefenderForContainersGcpOfferingNativeCloudConnection.class);
        Assertions.assertEquals("ajq", model.serviceAccountEmailAddress());
        Assertions.assertEquals("kpeexpgeumilh", model.workloadIdentityProviderId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderForContainersGcpOfferingNativeCloudConnection model =
            new DefenderForContainersGcpOfferingNativeCloudConnection()
                .withServiceAccountEmailAddress("ajq")
                .withWorkloadIdentityProviderId("kpeexpgeumilh");
        model = BinaryData.fromObject(model).toObject(DefenderForContainersGcpOfferingNativeCloudConnection.class);
        Assertions.assertEquals("ajq", model.serviceAccountEmailAddress());
        Assertions.assertEquals("kpeexpgeumilh", model.workloadIdentityProviderId());
    }
}
