package com.java4u.ds.recursion;

public class PowerOfN {

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		} else {
			return x * power(x, n - 1);
		}
	}

	public static int powerN(int x, int n) {
		int y = 0;
		if (n == 0) {
			return 1;
		} else if (n % 2 == 0) {
			y = powerN(x, n / 2);
			return y * y;
		} else {

			return x * power(x, n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println("The power of  2 power 5 is::  " + power(2, 5));
		System.out.println("The power of  2 power 5 is::  " + powerN(2, 5));

	}

}
