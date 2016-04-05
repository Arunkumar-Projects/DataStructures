package com.java4u.ds.list.single;

import com.java4u.ds.list.dto.Node;

public class YProblemInSingleLinkedListUsingArrays {

	public static boolean isLinkedNodeFound(Node head1, Node head2) {
		
		int length = getLength(head1);
		Integer [] array1 = new Integer[length];
		for (int i = 0; i <= length-1; i++) {
			array1[i] = (Integer) head1.getData();
			head1 = head1.getNext();
		}
		printArrayData(array1);
		
		
		for(int i=0;i<=array1.length-1;i++){
			
		}
		return false;
	}

	private static void printArrayData(Integer [] array) {
		for (int i = 0; i <= array.length-1; i++) {
			System.out.println(array[i]);
		}
	}

	private static int getLength(Node head) {
		int length = 0;
		Node currentNode = head;
		while (currentNode != null) {
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}

	public static void main(String[] args) {
		Node n1 = new Node(new Integer(11));
		Node n2 = new Node(new Integer(13));
		Node n3 = new Node(new Integer(14));
		Node n4 = new Node(new Integer(15));
		Node n5 = new Node(new Integer(35));
		Node n6 = new Node(new Integer(55));
		Node n7 = new Node(new Integer(65));
		Node n8 = new Node(new Integer(75));

		Node h1 = new Node(new Integer(12));
		h1.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		n7.setNext(n8);
		
		Node h2= new Node(new Integer(43));
		Node hn1= new Node(new Integer(46));
		Node hn2= new Node(new Integer(66));
		hn2.setNext(n3);
		
		isLinkedNodeFound(h1, h2);

	}

}
