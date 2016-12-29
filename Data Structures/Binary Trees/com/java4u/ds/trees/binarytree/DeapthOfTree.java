package com.java4u.ds.trees.binarytree;

public class DeapthOfTree {
	private int level = 0;

	public int level(BTNode root, int data, int level) {
		if (root == null) {
			return -1;
		} else {
			if (root.getData() == data) {
				return level;
			}
			int left = level(root.getLeft(), data, level + 1);
			if (left != -1) {
				return left;
			}
			int right = level(root.getRight(), data, level + 1);
			if (right != -1) {
				return right;
			}
		}
		return level;
	}

	public int getLevel() {
		return this.level;
	}

	public boolean deapth(BTNode root, int data) {
		if (root == null) {
			return false;
		} else {
			if (root.getData() == data) {
				level++;
				return true;
			}
			boolean left = deapth(root.getLeft(), data);
			if (left) {
				level++;
				return left;
			}
			boolean right = deapth(root.getRight(), data);
			if (right) {
				level++;
				return right;
			}
		}
		return false;
	}

}
