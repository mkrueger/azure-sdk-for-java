// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Rule results properties. */
@Fluent
public final class RuleResultsProperties {
    /*
     * Expected results in the baseline.
     */
    @JsonProperty(value = "results")
    private List<List<String>> results;

    /** Creates an instance of RuleResultsProperties class. */
    public RuleResultsProperties() {
    }

    /**
     * Get the results property: Expected results in the baseline.
     *
     * @return the results value.
     */
    public List<List<String>> results() {
        return this.results;
    }

    /**
     * Set the results property: Expected results in the baseline.
     *
     * @param results the results value to set.
     * @return the RuleResultsProperties object itself.
     */
    public RuleResultsProperties withResults(List<List<String>> results) {
        this.results = results;
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
