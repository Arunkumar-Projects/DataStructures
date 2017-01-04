package com.java4u.ds.recursion;

public class PrintArrayUsingRecursion {

	public static void print(int a[], int n) {
		if (n == 0) {
			return;
		} else {
			System.out.println(a[n-1]);
			print(a, n - 1);
		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 4, 5, 6, 7, 8, 89, 11 };
		print(a, a.length);
	}

}
