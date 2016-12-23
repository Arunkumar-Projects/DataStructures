package com.java4u.ds.trees.bst;

import java.util.Arrays;

public class CreateBSTFromArray {
	
	public BSTNode createBSTfromSortedArray(int a[]){
		Arrays.sort(a);
		int high=a.length-1;
		int low=0;
		return sortedArrayToBST(a, low, high);
	}

	private BSTNode sortedArrayToBST(int[] a, int low, int high) {
		if (low > high) {
			return null;
		} else {
			int mid = (low + high) / 2;
			BSTNode node = new BSTNode(a[mid]);
			node.setLeft(sortedArrayToBST(a, low, mid));
			node.setRight(sortedArrayToBST(a, mid + 1, high));
			return node;
		}
	}

}
