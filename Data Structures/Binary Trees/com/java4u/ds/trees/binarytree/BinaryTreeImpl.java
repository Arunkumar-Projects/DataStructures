package com.java4u.ds.trees.binarytree;

import java.util.Queue;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

public class BinaryTreeImpl {
	private int size = 0;
	private BTNode root = null;

	public int getSize() {
		return size;
	}

	public int getSizeByTrversing(BTNode root) {
		if (root == null) {
			return 0;
		} else {
			int left = getSizeByTrversing(root.getLeft());
			int right = getSizeByTrversing(root.getRight());
			return (1 + left + right);
			// one line statement for above code
			// return (1+
			// getSizeByTrversing(root.getLeft())+getSizeByTrversing(root.getRight()));
		}
	}

	public int getHeight(BTNode root) {
		if (root == null) {
			return 0;
		} else {
			int left = getHeight(root.getLeft());
			int right = getHeight(root.getRight());
			return (1 + Math.max(left, right));
			// one line statement for above code
			// return (1+Math.max(
			// getHeight(root.getLeft()),getHeight(root.getRight()));
		}
	}

	public boolean isLeafNode(BTNode root) {
		if (root == null) {
			return true;
		}
		if (root.getLeft() == null && root.getRight() == null) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (root == null) {
			return true;
		}
		return false;
	}

	public boolean isContains(BTNode root, int data) {
		if (root == null) {
			return false;
		} else {
			if (root.getData() == data) {
				return true;
			}
			boolean left = isContains(root.getLeft(), data);
			if (!left) {
				return left;
			}
			boolean right = isContains(root.getRight(), data);
			return right;
		}
	}

	public void printLeafNodes(BTNode root) {
		if (root == null) {
			return;
		} else {
			if (root.getLeft() == null && root.getRight() == null) {
				System.out.println(root.getData());
			}
			printLeafNodes(root.getLeft());
			printLeafNodes(root.getRight());
		}
	}

	public void printBoundaryOfTree(BTNode root) {
		printLeft(root);
		printLeafNodes(root);
		printRight(root);
	}

	private void printRight(BTNode root) {
		if (root == null) {
			return;
		}
		if (root.getLeft() == null && root.getRight() == null) {
			return;
		} else {
			if (root.getLeft() != null) {
				printRight(root.getLeft());
			} else {
				printRight(root.getRight());
			}
			System.out.println(root.getData());
		}
	}

	private void printLeft(BTNode root) {
		if (root == null) {
			return;
		}
		if (root.getLeft() == null && root.getRight() == null) {
			return;
		} else {
			System.out.println(root.getData());
			if (root.getLeft() != null) {
				printLeft(root.getLeft());
			} else {
				printLeft(root.getRight());
			}
		}
	}

	public void insert(int data) {
		BTNode node = new BTNode(data);
		if (root == null) {
			root = node;
			size++;
			return;
		}
		Queue<BTNode> queue = new Queue<BTNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BTNode temp = queue.poll();
			if (temp.getLeft() == null) {
				temp.setLeft(node);
				size++;
				return;
			} else {
				queue.add(temp.getLeft());
			}
			if (temp.getRight() == null) {
				temp.setRight(node);
				size++;
				return;
			} else {
				queue.add(temp.getRight());
			}
		}
	}

	public void preOrderTraversal(BTNode root) {
		if (root == null) {
			return;
		} else {
			System.out.println(root.getData());
			preOrderTraversal(root.getLeft());
			preOrderTraversal(root.getRight());
		}
	}

	public void postOrderTraversal(BTNode root) {
		if (root == null) {
			return;
		} else {
			preOrderTraversal(root.getLeft());
			preOrderTraversal(root.getRight());
			System.out.println(root.getData());
		}
	}

	public void inOrderTraversal(BTNode root) {
		if (root == null) {
			return;
		} else {
			preOrderTraversal(root.getLeft());
			System.out.println(root.getData());
			preOrderTraversal(root.getRight());
		}
	}
}
