package com.java4u.ds.queue.impl;

import com.java4u.ds.queue.dto.Node;

public class QueueUsingsLinkedList {
	Node front = null;
	Node rear = null;
	int size = 0;

	public void enQueue(int data) {
		Node node = new Node(data);
		if (isEmpty()) {
			front = node;
			rear = node;
			size++;
			System.out.println(node.getData());
			return;
		} else {
			rear.setNext(node);
			rear = node;
			size++;
			System.out.println(node.getData());
			return;
		}

	}

	public int deQueue() {
		if (isEmpty()) {
			return -1;
		}
		if (front == rear) {
			front = rear = null;
		} else {
			Node temp = front;
			if (front == rear) {
				front = rear = null;
			} else {
				front = front.getNext();
				temp.setNext(null);
				size--;
				return temp.getData();
			}
		}
		return -1;
	}

	public boolean isEmpty() {
		if (front == null && rear == null) {
			return true;
		}
		return false;
	}

	public int getSize() {
		return size;
	}
}
