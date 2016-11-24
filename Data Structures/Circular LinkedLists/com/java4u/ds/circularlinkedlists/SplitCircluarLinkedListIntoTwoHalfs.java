package com.java4u.ds.circularlinkedlists;

import java.util.LinkedList;

import sun.applet.Main;

public class SplitCircluarLinkedListIntoTwoHalfs {

	static Node head, head1, head2;

	static class Node {
		private int data;
		private Node next, prev;

		Node(int data) {
			this.data = data;
			next = prev = null;
		}
	}

	void printList(Node node) {
		Node temp = node;
		if (node != null) {
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp != node);
		}
	}

	void splitCircularList() {
		Node slow_ptr = head;
		Node fast_ptr = head;

		if (head == null) {
			return;
		}

		while (fast_ptr.next != head && slow_ptr.next.next != head) {
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}

		if (fast_ptr.next.next == head) {
			fast_ptr = fast_ptr.next;
		}

		head1 = head;
		if (head.next != head) {
			head2 = slow_ptr.next;
		}

		fast_ptr.next = slow_ptr.next;
		slow_ptr.next = head;
	}

	public static void main(String[] args) {
		SplitCircluarLinkedListIntoTwoHalfs list = new SplitCircluarLinkedListIntoTwoHalfs();
		head = new Node(12);
		head.next = new Node(56);
		head.next.next = new Node(2);
		head.next.next.next = new Node(33);
		head.next.next.next.next = new Node(11);
		head.next.next.next.next.next = head;

		System.out.println("Original Circular Linked list ");
		list.printList(head);

		// Split the list
		list.splitCircularList();
		System.out.println("");
		System.out.println("First Circular List ");
		list.printList(head1);
		System.out.println("");
		System.out.println("Second Circular List ");
		list.printList(head2);
	}
}
