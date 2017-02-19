package com.java4u.ds.priorityqueue;

public class PriorityQueue {
	private Task[] heap;
	private int heapSize, capacity;

	public PriorityQueue(int capacity) {
		this.capacity = capacity + 1;
		heap = new Task[this.capacity];
		heapSize = 0;
	}

	public void clear() {
		heap = new Task[capacity];
		heapSize = 0;
	}

	public boolean isEmpty() {
		return heapSize == 0;
	}

	public boolean isFull() {
		return heapSize == capacity - 1;
	}

	public int size() {
		return heapSize;
	}
}
