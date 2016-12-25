package com.java4u.ds.divideandconquer;

public class FindMinInArray {
	public int findMin(int a[], int low, int high) {
		if (low == high) {
			return a[low];
		} else {
			int mid = (low + high) >> 1;
			return Math.min(findMin(a, low, mid), findMin(a, mid + 1, high));
		}
	}

	public static void main(String[] args) {
		int a[] = { 33, 44, 12, 45, 67, 90, 77, 11, 6 };
		FindMinInArray solution = new FindMinInArray();
		int res = solution.findMin(a, 0, a.length - 1);
		System.out.println("Minimum number is:: " + res);
	}

}
