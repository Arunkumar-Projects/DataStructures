package com.java4u.ds.binarysearchtree;

import com.java4u.ds.trees.TreeNode;

public class BinarySearchTree {

	private TreeNode root;

	public void insertNode(Integer data) {
		if (root == null) {
			root = new TreeNode(data);
		} else {
			root.insertNode(data);
		}
	}

	public TreeNode find(Integer data) {
		if (data != null) {
			return root.find(data);
		}
		return null;
	}

	public void deleteNode(Integer data) {
		TreeNode current = this.root;
		TreeNode parent = this.root;
		boolean isLeftChild = false;
		if (current == null) {
			return;
		}
		while (current != null && current.getData() != data) {
			parent = current;
			if (data < current.getData()) {
				current = current.getLeftChild();
				isLeftChild = true;
			} else {
				current = current.getRightChild();
				isLeftChild = false;
			}
		}
		if (current == null) {
			return;
		}
		if (current.getLeftChild() == null && current.getRightChild() == null) {
			if (current == root) {
				root = null;
			} else {
				if (isLeftChild) {
					parent.setLeftChild(null);
				} else {
					parent.setRightChild(null);
				}
			}
		}
		if (current.getLeftChild() == null) {
			if (current == root) {
				root = current.getLeftChild();
			} else if (isLeftChild) {
				parent.setLeftChild(current.getLeftChild());

			} else {
				parent.setRightChild(current.getLeftChild());
			}
		}
		if (current.getRightChild() == null) {
			if (current == root) {
				root = current.getRightChild();
			} else if (isLeftChild) {
				parent.setLeftChild(current.getRightChild());

			} else {
				parent.setRightChild(current.getRightChild());
			}
		}

	}
}
