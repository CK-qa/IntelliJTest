package com.ImportsTest;


import java.util.*;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.containsString;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasSize;


class ImportTest {

    Map<String, String> map;
    Set<String> set;

    public ImportTest(Map<String, String> map, Set<String> set) {
        this.map = map;
        this.set = set;
    }

    public void test() {
        List<String> testList = Arrays.asList("peewpew", "ololo");
        assertThat("", "String", containsString("pewpew"));
        assertThat("Text", testList, containsInAnyOrder("a", "s"));
        assertThat("", testList, hasSize(2));
        assertThat("", "sss", endsWith("dd"));
        assertTrue(1 == 1);
        assertFalse(1 != 2);
        assertNotEquals(1, 23);
    }

    private class InnerClass {
    }


    public String sss(String s) {
        set.add("SSs");
        return String.valueOf(set.size());
    }
}