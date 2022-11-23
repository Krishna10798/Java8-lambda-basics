package com.methodRefE;

import java.util.Arrays;
import java.util.List;

import com.exercise1.Person;

public class CollectionIterationExample {
	public static void main(String[] args) {
		List<Person> person=Arrays.asList(
				new Person("krishna","yadav",24),
				new Person("ram","p",24),
				new Person("lakshman","p",24),
				new Person("rohan","s",24),
				new Person("soean","d",24)
				);
		System.out.println("using normal for loop");
		for (int i = 0; i < args.length; i++) {
			System.out.println(i);
		}
		System.out.println("using  for-each loop");
        for (Person p : person) {
			System.out.println(p);
		}
		System.out.println("using lembda for-each loop");
		person.forEach(p->System.out.println(p));

}
}
