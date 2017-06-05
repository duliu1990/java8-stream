package com.devnp.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//从数组
		String[] arr = { "program", "creek", "program", "creek", "java"};
		Stream<String> stream = Stream.of(arr);
		
		Stream<String> stream2 = Stream.of("program", "creek", "program", "creek", "java");
		
		//从集合里面
		List<String> strings = Arrays.asList("abc", "cbc", "bbc", "cbc", "uas","cctv", "cnc");
		
		Stream<String> listStream = strings.stream();
		
		//Stream.generate()
		Random seed = new Random();
		
		Supplier<Integer> random = seed::nextInt; //seed.nextInt
		
		Stream.generate(random).limit(10).forEach(System.out::println);
		
		//使用IntStream
		IntStream.generate(() -> (int) (System.nanoTime() % 100)).
		limit(10).forEach(System.out::println);
		
		//Stream.iterate() 生产等差数列
		Stream.iterate(0, n -> n + 3).limit(10). forEach(x -> System.out.print(x + " "));

	}

}
