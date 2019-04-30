package com.PredictionsTests;

public class ClassTwo {

	float f;

	public static String toString(int i, int radix) {
		return Integer.toString(i, radix);
	}

	public static String toUnsignedString(int i, int radix) {
		return Integer.toUnsignedString(i, radix);
	}

	public static String toHexString(int i) {
		return Integer.toHexString(i);
	}

	public static String toOctalString(int i) {
		return Integer.toOctalString(i);
	}

	public static String toBinaryString(int i) {
		return Integer.toBinaryString(i);
	}

	public static String toString(int i) {
		return Integer.toString(i);
	}

	public static String toUnsignedString(int i) {
		return Integer.toUnsignedString(i);
	}

	public static int parseInt(String s, int radix) throws NumberFormatException {
		return Integer.parseInt(s, radix);
	}

	public static int parseInt(String s) throws NumberFormatException {
		return Integer.parseInt(s);
	}

	public static int parseUnsignedInt(String s, int radix) throws NumberFormatException {
		return Integer.parseUnsignedInt(s, radix);
	}

	public static int parseUnsignedInt(String s) throws NumberFormatException {
		return Integer.parseUnsignedInt(s);
	}

	public static Integer valueOf(String s, int radix) throws NumberFormatException {
		return Integer.valueOf(s, radix);
	}

	public static Integer valueOf(String s) throws NumberFormatException {
		return Integer.valueOf(s);
	}

	public static Integer valueOf(int i) {
		return Integer.valueOf(i);
	}

	public byte byteValue() {
		return i.byteValue();
	}

	public short shortValue() {
		return i.shortValue();
	}

	public int intValue() {
		return i.intValue();
	}

	public long longValue() {
		return i.longValue();
	}

	public float floatValue() {
		return i.floatValue();
	}

	public double doubleValue() {
		return i.doubleValue();
	}

	public static int hashCode(int value) {
		return Integer.hashCode(value);
	}

	public static Integer getInteger(String nm) {
		return Integer.getInteger(nm);
	}

	public static Integer getInteger(String nm, int val) {
		return Integer.getInteger(nm, val);
	}

	public static Integer getInteger(String nm, Integer val) {
		return Integer.getInteger(nm, val);
	}

	public static Integer decode(String nm) throws NumberFormatException {
		return Integer.decode(nm);
	}

	public int compareTo(Integer anotherInteger) {
		return i.compareTo(anotherInteger);
	}

	public static int compare(int x, int y) {
		return Integer.compare(x, y);
	}

	public static int compareUnsigned(int x, int y) {
		return Integer.compareUnsigned(x, y);
	}

	public static long toUnsignedLong(int x) {
		return Integer.toUnsignedLong(x);
	}

	public static int divideUnsigned(int dividend, int divisor) {
		return Integer.divideUnsigned(dividend, divisor);
	}

	public static int remainderUnsigned(int dividend, int divisor) {
		return Integer.remainderUnsigned(dividend, divisor);
	}

	public static int highestOneBit(int i) {
		return Integer.highestOneBit(i);
	}

	public static int lowestOneBit(int i) {
		return Integer.lowestOneBit(i);
	}

	public static int numberOfLeadingZeros(int i) {
		return Integer.numberOfLeadingZeros(i);
	}

	public static int numberOfTrailingZeros(int i) {
		return Integer.numberOfTrailingZeros(i);
	}

	public static int bitCount(int i) {
		return Integer.bitCount(i);
	}

	public static int rotateLeft(int i, int distance) {
		return Integer.rotateLeft(i, distance);
	}

	public static int rotateRight(int i, int distance) {
		return Integer.rotateRight(i, distance);
	}

	public static int reverse(int i) {
		return Integer.reverse(i);
	}

	public static int signum(int i) {
		return Integer.signum(i);
	}

	public static int reverseBytes(int i) {
		return Integer.reverseBytes(i);
	}

	public static int sum(int a, int b) {
		return Integer.sum(a, b);
	}

	public static int max(int a, int b) {
		return Integer.max(a, b);
	}

	public static int min(int a, int b) {
		return Integer.min(a, b);
	}

	Integer i;

	public ClassTwo(float f, Integer i) {
		this.f = f;
		this.i = i;
	}

	public ClassTwo() {
	}

	public Integer getI() {
		return i;
	}

	public void setI(Integer i) {
		this.i = i;
	}

	public float getF() {
		return f;
	}

	public void setF(float f) {
		this.f = f;
	}

	public int bar(int a) {
		return a;
	}
}
