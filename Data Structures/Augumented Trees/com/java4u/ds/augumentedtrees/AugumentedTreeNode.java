package com.java4u.ds.augumentedtrees;

public class AugumentedTreeNode {

	private int data;
	private int size;
	private AugumentedTreeNode left;
	private AugumentedTreeNode right;

	public AugumentedTreeNode(int data) {
		super();
		this.data = data;
		this.size = 1;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public AugumentedTreeNode getLeft() {
		return left;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setLeft(AugumentedTreeNode left) {
		this.left = left;
	}

	public AugumentedTreeNode getRight() {
		return right;
	}

	public void setRight(AugumentedTreeNode right) {
		this.right = right;
	}

}
