package com.java4u.ds.recursion;

import java.util.Scanner;

public class TowersOfHonoi {

	public static void towersOfHonoi(int discs, String start, String auxillary, String end) {
		if (discs == 1) {
			System.out.println(start + " --> " + end);
		} else {
			towersOfHonoi(discs - 1, start, end, auxillary);
			System.out.println(start + " --> " + end);
			towersOfHonoi(discs - 1, auxillary, start, end);
		}
	}

	public static void main(String[] args) {

		System.out.print("Enter number of discs: ");
		Scanner scanner = new Scanner(System.in);
		int discs = scanner.nextInt();
		towersOfHonoi(discs, "A", "B", "C");

	}

}
