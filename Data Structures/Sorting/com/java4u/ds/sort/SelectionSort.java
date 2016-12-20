package com.java4u.ds.sort;

public class SelectionSort {
	public void selectionSort(int a[]) {
		int n = a.length;
		int min, pos, temp, j;
		for (pos = 0; pos < n - 1; pos++) {
			min = pos;
			for (j = pos + 1; j < n; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			temp = a[pos];
			a[pos] = a[min];
			a[min] = temp;
		}
		
	}

	public void print(int a[]) {
		System.out.println("Printing Elemenets of an array \n");
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
	}
}
