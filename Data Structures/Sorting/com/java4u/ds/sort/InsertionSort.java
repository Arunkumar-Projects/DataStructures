package com.java4u.ds.sort;

public class InsertionSort {
	public void insertionSort(int a[]) {
		int n = a.length;
		int pos, temp, j;
		for (pos = 1; pos < n; pos++) {
			j = pos;
			while (j > 0 && a[j - 1] > a[j]) {
				temp = a[j - 1];
				a[j - 1] = a[j];
				a[j] = temp;
				j--;
			}
		}
		print(a);
	}

	public void print(int a[]) {
		System.out.println("Printing Elemenets of an array \n");
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
	}
}
