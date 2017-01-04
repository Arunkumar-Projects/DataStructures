package com.java4u.ds.recursion;

public class SumOfDigitsOfNumber {

	public static int printSumOfDigits(int n) {
		if (n / 10 == 0) {
			return n;
		} else {
			return (printSumOfDigits(n / 10) + n % 10);
		}
	}

	public static void main(String[] args) {
		System.out.println(printSumOfDigits(123));

	}

}
