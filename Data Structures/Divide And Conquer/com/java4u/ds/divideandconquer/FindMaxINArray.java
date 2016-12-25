package com.java4u.ds.divideandconquer;

public class FindMaxINArray {
	public int max(int a[], int low, int high) {
		if (low == high) {
			return a[low];
		} else {
			int mid = (low + high) >> 1;
			return Math.max(max(a, low, mid), max(a, mid + 1, high));
		}
	}

	public static void main(String[] args) {
		int a[] = { 33, 44, 12, 45, 67, 90, 77, 11, 6 };
		FindMaxINArray solution = new FindMaxINArray();
		int res = solution.max(a, 0, a.length - 1);
		System.out.println("Maximum number is:: " + res);
	}
}
