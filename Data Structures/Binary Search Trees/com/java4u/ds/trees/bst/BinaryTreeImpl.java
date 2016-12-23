package com.java4u.ds.trees.bst;

import com.java4u.ds.trees.bst.BSTNode;

public class BinaryTreeImpl {
	private int size = 0;
	private BSTNode root = null;

	public int getSize() {
		return size;
	}

	public boolean isEmpty(BSTNode root) {
		if (root == null) {
			return true;
		}
		return false;
	}

	public void insert(BSTNode root, int data) {
		BSTNode node = new BSTNode(data);
		if (isEmpty(root)) {
			root = node;
			size++;
			return;
		}
		while (root != null) {
			if (data < root.getData()) {
				if (root.getLeft() == null) {
					root.setLeft(node);
					size++;
					return;
				} else {
					root.setLeft(root);
				}
			} else if (data >= root.getData()) {
				if(root.getRight()== null){
					root.setRight(node);
					size++;
					return;
				}else{
					root.setRight(root);
				}
			}
		}

	}

	public void delete(int data) {

	}

	public int findMaxIterative(BSTNode root) {
		if (root == null) {
			System.out.println("Invalid Data!!");
			return -1;
		}
		while (root.getRight() != null) {
			root.setRight(root.getRight());
			if (root.getRight() == null) {
				return root.getData();
			}
		}
		return -1;
	}

	public int findMinIterative(BSTNode root) {
		if (root == null) {
			System.out.println("Invalid Data!!");
			return -1;
		}
		while (root.getLeft() != null) {
			root.setLeft(root.getLeft());
			if (root.getLeft() == null) {
				return root.getData();
			}
		}
		return -1;
	}

	public int findMaxRecursive(BSTNode root) {
		if (root == null) {
			return -1;
		} else if (root.getRight() == null) {
			return root.getData();
		} else {
			findMaxRecursive(root.getRight());
		}
		return -1;
	}

	public int findMinRecursive(BSTNode root) {
		if (root == null) {
			return -1;
		} else if (root.getLeft() == null) {
			return root.getData();
		} else {
			findMinRecursive(root.getLeft());
		}
		return -1;
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
