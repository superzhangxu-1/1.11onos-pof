/*
 * Copyright 2015-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.bgpio.types.attr;

import org.junit.Test;

import com.google.common.testing.EqualsTester;

/**
 * Test for BGP link max bandwidth attribute.
 */
public class BgpLinkAttrMaxLinkBandwidthTest {
    private final float val = 0x010203;
    private final short valLen = 3;
    private final float val1 = 0x01020304;
    private final short val1Len = 4;

    private final BgpLinkAttrMaxLinkBandwidth data = BgpLinkAttrMaxLinkBandwidth
            .of(val, valLen);
    private final BgpLinkAttrMaxLinkBandwidth sameAsData = BgpLinkAttrMaxLinkBandwidth
            .of(val, valLen);
    private final BgpLinkAttrMaxLinkBandwidth diffData = BgpLinkAttrMaxLinkBandwidth
            .of(val1, val1Len);

    @Test
    public void basics() {
        new EqualsTester().addEqualityGroup(data, sameAsData)
        .addEqualityGroup(diffData).testEquals();
    }
}