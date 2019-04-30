package com.PredictionsTests;

public class ClassOne {

	String a;
	int b;

	public ClassOne(String a, int b) {
		this.a = a;
		this.b = b;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return new org.apache.commons.lang3.builder.ToStringBuilder(this)
				.toString();
	}

	/**
	 * @return "sss"
	 */
	public String foo() {
		return "Sss";
	}


}
