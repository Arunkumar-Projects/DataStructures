package com.java4u.ds.trees.binarytree;

public class PrintRootLeafPaths {
	
	public void printLeafRootPaths(BTNode root, int[] pArray, int level) {
		if (root == null) {
			return;
		}
		pArray[level] = root.getData();
		if (isLeaf(root)) {
			printMethod(pArray, level);
			return;
		} else {
			printLeafRootPaths(root.getLeft(), pArray, level);
			printLeafRootPaths(root.getRight(), pArray, level);
		}
	}

	private boolean isLeaf(BTNode root) {
		if (root.getLeft() == null && root.getRight() == null) {
			return true;
		}
		return false;
	}

	private void printMethod(int[] pArray, int level) {
		for (int i = 0; i < level; i++) {
			System.out.println(pArray[i]);
		}
	}
}
