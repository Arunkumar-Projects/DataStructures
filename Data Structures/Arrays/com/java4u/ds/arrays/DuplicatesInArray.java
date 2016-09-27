package com.java4u.ds.arrays;

import java.util.HashSet;

public class DuplicatesInArray {

	public boolean isElementsExistsInArray(int arr[]) {
		HashSet<Integer> set = new HashSet<>();
		for (int i : arr) {
			
			if (set.contains(i)) {
				return true;
			}
			else{
				set.add(i);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9 };
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Is array Contains duplicates:" + new DuplicatesInArray().isElementsExistsInArray(arr));
		System.out.println("Is array Contains duplicates:" + new DuplicatesInArray().isElementsExistsInArray(arr1));

	}

}
