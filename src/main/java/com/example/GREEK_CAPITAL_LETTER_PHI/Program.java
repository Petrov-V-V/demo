package com.example.greek_capital_letter_phi;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.HashSet;

public class Program {
    public static void main(String[] args) {
		List<Integer> integerList = List.of(0, 1, 2, 3, 4,
		5, 6, 7, 8, 9);
		System.out.println(integerList.stream().limit(integerList.size()-3)
		.mapToInt(a -> a).map(a -> a % 2 == 0 ? a + 5 : a - 5).average().getAsDouble());
		System.out.println();

		List<String> stringList = List.of("zero", "one", "two", "three", "four",
		"twenty-three", "thirty-four", "seventy-seven", "eighty-eight", "one hundred");
		Set<String> stringSet = new HashSet<>(stringList);
		Map<String, String> stringMap = stringSet.stream().filter(a -> a.length() < 10)
		.collect(Collectors.toMap(Function.identity(), Function.identity()));
		System.out.println(stringMap+"\n");

		List<String> correctStringList = stringMap.entrySet().stream()
		.map(a -> a.getKey() + " == " + a.getValue()).collect(Collectors.toList());
		System.out.println(correctStringList+"\n");
		List<String> moreCorrectStringList = stringMap.entrySet().stream()
		.flatMap(a -> List.of(a.getKey(), a.getValue()).stream()).collect(Collectors.toList());
		System.out.println(moreCorrectStringList);

		String nullString = null;
		nullString = Optional.ofNullable(nullString).orElseGet(String::new);
		System.out.println(nullString);
	}
}