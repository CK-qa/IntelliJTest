package com.ParameterNameHints;

public class VirtualComma {

    public void methodWithParams(int int1, int int2, String string3, Object object4, boolean boolean5, Integer integer6) {
    }

    public boolean methodWithParams2(boolean boo1, boolean boo2) {
        return boo1 || boo2;
    }

    public String methodWithOneParam(String theOnlyParameter) {
        return theOnlyParameter;
    }

    void foo() {
        methodWithParams(1, 1, "dd", "ww", methodWithParams2(true, false), 3);
    }

    void recursive() {
        methodWithParams2(methodWithParams2(methodWithParams2(true, false), methodWithParams2(false, false)), false);
        methodWithParams(1, 2, String.valueOf(3), "hdhd", true, 34);
    }
}
