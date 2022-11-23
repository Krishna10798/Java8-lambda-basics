package com.java8lambdabasics;

public class RunnableExample {
 public static void main(String[] args) {
	Thread myThread=new Thread(new Runnable() {
		
		@Override
		public void run() {
			 System.out.println("inside runnable method...");
			}
	});
	myThread.run();
	
	Thread myLambdaThread=new Thread(()->System.out.println("inside lambda thread running method..."));
	myLambdaThread.run();
}
}
