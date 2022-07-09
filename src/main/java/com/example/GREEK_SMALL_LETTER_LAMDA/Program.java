package com.example.GREEK_SMALL_LETTER_LAMDA;

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
    
	public static void main(String[] args) {
		System.out.println(printChar(() -> 'b'));
        System.out.println(printDouble((d) -> d));
		System.out.println(printSum((i1, i2) -> i1 + i2));
	}
}