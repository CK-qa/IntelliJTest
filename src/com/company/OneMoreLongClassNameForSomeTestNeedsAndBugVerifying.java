package com.company;

import org.junit.Test;

public class OneMoreLongClassNameForSomeTestNeedsAndBugVerifying {

    @Test(expected = NullPointerException.class)
    public void jUnitTestWithExpectedException() {
        System.out.println("jUnitTestWithExpectedException running");
        String s = null;
        System.out.println(s.length());
    }
}
