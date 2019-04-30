package com.PredictionsTests;

public class ClassOne {

	String a;
	int b;

	public ClassOne(String a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return new org.apache.commons.lang3.builder.ToStringBuilder(this)
				.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
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

	/**
	 * @return "sss"
	 */
	public String foo() {
		return "Sss";
	}


}
