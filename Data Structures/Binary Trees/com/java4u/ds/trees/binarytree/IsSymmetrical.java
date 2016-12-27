package com.java4u.ds.trees.binarytree;

public class IsSymmetrical {

	boolean isSymmetrical(BTNode root1, BTNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		} else if (root1 == null || root2 == null) {
			return false;
		} else {
			if (root1.getData() != root2.getData()) {
				return false;
			}
			boolean left = isSymmetrical(root1.getLeft(), root2.getLeft());
			if (!left) {
				return left;
			}
			boolean right = isSymmetrical(root1.getRight(), root2.getRight());
			if (!right) {
				return right;
			}
			return (((root1.getData() == root2.getData()) && isSymmetrical(root1.getLeft(), root2.getRight())
					&& isSymmetrical(root1.getRight(), root2.getRight())));
		}
	}
}
