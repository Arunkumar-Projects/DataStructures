package com.java4u.ds.list.single;

import com.java4u.ds.list.dto.Node;

public class NthNodeFromLast {
	public static int getNodeBruteForce(Node h, int n){
		
		return 0;
		
	}
	public static int getNodeHashTable(Node h, int n){
		
		return 0;
		
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

		System.out.println(getNodeBruteForce(h1, 4));
	}

}
