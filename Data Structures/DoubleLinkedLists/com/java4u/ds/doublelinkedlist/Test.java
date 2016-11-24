package com.java4u.ds.doublelinkedlist;

/**
 * Created by varadago on 11/14/2016.
 */
public class Test {
    public static void main(String[] args) {
        DLLNode head=null;
        DoubleLinkedList list = new DoubleLinkedList(head);
        list.append(12);
        list.append(122);
        list.travese();
    }
}
