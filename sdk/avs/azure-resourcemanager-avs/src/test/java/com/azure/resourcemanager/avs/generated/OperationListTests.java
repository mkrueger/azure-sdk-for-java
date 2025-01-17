// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.models.OperationList;

public final class OperationListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"quvgjxpybczme\",\"display\":{\"provider\":\"zopbsphrupidgs\",\"resource\":\"bejhphoycmsxa\",\"operation\":\"hdxbmtqio\",\"description\":\"zehtbmu\"},\"isDataAction\":false,\"origin\":\"noi\",\"properties\":{}},{\"name\":\"rxybqsoq\",\"display\":{\"provider\":\"k\",\"resource\":\"bpazlobcufpdzn\",\"operation\":\"t\",\"description\":\"qjnqglhqgnufoooj\"},\"isDataAction\":true,\"origin\":\"sqe\",\"properties\":{}},{\"name\":\"dfmglzlhjx\",\"display\":{\"provider\":\"kwm\",\"resource\":\"ktsizntocipaou\",\"operation\":\"psqucmpoyf\",\"description\":\"fogknygjofjdde\"},\"isDataAction\":false,\"origin\":\"eupewnwreitjz\",\"properties\":{}}],\"nextLink\":\"sarhmofc\"}")
                .toObject(OperationList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationList model = new OperationList();
        model = BinaryData.fromObject(model).toObject(OperationList.class);
    }
}
