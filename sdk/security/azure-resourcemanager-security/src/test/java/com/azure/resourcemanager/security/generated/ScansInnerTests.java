// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.ScanInner;
import com.azure.resourcemanager.security.fluent.models.ScansInner;
import com.azure.resourcemanager.security.models.ScanProperties;
import com.azure.resourcemanager.security.models.ScanState;
import com.azure.resourcemanager.security.models.ScanTriggerType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScansInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScansInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"triggerType\":\"OnDemand\",\"state\":\"Failed\",\"server\":\"emxhzzy\",\"database\":\"vusxiv\",\"sqlVersion\":\"rryveimipskdy\",\"startTime\":\"2021-06-02T16:48:50Z\",\"endTime\":\"2021-02-01T19:42:05Z\",\"highSeverityFailedRulesCount\":607073549,\"mediumSeverityFailedRulesCount\":1536025500,\"lowSeverityFailedRulesCount\":861452083,\"totalPassedRulesCount\":1675328323,\"totalFailedRulesCount\":296202390,\"totalRulesCount\":1768115792,\"isBaselineApplied\":true,\"lastScanTime\":\"2021-04-09T14:58:28Z\"},\"id\":\"yeip\",\"name\":\"dsmjtgr\",\"type\":\"gdgkki\"},{\"properties\":{\"triggerType\":\"Recurring\",\"state\":\"FailedToRun\",\"server\":\"mknhwtbbaedor\",\"database\":\"mqfl\",\"sqlVersion\":\"gbdg\",\"startTime\":\"2021-03-19T20:13:12Z\",\"endTime\":\"2021-07-03T02:46:04Z\",\"highSeverityFailedRulesCount\":1369032842,\"mediumSeverityFailedRulesCount\":1457349123,\"lowSeverityFailedRulesCount\":1726761587,\"totalPassedRulesCount\":1457286846,\"totalFailedRulesCount\":1275825078,\"totalRulesCount\":113406875,\"isBaselineApplied\":false,\"lastScanTime\":\"2021-02-07T21:21:29Z\"},\"id\":\"saq\",\"name\":\"otmmw\",\"type\":\"lcol\"},{\"properties\":{\"triggerType\":\"Recurring\",\"state\":\"Failed\",\"server\":\"efh\",\"database\":\"cgjokjljnhvlq\",\"sqlVersion\":\"ek\",\"startTime\":\"2021-01-20T04:18:54Z\",\"endTime\":\"2021-02-02T19:36:30Z\",\"highSeverityFailedRulesCount\":1733655615,\"mediumSeverityFailedRulesCount\":496362617,\"lowSeverityFailedRulesCount\":1792270566,\"totalPassedRulesCount\":1847843339,\"totalFailedRulesCount\":1296598670,\"totalRulesCount\":2103934424,\"isBaselineApplied\":false,\"lastScanTime\":\"2021-03-19T02:17:10Z\"},\"id\":\"khh\",\"name\":\"stcpoqmavnwqjw\",\"type\":\"o\"}]}")
                .toObject(ScansInner.class);
        Assertions.assertEquals(ScanTriggerType.ON_DEMAND, model.value().get(0).properties().triggerType());
        Assertions.assertEquals(ScanState.FAILED, model.value().get(0).properties().state());
        Assertions.assertEquals("emxhzzy", model.value().get(0).properties().server());
        Assertions.assertEquals("vusxiv", model.value().get(0).properties().database());
        Assertions.assertEquals("rryveimipskdy", model.value().get(0).properties().sqlVersion());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-06-02T16:48:50Z"), model.value().get(0).properties().startTime());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-02-01T19:42:05Z"), model.value().get(0).properties().endTime());
        Assertions.assertEquals(607073549, model.value().get(0).properties().highSeverityFailedRulesCount());
        Assertions.assertEquals(1536025500, model.value().get(0).properties().mediumSeverityFailedRulesCount());
        Assertions.assertEquals(861452083, model.value().get(0).properties().lowSeverityFailedRulesCount());
        Assertions.assertEquals(1675328323, model.value().get(0).properties().totalPassedRulesCount());
        Assertions.assertEquals(296202390, model.value().get(0).properties().totalFailedRulesCount());
        Assertions.assertEquals(1768115792, model.value().get(0).properties().totalRulesCount());
        Assertions.assertEquals(true, model.value().get(0).properties().isBaselineApplied());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-09T14:58:28Z"), model.value().get(0).properties().lastScanTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScansInner model =
            new ScansInner()
                .withValue(
                    Arrays
                        .asList(
                            new ScanInner()
                                .withProperties(
                                    new ScanProperties()
                                        .withTriggerType(ScanTriggerType.ON_DEMAND)
                                        .withState(ScanState.FAILED)
                                        .withServer("emxhzzy")
                                        .withDatabase("vusxiv")
                                        .withSqlVersion("rryveimipskdy")
                                        .withStartTime(OffsetDateTime.parse("2021-06-02T16:48:50Z"))
                                        .withEndTime(OffsetDateTime.parse("2021-02-01T19:42:05Z"))
                                        .withHighSeverityFailedRulesCount(607073549)
                                        .withMediumSeverityFailedRulesCount(1536025500)
                                        .withLowSeverityFailedRulesCount(861452083)
                                        .withTotalPassedRulesCount(1675328323)
                                        .withTotalFailedRulesCount(296202390)
                                        .withTotalRulesCount(1768115792)
                                        .withIsBaselineApplied(true)
                                        .withLastScanTime(OffsetDateTime.parse("2021-04-09T14:58:28Z"))),
                            new ScanInner()
                                .withProperties(
                                    new ScanProperties()
                                        .withTriggerType(ScanTriggerType.RECURRING)
                                        .withState(ScanState.FAILED_TO_RUN)
                                        .withServer("mknhwtbbaedor")
                                        .withDatabase("mqfl")
                                        .withSqlVersion("gbdg")
                                        .withStartTime(OffsetDateTime.parse("2021-03-19T20:13:12Z"))
                                        .withEndTime(OffsetDateTime.parse("2021-07-03T02:46:04Z"))
                                        .withHighSeverityFailedRulesCount(1369032842)
                                        .withMediumSeverityFailedRulesCount(1457349123)
                                        .withLowSeverityFailedRulesCount(1726761587)
                                        .withTotalPassedRulesCount(1457286846)
                                        .withTotalFailedRulesCount(1275825078)
                                        .withTotalRulesCount(113406875)
                                        .withIsBaselineApplied(false)
                                        .withLastScanTime(OffsetDateTime.parse("2021-02-07T21:21:29Z"))),
                            new ScanInner()
                                .withProperties(
                                    new ScanProperties()
                                        .withTriggerType(ScanTriggerType.RECURRING)
                                        .withState(ScanState.FAILED)
                                        .withServer("efh")
                                        .withDatabase("cgjokjljnhvlq")
                                        .withSqlVersion("ek")
                                        .withStartTime(OffsetDateTime.parse("2021-01-20T04:18:54Z"))
                                        .withEndTime(OffsetDateTime.parse("2021-02-02T19:36:30Z"))
                                        .withHighSeverityFailedRulesCount(1733655615)
                                        .withMediumSeverityFailedRulesCount(496362617)
                                        .withLowSeverityFailedRulesCount(1792270566)
                                        .withTotalPassedRulesCount(1847843339)
                                        .withTotalFailedRulesCount(1296598670)
                                        .withTotalRulesCount(2103934424)
                                        .withIsBaselineApplied(false)
                                        .withLastScanTime(OffsetDateTime.parse("2021-03-19T02:17:10Z")))));
        model = BinaryData.fromObject(model).toObject(ScansInner.class);
        Assertions.assertEquals(ScanTriggerType.ON_DEMAND, model.value().get(0).properties().triggerType());
        Assertions.assertEquals(ScanState.FAILED, model.value().get(0).properties().state());
        Assertions.assertEquals("emxhzzy", model.value().get(0).properties().server());
        Assertions.assertEquals("vusxiv", model.value().get(0).properties().database());
        Assertions.assertEquals("rryveimipskdy", model.value().get(0).properties().sqlVersion());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-06-02T16:48:50Z"), model.value().get(0).properties().startTime());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-02-01T19:42:05Z"), model.value().get(0).properties().endTime());
        Assertions.assertEquals(607073549, model.value().get(0).properties().highSeverityFailedRulesCount());
        Assertions.assertEquals(1536025500, model.value().get(0).properties().mediumSeverityFailedRulesCount());
        Assertions.assertEquals(861452083, model.value().get(0).properties().lowSeverityFailedRulesCount());
        Assertions.assertEquals(1675328323, model.value().get(0).properties().totalPassedRulesCount());
        Assertions.assertEquals(296202390, model.value().get(0).properties().totalFailedRulesCount());
        Assertions.assertEquals(1768115792, model.value().get(0).properties().totalRulesCount());
        Assertions.assertEquals(true, model.value().get(0).properties().isBaselineApplied());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-04-09T14:58:28Z"), model.value().get(0).properties().lastScanTime());
    }
}
