package com.exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainMethodSolJAVA7 {
	public static void main(String[] args) {
		List<Person> person=Arrays.asList(
				new Person("krishna","yadav",24),
				new Person("ram","p",24),
				new Person("lakshman","p",24),
				new Person("rohan","s",24),
				new Person("soean","d",24)
				);
		//      1. sort list by last name

		Collections.sort(person,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		//		2. create method that print all elements in the list
		System.out.println("______________________________");

		printAll(person);

		//	    3. print all elements that last name start with p
		System.out.println("______________________________");

		printLastnameStartWithChar(person);

		System.out.println("_____________OR_________________");

		printCondition(person,new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("p");
			}
		});

		//	    4. print all elements that first name start with k
		System.out.println("______________________________");

		printCondition(person,new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("k");
			}
		});

	}

	private static void printLastnameStartWithChar(List<Person> person) {
		for (Person p : person) {
			if(p.getLastName().startsWith("p")) {
				System.out.println(p);
			}
		}

	}

	private static void printCondition(List<Person> person,Condition condition) {
		for (Person p : person) {
			if(condition.test(p)) {
				System.out.println(p);
			}
		}

	}

	private static void printAll(List<Person> person) {
		for(Person p: person) {
			System.out.println(p);
		}

	}
}

interface Condition{
	boolean test(Person p);
}
