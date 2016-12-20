package com.java4u.ds.trees.bst;

public class BSTNode {
	private int data;
	private BSTNode right;
	private BSTNode left;

	public BSTNode(int data) {
		this.data = data;
	}

	public BSTNode() {
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}

	public BSTNode getLeft() {
		return left;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}
	
}
