package com.java4u.ds.trees.binarytree;

public class SumOfLeftLeaves {
	private int sumOfLeftleaves = 0;

	public int getSum() {
		return sumOfLeftleaves;
	}

	public int sumOfleftLeaves(BTNode root, BTNode parent) {
		if (root == null) {
			return 0;
		} else {
			sumOfleftLeaves(root.getLeft(), root);
			if (root.getLeft() == null && root.getRight() == null && parent.getLeft() == root) {
				sumOfLeftleaves += root.getData();
			}
			sumOfleftLeaves(root.getRight(), root);
		}
		return sumOfLeftleaves;
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
		
		
		
		int sum=new SumOfLeftLeaves().sumOfleftLeaves(root, root);
		System.out.println("Sum of left leaves: " + sum);
	}

}
