package com.java4u.ds.trees.binarytree;

public class IsMirrorTree {

	public boolean isMirror(BTNode root1, BTNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return true;
		} else {
			if (root1.getData() != root2.getData()) {
				return false;
			}
			boolean left = isMirror(root1.getLeft(), root2.getRight());
			if (!left) {
				return left;
			}
			boolean right = isMirror(root1.getLeft(), root2.getRight());
			if (!right) {
				return right;
			}

			return ((root1.getData() == root2.getData()) && isMirror(root1.getLeft(), root2.getRight())
					&& isMirror(root1.getRight(), root2.getLeft()));
		}
	}

}
