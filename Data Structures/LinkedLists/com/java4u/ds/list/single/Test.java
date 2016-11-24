package com.java4u.ds.list.single;

/**
 * Created by Arun on 11/13/2016.
 */
public class Test {
    public static void main(String[] args) {
        Node head = null;
        SingleLinkedList list = new SingleLinkedList(head);
        //list.traverse();
        list.insertAtBeginning(34);
        list.append(23);
        list.append(22);
        list.append(33);
        list.append(44);
        list.append(45);
        list.append(47);
        list.append(34);
        System.out.println("Before deletion!!");
        list.traverse();

        list.delete(33);
        System.out.println("After deletion!!");
        list.traverse();
        list.delete(14);
        System.out.println("Insertion at beginning");
        list.insertAtBeginning(45);
        list.insertAtBeginning(458);
        list.traverse();

        System.out.println("Delete at beginning");
        list.deleteAtBeginning();
        list.deleteAtBeginning();
        list.traverse();
        System.out.println("Delete at End");
        list.deleteAtEnd();
        list.traverse();

        int size=list.getSize();
        System.out.println(size);

        System.out.println(" Insert At position ");
        list.insertAtPosition(77,5);
        list.traverse();
    }
}
