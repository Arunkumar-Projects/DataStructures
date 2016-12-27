package com.java4u.ds.trees.binarytree;

public class LongestPathLeafNode {
	int getDiameter(BTNode root) {
		return getLongestPathLeafNode(root);
	}

	/*
	 * This Approaach Takes compexcity of O(N^2)
	 */
	public int getLongestPathLeafNode(BTNode root) {
		if (root == null) {
			return 0;
		}
		if (isLeafNode(root)) {
			return 1;
		} else {
			int leftHeight = getHeight(root.getLeft());
			int rightHeight = getHeight(root.getRight());

			int leftLP = getLongestPathLeafNode(root.getLeft());
			int rightLP = getLongestPathLeafNode(root.getRight());

			return Math.max((leftHeight + rightHeight + 1), Math.max(leftLP, rightLP));
		}

	}

	private int getHeight(BTNode root) {
		if (root == null) {
			return 0;
		}
		return (1 + Math.max(getHeight(root.getLeft()), getHeight(root.getRight())));

	}

	private boolean isLeafNode(BTNode root) {
		if (root.getLeft() == null && root.getRight() == null) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {

		LongestPathLeafNode solution = new LongestPathLeafNode();
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
