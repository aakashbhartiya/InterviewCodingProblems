/**
 * @author Akash Bhartiya
 * The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * The next number is found by adding up the two numbers before it.
 */

package com.learning.code.problem.solving.recursion;

import java.util.stream.IntStream;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//printing first 15 fibonacci numbers
		IntStream.range(0, 15).map(FibonacciSeries::getNthFibonacciNumber).forEach(System.out::println);

	}

	public static int getNthFibonacciNumber(int n) {

		if (n <= 1)
			return n;

		return getNthFibonacciNumber(n - 1) + getNthFibonacciNumber(n - 2);

	}

}
