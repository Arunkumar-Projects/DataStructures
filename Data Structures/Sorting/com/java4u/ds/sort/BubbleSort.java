package com.java4u.ds.sort;

public class BubbleSort {

	public void bubbleSort(int a[]) {
		int n = a.length;
		int pass;
		for (pass = n - 1; pass >= 1; pass--) {
			for (int j = 0; j < pass; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j]= a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		print(a);
	}

	public void bubbleSortImproved(int a[]) {
		boolean swapped = true;
		int n = a.length;
		int pass;
		for (pass = n - 1; pass >= 1 && swapped; pass--) {
			swapped = false;
			for (int j = 0; j < pass; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j]= a[j + 1];
					a[j + 1] = temp;
					swapped = true;
				}
			}
		}
		print(a);
	}

	public void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}

	public void print(int a[]) {
		System.out.println("Printing Elemenets of an array \n");
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
	}
}
