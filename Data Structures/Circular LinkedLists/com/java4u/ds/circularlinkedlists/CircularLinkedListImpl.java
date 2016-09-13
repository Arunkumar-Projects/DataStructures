package com.java4u.ds.circularlinkedlists;

public class CircularLinkedListImpl {

	void printCircularLinkedList(Node head) {
		Node currentNode = head;
		if (head != null) {
			while (currentNode != head) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			}
		}
	}

	int size(Node head) {
		Node currentNode = head;
		int size = 0;
		if (head != null) {
			while (currentNode != head) {
				size++;
				currentNode = currentNode.next;
			}
		}
		return size;
	}

	public static void main(String[] args) {
		CircularLinkedListImpl list = new CircularLinkedListImpl();
		Node head = new Node(12);
		head.next = new Node(22);
		head.next.next = new Node(32);

	}

}

class Node {
	Node next;
	int data;

	Node(int data) {
		this.data = data;
		next = null;
	}
}