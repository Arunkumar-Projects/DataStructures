package com.java4u.ds.arrays;

import java.util.Arrays;

public class ReverseElementsInArray {
	static int[] arr;

	public void reverseElementsofArray() {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return;
	}

	private void printElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ReverseElementsInArray solution = new ReverseElementsInArray();
		System.out.println("Elements before reversing!!");
		solution.printElements(arr);
		solution.reverseElementsofArray();
		System.out.println("\nElements after reversing!!");
		solution.printElements(arr);
	}

}
