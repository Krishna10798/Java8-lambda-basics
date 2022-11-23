package com.methodRefE;

public class MethodRefrenceExample {
   public static void main(String[] args) {
//	Thread t=new Thread(()->printMsg());
	Thread t=new Thread(MethodRefrenceExample::printMsg);
	t.start();
}
   public static void printMsg() {
	   System.out.println("hello");
   }
}
