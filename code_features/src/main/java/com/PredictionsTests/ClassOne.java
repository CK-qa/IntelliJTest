package com.PredictionsTests;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

public class ClassOne {

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

	public static String join(CharSequence delimiter, CharSequence... elements) {
		return String.join(delimiter, elements);
	}

	public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) {
		return String.join(delimiter, elements);
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

	public String intern() {
		return a.intern();
	}

	public IntStream chars() {
		return a.chars();
	}

	public IntStream codePoints() {
		return a.codePoints();
	}

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
