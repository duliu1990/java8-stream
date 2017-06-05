package com.devnp.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strings = Arrays.asList("abc", "cbc", "abc", "cbc", "uas","cctv", "cnc");
		
		Map<String, Long> result = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(result);
		
		System.out.println("---------------");
		
		Map<Boolean, List<String>> result2 = strings.stream().collect(Collectors.partitioningBy(p -> p.equals("abc")));
		
		System.out.println(result2);
		
	}

}
