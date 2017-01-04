package com.java4u.ds.recursion;

public class FactorialOfNumber {
	private static long fact[] = new long[51];

	public static long factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static long factorialWithMemoization(int n) {
		long factValue = 0;
		if (n <= 1) {
			return 1;
		} else if (fact[(int) n] != 0) {
			return fact[n];
		} else {
			factValue = n * factorialWithMemoization(n - 1);
			fact[(int) n] = factValue;
			return factValue;
		}
	}

	public static void main(String[] args) {
		System.out.println("Factorial Number generation using recursion");
		long preTime = System.currentTimeMillis();
		System.out.println("Value of 25th number in Fibonacci series->" + factorial(40));
		long postTime = System.currentTimeMillis();
		System.out.println("Time taken to compute in milliseconds->" + (postTime - preTime));

		System.out.println("\n\n");

		System.out.println("Factorial Number generation using recursion with memoization");
		preTime = System.currentTimeMillis();
		System.out.println("Value of 25th number in Fibonacci series->" + factorialWithMemoization(40));
		postTime = System.currentTimeMillis();
		System.out.println("Time taken to compute in milliseconds->" + (postTime - preTime));
	}

}
