package com.artemoas;

import org.junit.Assert;
import org.junit.Test;

/**
 * Chris on 2/8/16:10:29 PM.
 */
public class JsonBuilderTest {

    @Test
    public void testBuild() {
        Assert.assertEquals("{\"name\":\"value\"}", new JsonBuilder().with(
                new SimpleField("name", "value")
        ).build());
    }

}