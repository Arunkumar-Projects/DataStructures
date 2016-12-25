package com.java4u.ds.arrays;

public class MinimumINArray {

	public int findMin(int a[], int low, int high) {
		if (low == high) {
			return a[low];
		} else {
			int mid = (low + high) >> 1;
			int left = findMin(a, low, mid);
			int right = findMin(a, mid + 1, high);
			return left >right ? left : right;
		}
	}

	public static void main(String[] args) {
		int a[] = { 23, 44, 55, 89, 12, 7 };
		MinimumINArray min = new MinimumINArray();
		System.out.println(min.findMin(a, 0, a.length - 1));

	}

}
