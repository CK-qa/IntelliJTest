package com.PredictionsTests;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

public class ClassOne {

	String a;
	Integer i;
	int b;
	Float f;

	public ClassOne(String a, int b) {
		this.a = a;
		this.b = b;
	}


	/**
	 * @return "sss"
	 */
	public String foo() {
		return "Sss";
	}


	public void setB(int b) {
		this.b = b;
	}


}
