package com.java4u.ds.recursion;

public class TraingleNumber {

	public static int traingleNumber(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n + traingleNumber(n - 1);
		}
	}

	public static void main(String[] args) {
		int number = 10;
		System.out.println("Traingle Number of " + number + " is :: " + traingleNumber(number));

	}

}
