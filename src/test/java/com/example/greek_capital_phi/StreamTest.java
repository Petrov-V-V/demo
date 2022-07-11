package com.example.greek_capital_phi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

import com.example.greek_capital_phi.*;
import java.util.Map;
import java.util.List;
import org.junit.Test;

public class StreamTest {
	@Test
	public void listTest() {
		assertEquals(3.714, Program.listTask(), 0.001);
	}

	@Test
	public void setTest() {
		Map<String, String> stringMap = Program.setTask();
		assertEquals("zero", stringMap.get("zero"));
		assertEquals("one", stringMap.get("one"));
		assertEquals("two", stringMap.get("two"));
		assertEquals("three", stringMap.get("three"));
	}

	@Test
	public void mapFirstTest() {
		List<String> correctStringList = Program.mapFirstTask();
		assertTrue(correctStringList.contains("zero == zero"));
		assertTrue(correctStringList.contains("one == one"));
		assertTrue(correctStringList.contains("two == two"));
		assertTrue(correctStringList.contains("three == three"));
		assertTrue(correctStringList.contains("four == four"));
	}

	@Test
	public void mapSecondTest() {
		List<String> moreCorrectStringList = Program.mapSecondTask();
		assertTrue(moreCorrectStringList.contains("zero"));
		assertTrue(moreCorrectStringList.contains("one"));
		assertTrue(moreCorrectStringList.contains("two"));
		assertTrue(moreCorrectStringList.contains("three"));
		assertTrue(moreCorrectStringList.contains("four"));
	}

	@Test
	public void opptionalTest() {
		assertNotNull(Program.optionalTask());
	}
}