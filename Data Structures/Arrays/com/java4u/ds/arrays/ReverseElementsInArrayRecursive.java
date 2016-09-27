package com.java4u.ds.arrays;

public class ReverseElementsInArrayRecursive {
	static int[] arr;

	private void reverseElementsofArray(int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			reverseElementsofArray(start, end);
		}
	}

	private void printElements(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ReverseElementsInArrayRecursive solution = new ReverseElementsInArrayRecursive();
		System.out.println("Elements before reversing!!");
		solution.printElements(arr);
		solution.reverseElementsofArray(0, arr.length - 1);
		System.out.println("\nElements after reversing!!");
		solution.printElements(arr);
	}

}
