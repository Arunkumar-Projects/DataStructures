package com.java4u.ds.arrays;

public class MaximumInArray {

	public int findMaximum(int a[], int low, int high) {
		if (low == high) {
			return a[low];
		} else {
			int mid = (low + high) >> 1;
			int left = findMaximum(a, low, mid);
			int right = findMaximum(a, mid + 1, high);
			return left > right ? left : right;
		}
	}

	public static void main(String[] args) {
		int a[] = { 23, 44, 55, 89, 12, 7 };
		MaximumInArray max = new MaximumInArray();
		System.out.println(max.findMaximum(a, 0, a.length - 1));

	}

}
