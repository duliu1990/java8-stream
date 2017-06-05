package com.devnp.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class MatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> students = new ArrayList<>();
		
		Student person1 = new Student("ebcs", 20);
		Student person2 = new Student("dfbcs", 21);
		Student person3 = new Student("hbcs", 25);
		Student person4 = new Student("cbcs", 18);
		students.add(person1);
		students.add(person2);
		students.add(person3);
		students.add(person4);
		
		boolean isAllAdult = students.stream().allMatch(p -> p.getAge() > 18);
		
		System.out.println("All are adult? " + isAllAdult);
		
		boolean isThereAnyChild = students.stream().anyMatch(p -> p.getAge() < 12);
		
		System.out.println("Any child? " + isThereAnyChild);
		
		boolean noChild = students.stream().noneMatch(p -> p.getAge() < 12);
		
		System.out.println("No child? " + noChild);
		
	}

}

class Student {
	
	private String name ;
	
	private Integer age ;
	

	public Student() {
		super();
	}

	public Student(String name, Integer age) {
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
