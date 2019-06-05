package com.learning.code.problem.solving.recursion;

public class SwapUsingBitwiseOperator {

	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		
		System.out.println("Value of a :["+a+"] and b :["+b+"]");
		swapTheValue(a,b);
		

	}
	
	public static  void swapTheValue(Integer a, Integer b){
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("Value of a :["+a+"] and b :["+b+"]");
	}

}
