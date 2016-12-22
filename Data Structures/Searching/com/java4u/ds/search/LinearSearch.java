package com.java4u.ds.search;

public class LinearSearch {
	public boolean linearSearch(int a[], int key) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == key) {
				return true;
			}
		}
		return false;
	}
}
