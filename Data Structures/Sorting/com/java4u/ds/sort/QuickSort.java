package com.java4u.ds.sort;

public class QuickSort {

	public void quickSort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}

	private void quickSort(int[] a, int low, int high) {
		if (low >= high) {
			return;
		} else {
			int paritionIndex = parition(a, low, high);
			quickSort(a, low, paritionIndex);
			quickSort(a, paritionIndex+1, high);
		}

	}

	private int parition(int a[], int low, int high) {
		int pivot = a[low];
		int left = low;
		int right = high;
		while (left < right) {
			while (a[left] < pivot && a[left]!=pivot) {
				left++;
			}
			while (a[right] > pivot && a[right]!=pivot) {
				right--;
			}
			if (left < right) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
			} else {
				return right;
			}
		}
		return right;
	}

	public void print(int[] a) {
		System.out.println("Printing the Elements of an Array");
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(a[i]);
		}
	}

}
