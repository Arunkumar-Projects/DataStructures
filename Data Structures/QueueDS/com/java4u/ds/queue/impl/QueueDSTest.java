package com.java4u.ds.queue.impl;

public class QueueDSTest {

	public static void main(String[] args) {
		
		QueueUsingsLinkedList queue= new QueueUsingsLinkedList();
		System.out.println(queue.getSize());
		System.out.println(queue.isEmpty());
		queue.enQueue(22);
		queue.enQueue(34);
		queue.enQueue(44);
		queue.enQueue(45);
		System.out.println(queue.getSize());
		System.out.println(queue.isEmpty());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.getSize());
		System.out.println(queue.isEmpty());

	}

}
