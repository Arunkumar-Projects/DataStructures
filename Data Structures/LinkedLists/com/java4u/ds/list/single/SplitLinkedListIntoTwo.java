package com.java4u.ds.list.single;

import com.java4u.ds.list.dto.Node;

public class SplitLinkedListIntoTwo {

	void splitNode(Node head){
		Node head1, head2;
		Node slow_ptr=head;
		Node fast_ptr=head.getNext();
		
		if(head==null){
			return;
		}
		
	}
	void printList(Node head) {
		Node currentNode = head;
		if (currentNode != null) {
			while (currentNode != null) {
				System.out.println(currentNode.getData());
				currentNode=currentNode.getNext();
			}
		}
	}

}
