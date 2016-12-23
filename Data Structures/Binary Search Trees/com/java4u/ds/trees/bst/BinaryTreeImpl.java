package com.java4u.ds.trees.bst;

import com.java4u.ds.trees.bst.BSTNode;

public class BinaryTreeImpl {
	
	public BSTNode insert(int data) {
		return null;
	}

	public void delete(int data) {

	}

	public int findMax(BSTNode root) {
		if (root == null) {
			return 0;
		} else {
			if (root.getRight() == null) {
				return root.getData();
			}
			findMax(root.getRight());
		}
		return 0;
	}

	public int findMin(BSTNode root) {
		if (root == null) {
			return 0;
		} else {
			if (root.getLeft() == null) {
				return root.getData();
			}
			findMin(root.getLeft());
		}
		return 0;
	}

	public void inOrderTraversal(BSTNode root) {
		if (root == null) {
			return;
		} else {
			inOrderTraversal(root.getLeft());
			System.out.println(root.getData());
			inOrderTraversal(root.getRight());
		}
	}

	public void levelOrderTraversal(BSTNode root) {

	}

	public void preOrderTraversal(BSTNode root) {
		if (root == null) {
			return;
		} else {
			System.out.println(root.getData());
			preOrderTraversal(root.getLeft());
			preOrderTraversal(root.getRight());
		}
	}

	public void postOrderTrvaersal(BSTNode root) {
		if (root == null) {
			return;
		} else {
			postOrderTrvaersal(root.getLeft());
			postOrderTrvaersal(root.getRight());
			System.out.println(root.getData());
		}
	}
}
