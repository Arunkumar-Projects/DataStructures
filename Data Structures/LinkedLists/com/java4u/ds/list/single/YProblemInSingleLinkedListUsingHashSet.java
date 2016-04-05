package com.java4u.ds.list.single;

import java.util.HashSet;

import com.java4u.ds.list.dto.Node;

public class YProblemInSingleLinkedListUsingHashSet {

	public static void main(String[] args) {
		Node n1 = new Node(new Integer(11));
		Node n2 = new Node(new Integer(13));
		Node n3 = new Node(new Integer(14));
		Node n4 = new Node(new Integer(15));
		Node n5 = new Node(new Integer(35));
		Node n6 = new Node(new Integer(55));
		Node n7 = new Node(new Integer(65));
		Node n8 = new Node(new Integer(75));

		// list 1 creation
		Node h1 = new Node(12);
		h1.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		n7.setNext(n8);

		// list 2 creation
		Node h2 = new Node(new Integer(43));
		Node hn1 = new Node(new Integer(46));
		Node hn2 = new Node(new Integer(66));
		h2.setNext(hn1);
		hn1.setNext(hn2);
		hn2.setNext(n7);

		SingleLinkedList list= new SingleLinkedList();
		//list.display(h2);
		Node node = getLinkedNodeFound(h1, h2);
	}

	private static Node getLinkedNodeFound(Node h1, Node h2) {
		SingleLinkedList list= new SingleLinkedList();
		HashSet<Object> set=new HashSet<Object>();
		
		while(h1!=null){
			set.add(h1.getData());
			h1= h1.getNext();
		}
		
		while(h2!=null){
			if(set.contains(h2.getData())){
				System.out.println("\n Node Found!!");
				System.out.println(h2.getData());
				return new Node(h2.getData());
			}
			h2= h2.getNext();
		}
		return null;
	}

}
