// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.trafficmanager.fluent.models.EndpointInner;

/** Samples for Endpoints Update. */
public final class EndpointsUpdateSamples {
    /*
     * x-ms-original-file: specification/trafficmanager/resource-manager/Microsoft.Network/stable/2018-04-01/examples/Endpoint-PATCH-External-Target.json
     */
    /**
     * Sample code: Endpoint-PATCH-External-Target.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void endpointPATCHExternalTarget(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .trafficManagerProfiles()
            .manager()
            .serviceClient()
            .getEndpoints()
            .updateWithResponse(
                "azuresdkfornetautoresttrafficmanager1421",
                "azsmnet6386",
                "ExternalEndpoints",
                "azsmnet7187",
                new EndpointInner()
                    .withId(
                        "/subscriptions/{subscription-id}/resourceGroups/azuresdkfornetautoresttrafficmanager1421/providers/Microsoft.Network/trafficManagerProfiles/azsmnet6386/externalEndpoints/azsmnet7187")
                    .withName("azsmnet7187")
                    .withType("Microsoft.Network/trafficManagerProfiles/externalEndpoints")
                    .withTarget("another.foobar.contoso.com"),
                Context.NONE);
    }
}
