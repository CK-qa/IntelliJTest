package com;

public class SimpleJavaCodeFile {

    String str;
    int i;
    boolean foo;

    char[] c = {1, 3, 4, 5};
    SimpleJavaCodeFile sj = new SimpleJavaCodeFile("TestStringTo see hints on completion");

    public SimpleJavaCodeFile(String str) {
    }

    public static void main(String[] args) {
        System.out.println(methodWithNestedCode("uno", 1));
    }

    private static String methodWithNestedCode(String s,
                                               int i) {
        StringBuilder sb = new StringBuilder();
        String res = "";
        char[] helloArray = {'h',
                'e',
                'l',
                'l',
                'o',
                '.'};
        for (char c : helloArray) {
            res = sb.append(c).append(" ")
                    .toString().replaceAll("\\s", "");
        }
        return res
                .toUpperCase();
    }

    private void regexCheck() {
        str.replaceAll("\\QmyString\\E", "");
    }

    private void init() {
        SimpleJavaCodeFile adapter = new SimpleJavaCodeFile(
                this.str);
    }

    int toUse() {
        return method(1, 2);
    }

    int toUse1() {
        return method(2, 3);
    }

    int g(int a, int b) {
        return a + b;
    }

    int method(int x,
               int y) {
        return g(x,
                y);
    }

    int d(int x,
          int y) {
        return g(x,
                y);
    }

    private void testSoutv() {
        System.out.println("this = " + this);
    }

    public class InnerClass {
        public void foo() {

        }
    }
}