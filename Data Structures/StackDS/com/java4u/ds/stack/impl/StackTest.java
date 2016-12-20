package com.java4u.ds.stack.impl;

/**
 * Created by varadago on 11/21/2016.
 */
public class StackTest {
    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(12);
        stack.push(13);
        stack.push(44);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

}
