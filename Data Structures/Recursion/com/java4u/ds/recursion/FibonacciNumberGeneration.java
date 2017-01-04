package com.java4u.ds.recursion;

public class FibonacciNumberGeneration {
	private static long[] fibArray = new long[51];

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	// Memoization is technique to cache the result of previous computed values
	public static long fibonacciWithMemoization(int n) {
		long fibValue = 0;
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (fibArray[(int) n] != 0) {
			return fibArray[(int) n];
		} else {
			fibValue = fibonacciWithMemoization(n - 1) + fibonacciWithMemoization(n - 2);
			fibArray[(int) n] = fibValue;
			return fibValue;
		}
	}

	public static void main(String[] args) {
		System.out.println("Fibonacci Number generation using recursion");
		long preTime = System.currentTimeMillis();
		System.out.println("Value of 40th number in Fibonacci series->" + fibonacci(40));
		long postTime = System.currentTimeMillis();
		System.out.println("Time taken to compute in milliseconds->" + (postTime - preTime));

		System.out.println("Fibonacci Number generation using recursion with memoization");
		preTime = System.currentTimeMillis();
		System.out.println("Value of 40th number in Fibonacci series->" + fibonacciWithMemoization(40));
		postTime = System.currentTimeMillis();
		System.out.println("Time taken to compute in milliseconds->" + (postTime - preTime));

	}

}
