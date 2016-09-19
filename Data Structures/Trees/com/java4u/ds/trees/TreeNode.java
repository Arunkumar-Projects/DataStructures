package com.java4u.ds.trees;

public class TreeNode {
	private Integer data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	private boolean isDeleted=false;

	public TreeNode(Integer data) {
		super();
		this.data = data;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public TreeNode find(Integer data) {
		if (this.data == data) {
			return this;
		}
		if (data < this.data && leftChild != null) {
			return this.leftChild.find(data);
		}
		if (data > this.data && rightChild != null) {
			return this.rightChild.find(data);
		}
		return null;
	}

	public void insertNode(Integer data) {
		if (data >= this.data) {
			if (this.rightChild == null) {
				rightChild = new TreeNode(data);
			} else {
				this.rightChild.insertNode(data);
			}

		} else {
			if (this.leftChild == null) {
				leftChild = new TreeNode(data);
			} else {
				this.leftChild.insertNode(data);
			}
		}
	}
	
}
