package com.java4u.ds.sort.test;

import com.java4u.ds.sort.BubbleSort;

public class BubbleSortTest {

	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int a[] = { 25, 30, 5, 10, 20, 15 };
		int b[] = { 25, 30, 5, 10, 20, 15 };
		sort.print(a);
		sort.bubbleSort(a);
		
		sort.print(b);
		sort.bubbleSortImproved(b);

	}

}
