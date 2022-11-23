package com.closures;

public class ThisRefrenceExample {
   public void doProcess(int i,Process p) {
	   p.process(i);
   }
   
   public void exicute() {
	   doProcess(10, i->{
		   System.out.println(i);
		   System.out.println(this);
	   });
   }
   public static void main(String[] args) {
	ThisRefrenceExample thisRE=new ThisRefrenceExample();
	thisRE.exicute();
}
}
