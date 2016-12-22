package com.java4u.ds.search.test;

import com.java4u.ds.search.BinarySearch;

public class BinarySearchTest {

	public static void main(String[] args) {
		int a[] = { 24, 55, 66, 77, 88, 12 };
		BinarySearch search= new BinarySearch();
		int index= search.binarySearchIterative(a, 12);
		System.out.println(index);
		index= search.binarySearchRecursive(a, 88);
		System.out.println(index);
	}

}
