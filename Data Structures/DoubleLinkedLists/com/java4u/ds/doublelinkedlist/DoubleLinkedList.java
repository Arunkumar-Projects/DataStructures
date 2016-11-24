package com.java4u.ds.doublelinkedlist;

/**
 * Created by varadago on 11/14/2016.
 */
public class DoubleLinkedList {
    DLLNode head=null;
    int size = 0;

    DoubleLinkedList(DLLNode head) {
        this.head = head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtposition(int data, int position) {
        DLLNode node = new DLLNode(data);
        if (isEmpty()) {
            node = head;
            size++;
            return;
        }
        if (position < 0) {
            position = 0;
        }
        if (position > size) {
            position = size + 1;
        }

    }

    public void append(int data) {
        DLLNode node = new DLLNode(data);
        if (isEmpty()) {
            node = head;
            size++;
            return;
        } else {
            DLLNode current = head;
            if (current != null) {
                current = current.getNext();
            }
            current.setNext(node);
            node.setPrev(current);
            size++;
            return;
        }
    }

    public void travese() {
        DLLNode current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
