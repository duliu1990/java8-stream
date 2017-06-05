package com.devnp.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(8, 2, 1, 4, 5, 6, 7);
		
		numbers.stream().sorted().forEach(p -> System.out.print(p + ","));
		
		System.out.println();
		
		List<Person> persons = new ArrayList<>();
		
		Person person1 = new Person("ebcs", 20);
		Person person2 = new Person("dfbcs", 21);
		Person person3 = new Person("hbcs", 25);
		Person person4 = new Person("cbcs", 18);
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		 
		persons.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).forEach(p -> System.out.print(p.getName() + ","));
	}

}

class Person {
	
	private String name ;
	
	private Integer age ;
	

	public Person() {
		super();
	}

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
