package com.ParameterNameHints;

public class VirtualComma {

    public void methodWithParams(int int1, int int2, String string3, Object object4, boolean boolean5, Integer integer6) {

    }

    public boolean boo(boolean boo1, boolean boo2) {
        return boo1 || boo2;
    }

    void foo() {
        methodWithParams(1, 1, "dd", "ww", boo(true, false), 3);

    }

    void recursive() {
        boo(boo(boo(true, false), boo(false, false)), false);
        methodWithParams(1, 2, String.valueOf(3), "hdhd", true, 34);
    }
}
