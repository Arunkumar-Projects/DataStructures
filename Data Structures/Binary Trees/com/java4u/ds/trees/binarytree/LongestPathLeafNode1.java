package com.java4u.ds.trees.binarytree;

public class LongestPathLeafNode1 {

	class Height {
		int h;
	}

	/*
	 * Wrapper Function for getLongestPathLeafNodeDistance() method.
	 */
	public int getDiameter(BTNode root) {
		Height height = new Height();
		return getLongestPathLeafNodeDistance(root, height);
	}

	/*
	 * This approach will take O(N)
	 */
	private int getLongestPathLeafNodeDistance(BTNode root, Height height) {
		Height lh = new Height(), rh = new Height();
		if (root == null) {
			height.h = 0;
			return 0;
		} else {
			lh.h++;
			rh.h++;
			int left = getLongestPathLeafNodeDistance(root.getLeft(), lh);
			int right = getLongestPathLeafNodeDistance(root.getRight(), rh);
			height.h = Math.max(left, right) + 1;

			return Math.max(lh.h + rh.h + 1, Math.max(right, right));
		}
	}

	public static void main(String args[]) {

		LongestPathLeafNode1 solution = new LongestPathLeafNode1();
		/* creating a binary tree and entering the nodes */
		BTNode tree = new BTNode(5);
		BTNode node1 = new BTNode(4);
		BTNode node2 = new BTNode(11);
		BTNode node3 = new BTNode(12);
		BTNode node4 = new BTNode(13);
		BTNode node5 = new BTNode(13);
		tree.setLeft(node1);
		node1.setLeft(node2);
		node2.setLeft(node3);
		node3.setLeft(node4);
		node4.setLeft(node5);
		tree.setRight(new BTNode(12));
		node5.setRight(new BTNode(23));

		System.out.println("The diameter of given binary tree is : " + solution.getDiameter(tree));
	}
}
