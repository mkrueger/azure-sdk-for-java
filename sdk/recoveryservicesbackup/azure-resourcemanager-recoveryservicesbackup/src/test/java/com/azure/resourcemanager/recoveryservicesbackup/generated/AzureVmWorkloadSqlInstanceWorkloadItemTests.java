// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureVmWorkloadSqlInstanceWorkloadItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectory;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureVmWorkloadSqlInstanceWorkloadItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureVmWorkloadSqlInstanceWorkloadItem model =
            BinaryData
                .fromString(
                    "{\"workloadItemType\":\"SQLInstance\",\"dataDirectoryPaths\":[{\"type\":\"Invalid\",\"path\":\"nrlkwzdqy\",\"logicalName\":\"ceakxc\"},{\"type\":\"Data\",\"path\":\"qfyiaseqchkr\",\"logicalName\":\"zrazisgyk\"},{\"type\":\"Log\",\"path\":\"vanbwzohmnrxxbs\",\"logicalName\":\"klinhmdptysprq\"},{\"type\":\"Data\",\"path\":\"xojpslsvjgp\",\"logicalName\":\"ufiqwoyxqvapcohh\"}],\"parentName\":\"cqpqojxcxzrzdc\",\"serverName\":\"zbenribc\",\"isAutoProtectable\":false,\"subinquireditemcount\":1265070523,\"subWorkloadItemCount\":1311825329,\"backupManagementType\":\"tjwfljhznamtua\",\"workloadType\":\"zwcjjncqtj\",\"friendlyName\":\"izvg\",\"protectionState\":\"ProtectionFailed\"}")
                .toObject(AzureVmWorkloadSqlInstanceWorkloadItem.class);
        Assertions.assertEquals("tjwfljhznamtua", model.backupManagementType());
        Assertions.assertEquals("zwcjjncqtj", model.workloadType());
        Assertions.assertEquals("izvg", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTION_FAILED, model.protectionState());
        Assertions.assertEquals("cqpqojxcxzrzdc", model.parentName());
        Assertions.assertEquals("zbenribc", model.serverName());
        Assertions.assertEquals(false, model.isAutoProtectable());
        Assertions.assertEquals(1265070523, model.subinquireditemcount());
        Assertions.assertEquals(1311825329, model.subWorkloadItemCount());
        Assertions.assertEquals(SqlDataDirectoryType.INVALID, model.dataDirectoryPaths().get(0).type());
        Assertions.assertEquals("nrlkwzdqy", model.dataDirectoryPaths().get(0).path());
        Assertions.assertEquals("ceakxc", model.dataDirectoryPaths().get(0).logicalName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureVmWorkloadSqlInstanceWorkloadItem model =
            new AzureVmWorkloadSqlInstanceWorkloadItem()
                .withBackupManagementType("tjwfljhznamtua")
                .withWorkloadType("zwcjjncqtj")
                .withFriendlyName("izvg")
                .withProtectionState(ProtectionStatus.PROTECTION_FAILED)
                .withParentName("cqpqojxcxzrzdc")
                .withServerName("zbenribc")
                .withIsAutoProtectable(false)
                .withSubinquireditemcount(1265070523)
                .withSubWorkloadItemCount(1311825329)
                .withDataDirectoryPaths(
                    Arrays
                        .asList(
                            new SqlDataDirectory()
                                .withType(SqlDataDirectoryType.INVALID)
                                .withPath("nrlkwzdqy")
                                .withLogicalName("ceakxc"),
                            new SqlDataDirectory()
                                .withType(SqlDataDirectoryType.DATA)
                                .withPath("qfyiaseqchkr")
                                .withLogicalName("zrazisgyk"),
                            new SqlDataDirectory()
                                .withType(SqlDataDirectoryType.LOG)
                                .withPath("vanbwzohmnrxxbs")
                                .withLogicalName("klinhmdptysprq"),
                            new SqlDataDirectory()
                                .withType(SqlDataDirectoryType.DATA)
                                .withPath("xojpslsvjgp")
                                .withLogicalName("ufiqwoyxqvapcohh")));
        model = BinaryData.fromObject(model).toObject(AzureVmWorkloadSqlInstanceWorkloadItem.class);
        Assertions.assertEquals("tjwfljhznamtua", model.backupManagementType());
        Assertions.assertEquals("zwcjjncqtj", model.workloadType());
        Assertions.assertEquals("izvg", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTION_FAILED, model.protectionState());
        Assertions.assertEquals("cqpqojxcxzrzdc", model.parentName());
        Assertions.assertEquals("zbenribc", model.serverName());
        Assertions.assertEquals(false, model.isAutoProtectable());
        Assertions.assertEquals(1265070523, model.subinquireditemcount());
        Assertions.assertEquals(1311825329, model.subWorkloadItemCount());
        Assertions.assertEquals(SqlDataDirectoryType.INVALID, model.dataDirectoryPaths().get(0).type());
        Assertions.assertEquals("nrlkwzdqy", model.dataDirectoryPaths().get(0).path());
        Assertions.assertEquals("ceakxc", model.dataDirectoryPaths().get(0).logicalName());
    }
}
