package com.example.greek_small_lamda;

import static org.junit.Assert.assertEquals;

import com.example.greek_small_lamda.*;
import org.junit.Test;

public class LambdaTest {
	@Test
	public void getCharTest() {
		assertEquals('a', Program.printChar(() -> 'a'));
	}

	@Test
	public void getDoubleTest() {
		assertEquals(0.423, Program.printDouble(d -> d), 0.001);
	}

	@Test
	public void getSumTest() {
		assertEquals(-1, Program.printSum(new InterfaceWithTwoArguments() {
			@Override
			public int intFunc(int a, int b) {
				return a + b;
			}
		}));
	}
}