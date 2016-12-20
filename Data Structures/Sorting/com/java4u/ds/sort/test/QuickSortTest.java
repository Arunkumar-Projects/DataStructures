package com.java4u.ds.sort.test;

import com.java4u.ds.sort.QuickSort;

public class QuickSortTest {

	public static void main(String[] args) {
		QuickSort sort= new QuickSort();
		int a[]={25,10,30,15,5};
		sort.quickSort(a);
		sort.print(a);

	}

}
