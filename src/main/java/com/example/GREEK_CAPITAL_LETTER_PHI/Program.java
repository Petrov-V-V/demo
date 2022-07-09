package com.example.GREEK_CAPITAL_LETTER_PHI;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.Optional;

public class Program {
    public static void main(String[] args) {
		List<Integer> integerList = List.of(0, 1, 2, 3, 4, 5, 6, 
											7, 8, 9);
		System.out.println(integerList.stream().limit(integerList.size()-3)
		.mapToInt(a -> a).map(a -> (a % 2 == 0) ? a + 5 : a - 5).average().getAsDouble());
		System.out.println();

		List<String> stringList = List.of("zero", "one", "two", "three", "four",
								"five", "six", "seven", "eight", "nine");
		Set<String> stringSet = stringList.stream().collect(Collectors.toSet());
		Map<String, String> map = stringSet.stream().filter(a -> a.length() < 10)
				.collect(Collectors.toMap(key -> key, key -> key));
		map.entrySet().forEach(System.out::println);
		System.out.println();

		Map<String, String> stringMap = new HashMap<>();
		for (int i = 0; i < 5; i++) {
			stringMap.put(integerList.get(i).toString(), stringList.get(i));
		}
		List<String> correctStringList = stringMap.entrySet().stream()
		.map(a -> a.getKey() + " == " + a.getValue()).toList();
		correctStringList.forEach(System.out::println);
		List<String> moreCorrectStringList = stringMap.entrySet().stream()
		.flatMap(a -> List.of(a.getKey(), a.getValue()).stream()).toList();
		moreCorrectStringList.forEach(System.out::println);
		System.out.println();

		String nullString = null;
		nullString = Optional.ofNullable(nullString).orElseGet(String::new);
		System.out.println(nullString.toString());
	}
}