package com.java4u.ds.divideandconquer;

public class FindMinAndMax {

	public class MaxMin {
		int max;
		int min;
	}

	public MaxMin getMaxAndMin(int a[], int low, int high) {
		MaxMin result = new MaxMin();
		MaxMin resultLeft = new MaxMin();
		MaxMin resultRight = new MaxMin();
		int mid;

		result.max = a[low];
		result.min = a[low];

		if (low == high) {
			return result;
		}
		mid = (low + high) >> 1;
		resultLeft = getMaxAndMin(a, low, mid);
		resultRight = getMaxAndMin(a, mid + 1, high);

		if (resultLeft.max > resultRight.max)
			result.max = resultLeft.max;
		else
			result.max = resultRight.max;

		if (resultLeft.min < resultRight.min)
			result.min = resultLeft.min;
		else
			result.min = resultRight.min;
		return result;

	}

	public static void main(String[] args) {
		int a[] = { 23, 44, 55, 12, 18, 89, 3, 99 };
		FindMinAndMax solution = new FindMinAndMax();
		MaxMin result = solution.getMaxAndMin(a, 0, a.length - 1);
		System.out.println(result.max);
		System.out.println(result.min);
	}

}
