package com.PredictionsTests;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

public class ClassOne {

	String a;
	Integer i;
	int b;

	public static String toString(float f) {
		return Float.toString(f);
	}

	public static String toHexString(float f) {
		return Float.toHexString(f);
	}

	public static float parseFloat(String s) throws NumberFormatException {
		return Float.parseFloat(s);
	}

	public static boolean isNaN(float v) {
		return Float.isNaN(v);
	}

	public static boolean isInfinite(float v) {
		return Float.isInfinite(v);
	}

	public static boolean isFinite(float f) {
		return Float.isFinite(f);
	}

	public boolean isNaN() {
		return f.isNaN();
	}

	public boolean isInfinite() {
		return f.isInfinite();
	}

	public static int hashCode(float value) {
		return Float.hashCode(value);
	}

	public static int floatToIntBits(float value) {
		return Float.floatToIntBits(value);
	}

	public static int floatToRawIntBits(float value) {
		return Float.floatToRawIntBits(value);
	}

	public static float intBitsToFloat(int bits) {
		return Float.intBitsToFloat(bits);
	}

	public int compareTo(Float anotherFloat) {
		return f.compareTo(anotherFloat);
	}

	public static int compare(float f1, float f2) {
		return Float.compare(f1, f2);
	}

	public static float sum(float a, float b) {
		return Float.sum(a, b);
	}

	public static float max(float a, float b) {
		return Float.max(a, b);
	}

	public static float min(float a, float b) {
		return Float.min(a, b);
	}

	Float f;

	public ClassOne(String a, int b) {
		this.a = a;
		this.b = b;
	}

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

	public static String join(CharSequence delimiter, CharSequence... elements) {
		return String.join(delimiter, elements);
	}

	public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) {
		return String.join(delimiter, elements);
	}

	public static String format(String format, Object... args) {
		return String.format(format, args);
	}

	public static String format(Locale l, String format, Object... args) {
		return String.format(l, format, args);
	}

	public static String valueOf(Object obj) {
		return String.valueOf(obj);
	}

	public static String valueOf(char[] data) {
		return String.valueOf(data);
	}

	public static String valueOf(char[] data, int offset, int count) {
		return String.valueOf(data, offset, count);
	}

	public static String copyValueOf(char[] data, int offset, int count) {
		return String.copyValueOf(data, offset, count);
	}

	public static String copyValueOf(char[] data) {
		return String.copyValueOf(data);
	}

	public static String valueOf(boolean b) {
		return String.valueOf(b);
	}

	public static String valueOf(char c) {
		return String.valueOf(c);
	}

	public static String valueOf(int i) {
		return String.valueOf(i);
	}

	public static String valueOf(long l) {
		return String.valueOf(l);
	}

	public static String valueOf(float f) {
		return String.valueOf(f);
	}

	public static String valueOf(double d) {
		return String.valueOf(d);
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

	public int compareTo(Integer anotherInteger) {
		return i.compareTo(anotherInteger);
	}

	public int length() {
		return a.length();
	}

	public boolean isEmpty() {
		return a.isEmpty();
	}

	public char charAt(int index) {
		return a.charAt(index);
	}

	public int codePointAt(int index) {
		return a.codePointAt(index);
	}

	public int codePointBefore(int index) {
		return a.codePointBefore(index);
	}

	public int codePointCount(int beginIndex, int endIndex) {
		return a.codePointCount(beginIndex, endIndex);
	}

	public int offsetByCodePoints(int index, int codePointOffset) {
		return a.offsetByCodePoints(index, codePointOffset);
	}

	public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
		a.getChars(srcBegin, srcEnd, dst, dstBegin);
	}

	@Deprecated
	public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
		a.getBytes(srcBegin, srcEnd, dst, dstBegin);
	}

	public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
		return a.getBytes(charsetName);
	}

	public byte[] getBytes(Charset charset) {
		return a.getBytes(charset);
	}

	public byte[] getBytes() {
		return a.getBytes();
	}

	public boolean contentEquals(StringBuffer sb) {
		return a.contentEquals(sb);
	}

	public boolean contentEquals(CharSequence cs) {
		return a.contentEquals(cs);
	}

	public boolean equalsIgnoreCase(String anotherString) {
		return a.equalsIgnoreCase(anotherString);
	}

	public int compareTo(String anotherString) {
		return a.compareTo(anotherString);
	}

	public int compareToIgnoreCase(String str) {
		return a.compareToIgnoreCase(str);
	}

	public boolean regionMatches(int toffset, String other, int ooffset, int len) {
		return a.regionMatches(toffset, other, ooffset, len);
	}

	public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
		return a.regionMatches(ignoreCase, toffset, other, ooffset, len);
	}

	public boolean startsWith(String prefix, int toffset) {
		return a.startsWith(prefix, toffset);
	}

	public boolean startsWith(String prefix) {
		return a.startsWith(prefix);
	}

	public boolean endsWith(String suffix) {
		return a.endsWith(suffix);
	}

	public int indexOf(int ch) {
		return a.indexOf(ch);
	}

	public int indexOf(int ch, int fromIndex) {
		return a.indexOf(ch, fromIndex);
	}

	public int lastIndexOf(int ch) {
		return a.lastIndexOf(ch);
	}

	public int lastIndexOf(int ch, int fromIndex) {
		return a.lastIndexOf(ch, fromIndex);
	}

	public int indexOf(String str) {
		return a.indexOf(str);
	}

	public int indexOf(String str, int fromIndex) {
		return a.indexOf(str, fromIndex);
	}

	public int lastIndexOf(String str) {
		return a.lastIndexOf(str);
	}

	public int lastIndexOf(String str, int fromIndex) {
		return a.lastIndexOf(str, fromIndex);
	}

	public String substring(int beginIndex) {
		return a.substring(beginIndex);
	}

	public String substring(int beginIndex, int endIndex) {
		return a.substring(beginIndex, endIndex);
	}

	public CharSequence subSequence(int beginIndex, int endIndex) {
		return a.subSequence(beginIndex, endIndex);
	}

	public String concat(String str) {
		return a.concat(str);
	}

	public String replace(char oldChar, char newChar) {
		return a.replace(oldChar, newChar);
	}

	public boolean matches(String regex) {
		return a.matches(regex);
	}

	public boolean contains(CharSequence s) {
		return a.contains(s);
	}

	public String replaceFirst(String regex, String replacement) {
		return a.replaceFirst(regex, replacement);
	}

	public String replaceAll(String regex, String replacement) {
		return a.replaceAll(regex, replacement);
	}

	public String replace(CharSequence target, CharSequence replacement) {
		return a.replace(target, replacement);
	}

	public String[] split(String regex, int limit) {
		return a.split(regex, limit);
	}

	public String[] split(String regex) {
		return a.split(regex);
	}

	public String toLowerCase(Locale locale) {
		return a.toLowerCase(locale);
	}

	public String toLowerCase() {
		return a.toLowerCase();
	}

	public String toUpperCase(Locale locale) {
		return a.toUpperCase(locale);
	}

	public String toUpperCase() {
		return a.toUpperCase();
	}

	public String trim() {
		return a.trim();
	}

	public char[] toCharArray() {
		return a.toCharArray();
	}

	public String intern() {
		return a.intern();
	}

	public IntStream chars() {
		return a.chars();
	}

	public IntStream codePoints() {
		return a.codePoints();
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
