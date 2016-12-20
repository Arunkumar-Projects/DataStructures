package com.java4u.ds.sort.test;

import com.java4u.ds.sort.SelectionSort;

public class SelectionSortTest {
	public static void main(String[] args) {
		SelectionSort sort= new SelectionSort();
		int a[]={25,30,5,10,20,15};
		sort.print(a);
		sort.selectionSort(a);
		sort.print(a);
	}

}
