package com.java4u.ds.trees.bst;

public class CheckBST {

	public boolean isLeafNode(BSTNode root) {
		if (root == null) {
			return true;
		} else if (root.getLeft() == null && root.getRight() == null) {
			return true;
		}
		return false;
	}

	public int findMax(BSTNode root) {
		if (root == null) {
			System.out.println("Invalid data!!");
			return -1;
		}
		while (root.getRight() != null) {
			root.setRight(root);
			if (root.getRight() == null) {
				return root.getData();
			}
		}
		return -1;
	}

	public int findMin(BSTNode root) {
		if (root == null) {
			System.out.println("Invalid Data!!");
			return -1;
		}
		while (root.getLeft() != null) {
			root.setLeft(root);
			if (root.getLeft() == null) {
				return root.getData();
			}
		}
		return -1;
	}

	public boolean isBST(BSTNode root) {
		if (root == null) {
			return true;
		}
		if (isLeafNode(root)) {
			return true;
		} else {
			if (root.getLeft() != null) {
				boolean left = isBST(root.getLeft());
				if (!left) {
					return left;
				}
			}
			if (root.getRight() != null) {
				boolean right = isBST(root.getRight());
				return right;
			}
		}
		return (isBST(root.getLeft()) && isBST(root.getRight()));
	}

	// Using inOrder traversal - where data will be ascending order
	public boolean isBSTUsingArray(BSTNode root) {
		int prev = 0;
		if (root == null) {
			return true;
		}
		if (isLeafNode(root)) {
			return true;
		} else {
			boolean left = isBSTUsingArray(root.getLeft());
			if (!left) {
				return left;
			}
			if (prev < root.getData()) {
				prev = root.getData();
			}
			boolean right = isBSTUsingArray(root.getRight());
			return right;
		}

	}
}
