// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AccountImmutabilityPolicyState. */
public final class AccountImmutabilityPolicyState extends ExpandableStringEnum<AccountImmutabilityPolicyState> {
    /** Static value Unlocked for AccountImmutabilityPolicyState. */
    public static final AccountImmutabilityPolicyState UNLOCKED = fromString("Unlocked");

    /** Static value Locked for AccountImmutabilityPolicyState. */
    public static final AccountImmutabilityPolicyState LOCKED = fromString("Locked");

    /** Static value Disabled for AccountImmutabilityPolicyState. */
    public static final AccountImmutabilityPolicyState DISABLED = fromString("Disabled");

    /**
     * Creates or finds a AccountImmutabilityPolicyState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AccountImmutabilityPolicyState.
     */
    @JsonCreator
    public static AccountImmutabilityPolicyState fromString(String name) {
        return fromString(name, AccountImmutabilityPolicyState.class);
    }

    /** @return known AccountImmutabilityPolicyState values. */
    public static Collection<AccountImmutabilityPolicyState> values() {
        return values(AccountImmutabilityPolicyState.class);
    }
}