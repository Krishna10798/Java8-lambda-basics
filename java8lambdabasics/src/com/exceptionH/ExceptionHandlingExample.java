package com.exceptionH;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
	
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		int key=0;
		process(arr,key,(v,k)->System.out.println(v+k));
		System.out.println("----------------------------");
		process(arr,key,(v,k)->System.out.println(v-k));
		System.out.println("----------------------------");
		process(arr,key,(v,k)->System.out.println(v*k));
		System.out.println("----------------------------");
		process(arr,key,(v,k)->System.out.println(v/k));
		System.out.println("----------------------------");

	}

	private static void process(int[] arr, int key,BiConsumer<Integer, Integer> biConsumer) {
		for (int i : arr) {
			try {
				biConsumer.accept(i,key);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}
