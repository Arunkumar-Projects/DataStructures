package com.java4u.ds.trees.binarytree;

public class SumOfRightLeafs {
	private int sumOfRightLeaves = 0;

	public int SumOfrightLeaves(BTNode root, BTNode parent) {
		if (root == null) {
			return 0;
		} else {
			SumOfrightLeaves(root.getLeft(), root);
			if (root.getLeft() == null && root.getRight() == null && parent.getRight() == root) {
				sumOfRightLeaves += root.getData();
			}
			SumOfrightLeaves(root.getRight(), root);
		}
		return sumOfRightLeaves;
	}

	public static void main(String[] args) {
		BTNode root = new BTNode(10);
		BTNode node1 = new BTNode(5);
		BTNode node2 = new BTNode(15);
		BTNode node3 = new BTNode(10);
		BTNode node4 = new BTNode(12);
		BTNode node5 = new BTNode(6);
		BTNode node6 = new BTNode(8);
		BTNode node7 = new BTNode(5);
		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node2.setLeft(node5);
		node2.setRight(node6);
		node6.setRight(node7);

		int sum = new SumOfRightLeafs().SumOfrightLeaves(root, root);
		System.out.println("Sum of right leaves: " + sum);
	}

}
