package com.java4u.ds.search;

import java.util.Arrays;

public class BinarySearch {

	public int binarySearchIterative(int a[], int key) {
		Arrays.sort(a);
		int returnVal = binarySearchIterativeHelper(a, key, 0, a.length - 1);
		return returnVal;
	}

	private int binarySearchIterativeHelper(int a[], int key, int low, int high) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == a[mid]) {
				return mid;
			} else if (key < a[mid]) {
				high = mid - 1;
			} else if (key > a[mid]) {
				low = mid + 1;
			}
		}
		return -1;
	}

	public int binarySearchRecursive(int a[], int key) {
		Arrays.sort(a);
		int returnVal = binarySearchRecursiveHelper(a, key, 0, a.length - 1);
		return returnVal;
	}

	private int binarySearchRecursiveHelper(int a[], int key, int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (key == a[mid]) {
				return mid;
			} else if (key < a[mid]) {
				return binarySearchRecursiveHelper(a, key, low, mid);
			} else if (key > a[mid]) {
				return binarySearchRecursiveHelper(a, key, mid + 1, high);
			}
		}
		return -(low + 1);
	}
}
