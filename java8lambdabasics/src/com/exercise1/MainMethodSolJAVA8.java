package com.exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class MainMethodSolJAVA8 {
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

		printCondition(person,p->true);

		//	    3. print all elements that last name start with p
		System.out.println("______________________________");

		printCondition(person,p->p.getLastName().startsWith("p"));

		System.out.println("_____________OR_________________");


		//	    4. print all elements that first name start with k
		System.out.println("______________________________");

		printCondition(person,p->p.getFirstName().startsWith("k"));


	}

//	private static void printCondition(List<Person> person,Condition condition) {
//		for (Person p : person) {
//			if(condition.test(p)) {
//				System.out.println(p);
//			}
//		}
//
//	}
	
	///////////////////OR///////////////
	private static void printCondition(List<Person> person,Predicate<Person> predicate) {
	for (Person p : person) {
		if(predicate.test(p)) {
			System.out.println(p);
		}
	}

}
}

