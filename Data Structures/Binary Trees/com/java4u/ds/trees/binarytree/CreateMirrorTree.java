package com.java4u.ds.trees.binarytree;

public class CreateMirrorTree {

	public BTNode createMirrorTree(BTNode root) {
		if (root == null) {
			return null;
		} else {
			BTNode node = new BTNode(root.getData());
			node.setLeft(createMirrorTree(root.getRight()));
			node.setRight(createMirrorTree(root.getLeft()));
			return node;
		}
	}
}
