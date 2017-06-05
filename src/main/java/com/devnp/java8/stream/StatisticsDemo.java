package com.devnp.java8.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StatisticsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(8, 2, 1, 4, 5, 6, 7);
		
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
		
		System.out.println("Max : " + stats.getMax());
		System.out.println("Min : " + stats.getMin());
		
		System.out.println("Sum : " + stats.getSum());
		System.out.println("Average : " + stats.getAverage());
		
		System.out.println("Count : " + stats.getCount());
		
		long count = numbers.stream().count();
		
		System.out.println("Stream count : " + count);
	}

}
