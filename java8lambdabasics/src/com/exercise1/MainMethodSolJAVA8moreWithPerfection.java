package com.exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainMethodSolJAVA8moreWithPerfection {
	public static void main(String[] args) {
		List<Person> person=Arrays.asList(
				new Person("krishna","yadav",24),
				new Person("ram","p",24),
				new Person("lakshman","p",24),
				new Person("rohan","s",24),
				new Person("soean","d",24)
				);
		//      1. sort list by last name

		Collections.sort(person,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));

		//		2. create method that print all elements in the list
		System.out.println("______________________________");

		performCondition(person,p->true,p->System.out.println(p));

		//	    3. print all elements that last name start with p
		System.out.println("______________________________");

		performCondition(person,p->p.getLastName().startsWith("p"),p->System.out.println(p));

		System.out.println("_____________OR_________________");


		//	    4. print all elements that first name start with k
		System.out.println("______________________________");

		performCondition(person,p->p.getFirstName().startsWith("k"),p->System.out.println(p));


	}
	
	///////////////////OR///////////////
	private static void performCondition(List<Person> person,Predicate<Person> predicate,Consumer<Person> consumer) {
	for (Person p : person) {
		if(predicate.test(p)) {
			consumer.accept(p);
		}
	}

}
}

