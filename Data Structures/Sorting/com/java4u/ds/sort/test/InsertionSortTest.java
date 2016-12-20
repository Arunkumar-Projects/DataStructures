package com.java4u.ds.sort.test;

import com.java4u.ds.sort.InsertionSort;

public class InsertionSortTest {

	public static void main(String[] args) {
		InsertionSort sort= new InsertionSort();
		int a[]={25,30,5,10,20,15};
		sort.print(a);
		sort.insertionSort(a);

	}

}
