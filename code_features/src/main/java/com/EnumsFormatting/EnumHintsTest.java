package com.EnumsFormatting;

public enum EnumHintsTest {

    CONSTR_ONE(true,true),
    CONSTR_TWO(false, false);


    final boolean hint_one;
    final boolean hint_two;

    EnumHintsTest(final boolean hint_one, final boolean hint_two) {
        this.hint_one = hint_one;
        this.hint_two = hint_two;
    }


    public boolean isGreen() {
        return hint_one;
    }

    public boolean isStriped() {
        return hint_two;
    }
}