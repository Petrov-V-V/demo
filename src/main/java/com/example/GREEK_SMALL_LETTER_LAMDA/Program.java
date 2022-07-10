package com.example.greek_small_letter_lamda;

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
		System.out.println(printDouble(d -> d));
		System.out.println(printSum(new InterfaceWithTwoArguments(){
			@Override
			public int intFunc(int a, int b){
				return a + b;
			}
		}));
	}
}