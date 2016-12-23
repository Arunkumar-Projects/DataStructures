package com.java4u.ds.trees.bst;

public class KthLargestElementinBST {
	
	public BSTNode kthLargestElement(BSTNode root, int k) {
		int count = 1;
		if (root == null) {
			System.out.println("Largest Element is not found!!");
			return null;
		} else {
			BSTNode right = kthLargestElement(root.getRight(), k);
			if (right != null) {
				return right;
			}
			count++;
			if (count == k) {
				return root;
			}
			BSTNode left = kthLargestElement(root.getLeft(), k);
			return left;
		}
	}
}
