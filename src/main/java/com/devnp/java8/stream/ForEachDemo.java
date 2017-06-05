package com.devnp.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strings = Arrays.asList("abc", "cbc", "bbc", "cbc", "uas","cctv", "cnc");
		
		strings.stream().forEach(System.out::println);
		
		System.out.println("----------------------------");
		
		strings.stream().forEach(p -> System.out.println(p)); // Lambda 表达式
		
		System.out.println("----------------------------");
		
		strings.stream().peek(e -> System.out.println(e)).collect(Collectors.toList());
		
		 Stream.of("one", "two", "three", "four")
         .filter(e -> e.length() > 3)
         .peek(e -> System.out.println("Filtered value: " + e))
         .map(String::toUpperCase)
         .peek(e -> System.out.println("Mapped value: " + e))
         .collect(Collectors.toList());
	}

}
