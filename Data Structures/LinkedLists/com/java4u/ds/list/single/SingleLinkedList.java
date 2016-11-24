package com.java4u.ds.list.single;

/**
 * Created by Arun on 11/13/2016.
 */
public class SingleLinkedList {
    Node head;
    int size = 0;

    public SingleLinkedList(Node head) {
        this.head = head;
    }

    public void traverse() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void append(int data) {
        //creating new Node
        Node newNode = new Node(data);
        // is FirstNode
        if (isEmpty()) {
            head = newNode;
            size++;
            return;
        }
        // Insert in the middle
        Node currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        if (currentNode.getNext() == null) {
            currentNode.setNext(newNode);
            size++;
        }
    }

    public void delete(int data) {
        if (isEmpty()) {
            System.out.println("List is Empty Cannot delete any Node");
            return;
        } else {
            Node prev = head;
            Node current = head.getNext();
            while (current != null) {
                if (current.getData() == data) {
                    prev.setNext(current.getNext());
                    current.setNext(null);
                    size--;
                    return;
                } else {
                    prev = current;
                    current = current.getNext();
                }
            }

        }
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            size++;
            return;
        }
        Node currentNode = head;
        newNode.setNext(currentNode);
        head = newNode;
        size++;
        return;
    }

    public void deleteAtBeginning() {
        if (isEmpty()) {
            System.out.println("List is Empty!!  Cannot delete any Node");
            return;
        } else {
            Node tempNode = head;
            head = head.getNext();
            tempNode.setNext(null);
            size--;
            return;
        }
    }

    public void deleteAtEnd() {
        if (isEmpty()) {
            System.out.println("List is Empty!! Cannot delete any Node");
            return;
        } else {
            Node prev = head;
            Node current = head.getNext();
            while (current.getNext() != null) {
                prev = current;
                current = current.getNext();
            }
            if (current.next == null) {
                prev.setNext(null);
                size--;
                return;
            }
        }
    }

    public void insertAtPosition(int data, int position) {
        Node node = new Node(data);
        int size = getSize();
        if (isEmpty()) {
            node = head;
            size++;
            return;
        }
        if (position < 0) {
            position = 0;
        }
        if (position > size) {
            position = size;
        } else if (position == 0) {
            Node tempNode = node;
            tempNode.setNext(head);
            head = tempNode;
            size++;
            return;
        } else {
            Node tempNode = head;
            for (int i = 1; i < position; i++) {
                tempNode = tempNode.getNext();
            }
            node.setNext(tempNode.getNext());
            tempNode.setNext(node);
            size++;
            return;
        }
    }

    public int getElementAtPosition(int position){
        Node currentNode= head;
        if(isEmpty()){
            System.out.println("Element cannot be retrieved !! No List found");
            return -1;
        }
        if(position=<0){
            position=0
        }
        if(position>size){

        }
        while(currentNode!=null){
            currentNode= currentNode.getNext()
        }
    }
}
