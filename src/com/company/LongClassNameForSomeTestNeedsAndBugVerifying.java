package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;

public class LongClassNameForSomeTestNeedsAndBugVerifying {


    @Test
    public void jUnitTestNegative() {
        System.out.println("jUnitTestNegative running");
        Assert.assertThat("Not ok", "String", containsString("String1"));
    }
}
