package com.java4u.ds.stack.impl;

/**
 * Created by varadago on 11/21/2016.
 */
public class StackTest {
    public static void main(String[] args) {
        Node head= null;
        StackUsingLinkedList stack = new StackUsingLinkedList(head);
        stack.push(12);
        stack.push(13);
        stack.push(44);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

}
