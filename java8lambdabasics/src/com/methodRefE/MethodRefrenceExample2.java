package com.methodRefE;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.exercise1.Person;

public class MethodRefrenceExample2 {
	public static void main(String[] args) {
		List<Person> person=Arrays.asList(
				new Person("krishna","yadav",24),
				new Person("ram","p",24),
				new Person("lakshman","p",24),
				new Person("rohan","s",24),
				new Person("soean","d",24)
				);
		performCondition(person,p->true,System.out::println);
	}
	private static void performCondition(List<Person> person,Predicate<Person> predicate,Consumer<Person> consumer) {
	for (Person p : person) {
		if(predicate.test(p)) {
			consumer.accept(p);
		}
	}

}
}
