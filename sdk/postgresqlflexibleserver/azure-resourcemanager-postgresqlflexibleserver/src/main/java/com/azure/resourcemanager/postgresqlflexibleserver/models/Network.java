// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Network properties of a server. */
@Fluent
public final class Network {
    /*
     * public network access is enabled or not
     */
    @JsonProperty(value = "publicNetworkAccess", access = JsonProperty.Access.WRITE_ONLY)
    private ServerPublicNetworkAccessState publicNetworkAccess;

    /*
     * delegated subnet arm resource id.
     */
    @JsonProperty(value = "delegatedSubnetResourceId")
    private String delegatedSubnetResourceId;

    /*
     * private dns zone arm resource id.
     */
    @JsonProperty(value = "privateDnsZoneArmResourceId")
    private String privateDnsZoneArmResourceId;

    /** Creates an instance of Network class. */
    public Network() {
    }

    /**
     * Get the publicNetworkAccess property: public network access is enabled or not.
     *
     * @return the publicNetworkAccess value.
     */
    public ServerPublicNetworkAccessState publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Get the delegatedSubnetResourceId property: delegated subnet arm resource id.
     *
     * @return the delegatedSubnetResourceId value.
     */
    public String delegatedSubnetResourceId() {
        return this.delegatedSubnetResourceId;
    }

    /**
     * Set the delegatedSubnetResourceId property: delegated subnet arm resource id.
     *
     * @param delegatedSubnetResourceId the delegatedSubnetResourceId value to set.
     * @return the Network object itself.
     */
    public Network withDelegatedSubnetResourceId(String delegatedSubnetResourceId) {
        this.delegatedSubnetResourceId = delegatedSubnetResourceId;
        return this;
    }

    /**
     * Get the privateDnsZoneArmResourceId property: private dns zone arm resource id.
     *
     * @return the privateDnsZoneArmResourceId value.
     */
    public String privateDnsZoneArmResourceId() {
        return this.privateDnsZoneArmResourceId;
    }

    /**
     * Set the privateDnsZoneArmResourceId property: private dns zone arm resource id.
     *
     * @param privateDnsZoneArmResourceId the privateDnsZoneArmResourceId value to set.
     * @return the Network object itself.
     */
    public Network withPrivateDnsZoneArmResourceId(String privateDnsZoneArmResourceId) {
        this.privateDnsZoneArmResourceId = privateDnsZoneArmResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
