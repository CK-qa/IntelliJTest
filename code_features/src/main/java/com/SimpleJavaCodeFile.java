package com;

import java.util.Locale;

public class SimpleJavaCodeFile {

	String str;
	int i;
	boolean foo;

	char[] c = {1, 3, 4, 5};

	public SimpleJavaCodeFile(String str) {

	}


	public static void main(String[] args) {
		System.out.println(methodWithNestedCode("uno", 1));
	}

	int toUse() {
		return method(1, 2);
	}

	int toUse1() {
		return method(2, 3);
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

	private void init() {

		SimpleJavaCodeFile adapter = new SimpleJavaCodeFile(
				this.str);
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





}
