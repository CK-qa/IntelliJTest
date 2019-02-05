package com.EnumsFormatting;

public enum TestOrdering {
    ;

    public static class OrderCorrect {
        public Object createString() {
            return new Object() {
                @Override
                public String toString() {
                    return "";
                }
            };
        }

        public Object createObject() {
            return new Object() {
                @Override
                public int hashCode() {
                    return 32;
                }

                private String shouldBeOrderedLast() {
                    return "";
                }
            };
        }
    }
    
}