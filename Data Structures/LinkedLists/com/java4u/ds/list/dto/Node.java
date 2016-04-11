package com.java4u.ds.list.dto;

public class Node {
	private Object data;
	private Node next;

	public Node() {

	}

	public Object getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node(Object data) {
		this.data = data;
	}

}
