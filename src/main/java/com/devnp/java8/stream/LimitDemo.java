package com.devnp.java8.stream;

import java.util.stream.Stream;

public class LimitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> strings	= Stream.of("one", "two", "three", "four") ;
		
		strings.limit(2).forEach(p -> System.out.println(p)); ;
	}

}
