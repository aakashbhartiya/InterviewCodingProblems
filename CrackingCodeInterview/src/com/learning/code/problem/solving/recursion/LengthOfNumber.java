/**
 *@author akash bhartiya
 *Finding the length of a number without using any predefined function. 
 */

package com.learning.code.problem.solving.recursion;

public class LengthOfNumber {

	public static void main(String[] args) {

		System.out.println(getLength(123456));
		
	}

	public static int getLength(int number) {

		if (number < 10) {
			return 1;
		}

		return 1 + getLength(number / 10);

	}

}
