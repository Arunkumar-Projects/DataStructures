package com.java4u.ds.trees.binarytree;

public class PrintAncesters {

	public boolean printAncesters(BTNode root, int data) {
		if (root == null) {
			return false;
		}
		if (root.getData() == data) {
			return true;
		} else {
			boolean left = printAncesters(root.getLeft(), data);
			if (left) {
				System.out.println(root.getData());
				return left;
			}
			boolean right = printAncesters(root.getRight(), data);
			if (right) {
				System.out.println(root.getData());
				return right;
			}
			if ((root.getData() == data) || printAncesters(root.getLeft(), data)
					|| printAncesters(root.getRight(), data)) {
				System.out.println(root.getData());
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		

	}

}
