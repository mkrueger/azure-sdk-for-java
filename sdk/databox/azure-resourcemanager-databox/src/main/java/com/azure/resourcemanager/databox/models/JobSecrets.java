// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The base class for the secrets. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "jobSecretsType",
    defaultImpl = JobSecrets.class)
@JsonTypeName("JobSecrets")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "DataBoxDisk", value = DataBoxDiskJobSecrets.class),
    @JsonSubTypes.Type(name = "DataBoxHeavy", value = DataBoxHeavyJobSecrets.class),
    @JsonSubTypes.Type(name = "DataBox", value = DataboxJobSecrets.class)
})
@Immutable
public class JobSecrets {
    /*
     * Dc Access Security Code for Customer Managed Shipping
     */
    @JsonProperty(value = "dcAccessSecurityCode", access = JsonProperty.Access.WRITE_ONLY)
    private DcAccessSecurityCode dcAccessSecurityCode;

    /*
     * Error while fetching the secrets.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private CloudError error;

    /** Creates an instance of JobSecrets class. */
    public JobSecrets() {
    }

    /**
     * Get the dcAccessSecurityCode property: Dc Access Security Code for Customer Managed Shipping.
     *
     * @return the dcAccessSecurityCode value.
     */
    public DcAccessSecurityCode dcAccessSecurityCode() {
        return this.dcAccessSecurityCode;
    }

    /**
     * Get the error property: Error while fetching the secrets.
     *
     * @return the error value.
     */
    public CloudError error() {
        return this.error;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dcAccessSecurityCode() != null) {
            dcAccessSecurityCode().validate();
        }
        if (error() != null) {
            error().validate();
        }
    }
}
