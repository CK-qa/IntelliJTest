package com.PredictionsTests;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

public class ClassTwo {

	float f;
	Integer i;
	String s;

	public ClassTwo(float f, Integer i) {
		this.f = f;
		this.i = i;
	}

	public ClassTwo() {
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

	public static String valueOf(long l) {
		return String.valueOf(l);
	}

	public static String valueOf(float f) {
		return String.valueOf(f);
	}

	public static String valueOf(double d) {
		return String.valueOf(d);
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

	public static Integer valueOf(int i) {
		return Integer.valueOf(i);
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

	public int length() {
		return s.length();
	}

	public boolean isEmpty() {
		return s.isEmpty();
	}

	public char charAt(int index) {
		return s.charAt(index);
	}

	public int codePointAt(int index) {
		return s.codePointAt(index);
	}

	public int codePointBefore(int index) {
		return s.codePointBefore(index);
	}

	public int codePointCount(int beginIndex, int endIndex) {
		return s.codePointCount(beginIndex, endIndex);
	}

	public int offsetByCodePoints(int index, int codePointOffset) {
		return s.offsetByCodePoints(index, codePointOffset);
	}

	public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) {
		s.getChars(srcBegin, srcEnd, dst, dstBegin);
	}

	@Deprecated
	public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) {
		s.getBytes(srcBegin, srcEnd, dst, dstBegin);
	}

	public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
		return s.getBytes(charsetName);
	}

	public byte[] getBytes(Charset charset) {
		return s.getBytes(charset);
	}

	public byte[] getBytes() {
		return s.getBytes();
	}

	public boolean contentEquals(StringBuffer sb) {
		return s.contentEquals(sb);
	}

	public boolean contentEquals(CharSequence cs) {
		return s.contentEquals(cs);
	}

	public boolean equalsIgnoreCase(String anotherString) {
		return s.equalsIgnoreCase(anotherString);
	}

	public int compareTo(String anotherString) {
		return s.compareTo(anotherString);
	}

	public int compareToIgnoreCase(String str) {
		return s.compareToIgnoreCase(str);
	}

	public boolean regionMatches(int toffset, String other, int ooffset, int len) {
		return s.regionMatches(toffset, other, ooffset, len);
	}

	public boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) {
		return s.regionMatches(ignoreCase, toffset, other, ooffset, len);
	}

	public boolean startsWith(String prefix, int toffset) {
		return s.startsWith(prefix, toffset);
	}

	public boolean startsWith(String prefix) {
		return s.startsWith(prefix);
	}

	public boolean endsWith(String suffix) {
		return s.endsWith(suffix);
	}

	public int indexOf(int ch) {
		return s.indexOf(ch);
	}

	public int indexOf(int ch, int fromIndex) {
		return s.indexOf(ch, fromIndex);
	}

	public int lastIndexOf(int ch) {
		return s.lastIndexOf(ch);
	}

	public int lastIndexOf(int ch, int fromIndex) {
		return s.lastIndexOf(ch, fromIndex);
	}

	public int indexOf(String str) {
		return s.indexOf(str);
	}

	public int indexOf(String str, int fromIndex) {
		return s.indexOf(str, fromIndex);
	}

	public int lastIndexOf(String str) {
		return s.lastIndexOf(str);
	}

	public int lastIndexOf(String str, int fromIndex) {
		return s.lastIndexOf(str, fromIndex);
	}

	public String substring(int beginIndex) {
		return s.substring(beginIndex);
	}

	public String substring(int beginIndex, int endIndex) {
		return s.substring(beginIndex, endIndex);
	}

	public CharSequence subSequence(int beginIndex, int endIndex) {
		return s.subSequence(beginIndex, endIndex);
	}

	public String concat(String str) {
		return s.concat(str);
	}

	public String replace(char oldChar, char newChar) {
		return s.replace(oldChar, newChar);
	}

	public boolean matches(String regex) {
		return s.matches(regex);
	}

	public boolean contains(CharSequence s) {
		return this.s.contains(s);
	}

	public String replaceFirst(String regex, String replacement) {
		return s.replaceFirst(regex, replacement);
	}

	public String replaceAll(String regex, String replacement) {
		return s.replaceAll(regex, replacement);
	}

	public String replace(CharSequence target, CharSequence replacement) {
		return s.replace(target, replacement);
	}

	public String[] split(String regex, int limit) {
		return s.split(regex, limit);
	}

	public String[] split(String regex) {
		return s.split(regex);
	}

	public String toLowerCase(Locale locale) {
		return s.toLowerCase(locale);
	}

	public String toLowerCase() {
		return s.toLowerCase();
	}

	public String toUpperCase(Locale locale) {
		return s.toUpperCase(locale);
	}

	public String toUpperCase() {
		return s.toUpperCase();
	}

	public String trim() {
		return s.trim();
	}

	public char[] toCharArray() {
		return s.toCharArray();
	}

	public String intern() {
		return s.intern();
	}

	public IntStream chars() {
		return s.chars();
	}

	public IntStream codePoints() {
		return s.codePoints();
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
