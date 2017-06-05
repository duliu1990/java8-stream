package com.devnp.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(1, 2, 2, 4, 5, 6, 7);
		
		//distinct 去重
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		
		squaresList.stream().forEach(p -> System.out.println(p)); 
		
	}

}
