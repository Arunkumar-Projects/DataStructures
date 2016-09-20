package com.java4u.ds.arrays.patterns;

public class ReverseFloydTraingleStars {

	public static void print(int n) {
		int value = 1;
		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("* ");
				value++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		print(4);
	}

}
