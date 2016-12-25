package com.java4u.ds.arrays;

public class MinAndMaxINArray {
	private int min = Integer.MAX_VALUE;
	private int max = Integer.MIN_VALUE;

	public void dacMaxMini(int array[]) {
		dacMaxMin(array, 0, array.length - 1);
	}

	public void dacMaxMin(int array[], int i, int j) {
		int max1, min1, mid;
		if (i == j) {
			max = min = array[i];
		} else if (i == j - 1) {
			if (array[i] < array[j]) {
				max = array[j];
				min = array[i];
			} else {
				max = array[i];
				min = array[j];
			}
		} else {
			mid = (i + j) / 2;
			dacMaxMin(array, i, mid);
			max1 = max;
			min1 = min;
			dacMaxMin(array, mid + 1, j);
			if (max < max1) {
				max = max1;
			}
			if (min > min1) {
				min = min1;
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 23, 44, 55, 12, 18, 89, 3, 99 };
		MinAndMaxINArray solution = new MinAndMaxINArray();
		solution.dacMaxMini(a);
		System.out.println(solution.min);
		System.out.println(solution.max);
	}
}
