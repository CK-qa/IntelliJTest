package com.bugfix;

import java.util.ArrayList;

public class Program
{
	static void Foo1(String xx, String y, String z, String a, String b) {}
	static void Foo2(ArrayList<String> xxx) {}
	static void Main(String[] args)
	{
		Foo1(
				"1234567890",
				"1234567890",
				"1234567890",
				"1234567890",
				"1234567890");
		Foo2(
				"1234567890",
				"1234567890",
				"1234567890",
				"1234567890",
				"1234567890");
	}

	private static void Foo2(String s, String s1, String s2, String s3, String s4) {

	}
}
