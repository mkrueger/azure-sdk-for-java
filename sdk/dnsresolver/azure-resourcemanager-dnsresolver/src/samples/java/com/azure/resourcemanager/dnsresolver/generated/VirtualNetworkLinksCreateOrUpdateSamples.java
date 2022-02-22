// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.management.SubResource;
import java.util.HashMap;
import java.util.Map;

/** Samples for VirtualNetworkLinks CreateOrUpdate. */
public final class VirtualNetworkLinksCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/dnsresolver/resource-manager/Microsoft.Network/preview/2020-04-01-preview/examples/VirtualNetworkLink_Put.json
     */
    /**
     * Sample code: Upsert virtual network link to a DNS forwarding ruleset.
     *
     * @param manager Entry point to DnsResolverManager.
     */
    public static void upsertVirtualNetworkLinkToADNSForwardingRuleset(
        com.azure.resourcemanager.dnsresolver.DnsResolverManager manager) {
        manager
            .virtualNetworkLinks()
            .define("sampleVirtualNetworkLink")
            .withExistingDnsForwardingRuleset("sampleResourceGroup", "sampleDnsForwardingRuleset")
            .withVirtualNetwork(
                new SubResource()
                    .withId(
                        "/subscriptions/0403cfa9-9659-4f33-9f30-1f191c51d111/resourceGroups/sampleVnetResourceGroupName/providers/Microsoft.Network/virtualNetworks/sampleVirtualNetwork"))
            .withMetadata(mapOf("additionalProp1", "value1"))
            .create();
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