package com.example.greek_small_lamda;

public class Program {
	public static char printChar(InterfaceWithZeroArguments c) {
		return c.charFunc();
	}

	public static double printDouble(InterfaceWithOneArgument d) {
		return d.doubleFunc(0.423162346253464574357);
	}

	public static int printSum(InterfaceWithTwoArguments i) {
		return i.intFunc(Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
}