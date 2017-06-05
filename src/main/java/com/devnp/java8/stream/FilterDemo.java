package com.devnp.java8.stream;

import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> strings	= Stream.of("one", "two", "three", "four") ;
		
		strings.filter(p -> p.length() > 3).forEach(p -> System.out.println(p)); ;
	}

}
