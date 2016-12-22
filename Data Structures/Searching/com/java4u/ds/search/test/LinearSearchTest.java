package com.java4u.ds.search.test;

import com.java4u.ds.search.LinearSearch;

public class LinearSearchTest {

	public static void main(String[] args) {
		int a[] = { 24, 55, 66, 77, 88, 12 };
		LinearSearch search = new LinearSearch();
		int key = 44, key1 = 55;
		boolean found = search.linearSearch(a, key);
		System.out.println("is key " + key + " found: " + found);
		found = search.linearSearch(a, key1);
		System.out.println("is key " + key1 + " found: " + found);
	}

}
