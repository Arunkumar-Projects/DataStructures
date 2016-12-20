package com.java4u.ds.stack.impl;

public class StackUsingLinkedList {

    Node top=null;
    int size=0;
    StackUsingLinkedList(){

    }

    public void push(int data){
        Node node = new Node(data);
        if(top==null){
            top= node;
        }
        else{
            node.setNext(top);
            node=top;
            size++;
        }
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        else{
            Node temp=top;
            top= top.getNext();
            temp.setNext(null);
            size--;
            return temp.getData();

        }
    }

    public boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }

    public int getSize(){
        return size;
    }

}
