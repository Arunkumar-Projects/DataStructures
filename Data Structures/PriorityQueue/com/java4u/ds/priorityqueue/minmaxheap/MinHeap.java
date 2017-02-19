package com.java4u.ds.priorityqueue.minmaxheap;

public class MinHeap {
	private int size;
	private int[] minHeap;
	private int position;

	public MinHeap(int size) {
		super();
		this.size = size;
		minHeap = new int[size + 1];
		this.position = 0;
	}

	public void createHeap(int[] arrA) {
		if (arrA.length > 0) {
			for (int i = 0; i < arrA.length; i++) {
				insert(arrA[i]);
			}
		}
	}

	public void display() {
		for (int i = 1; i < minHeap.length; i++) {
			System.out.print(" " + minHeap[i]);
		}
		System.out.println("");
	}

	public void insert(int x) {
		if (position == 0) {
			minHeap[position + 1] = x;
			position = 2;
		} else {
			minHeap[position++] = x;
			bubbleUp();
		}
	}

	public void bubbleUp() {
		int pos = position - 1;
		while (pos > 0 && minHeap[pos / 2] > minHeap[pos]) {
			int y = minHeap[pos];
			minHeap[pos] = minHeap[pos / 2];
			minHeap[pos / 2] = y;
			pos = pos / 2;
		}
	}

	public int extractMin() {
		int min = minHeap[1];
		minHeap[1] = minHeap[position - 1];
		minHeap[position - 1] = 0;
		position--;
		sinkDown(1);
		return min;
	}

	public void sinkDown(int k) {
		int a = minHeap[k];
		int smallest = k;
		if (2 * k < position && minHeap[smallest] > minHeap[2 * k]) {
			smallest = 2 * k;
		}
		if (2 * k + 1 < position && minHeap[smallest] > minHeap[2 * k + 1]) {
			smallest = 2 * k + 1;
		}
		if (smallest != k) {
			swap(k, smallest);
			sinkDown(smallest);
		}

	}

	private void swap(int a, int b) {
		int temp = minHeap[a];
		minHeap[a] = minHeap[b];
		minHeap[b] = temp;
	}

	public static void main(String args[]) {
		int arrA[] = { 3, 2, 1, 7, 8, 4, 10, 16, 12 };
		System.out.print("Original Array : ");
		for (int i = 0; i < arrA.length; i++) {
			System.out.print("  " + arrA[i]);
		}
		MinHeap m = new MinHeap(arrA.length);
		System.out.print("\nMin-Heap : ");
		m.createHeap(arrA);
		m.display();
		System.out.print("Extract Min :");
		for (int i = 0; i < arrA.length; i++) {
			System.out.print("  " + m.extractMin());
		}

	}
}
