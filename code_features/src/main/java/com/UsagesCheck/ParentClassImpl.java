package com.UsagesCheck;

public class ParentClassImpl extends ParentClass {

    private static ParentClass pClass = new ParentClass();

    public static void main(String[] args) {
        System.out.println(pClass.s.charAt(5));
    }

}
