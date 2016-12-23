package com.java4u.ds.trees.bst;

public class KthSmallestEementInBST {
	
	public BSTNode kthSmallestElement(BSTNode root, int k) {
		int count = 1;
		if (root == null) {
			System.out.println("Smallest Element not found!!");
			return null;
		} else {
			BSTNode left = kthSmallestElement(root.getLeft(), k);
			if (left != null) {
				return left;
			}
			count++;
			if (count == k) {
				return root;
			}
			BSTNode right = kthSmallestElement(root.getRight(), k);
			return right;
		}
	}
}
