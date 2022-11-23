package com.stream;

import java.util.Arrays;
import java.util.List;

import com.exercise1.Person;

public class StreamExample {
	public static void main(String[] args) {
		List<Person> person=Arrays.asList(
				new Person("krishna","yadav",24),
				new Person("ram","p",24),
				new Person("lakshman","p",24),
				new Person("rohan","s",24),
				new Person("soean","d",24)
				);
		person.stream()
		.filter(p->p.getFirstName()
		.startsWith("k")).forEach(p->System.out.println(p.getFirstName()));
		
		long count=person.stream()
		.filter(p->p.getFirstName().startsWith("k"))
		.count();
		
		System.out.println(count);
		
}
}