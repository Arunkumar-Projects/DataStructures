package com.java4u.ds.list.single;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.java4u.ds.list.dto.Node;

public class SingleLinkedList  {
	
	public int size(Node headNode) {
		int length=0;
		Node currentNode= headNode;
		while(currentNode!=null){
			currentNode= currentNode.getNext();
			length++;
		}
		return length;
	}

	public boolean isEmpty(Node headNode) {
		if(headNode==null){
			return true;
		}
		return false;
	}

	public boolean contains(Node item, Node headNode) {
		Node CurrentNode;
		return false;
	}

	public Iterator<Node> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
//
//	@Override
//	public boolean add(E e) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean remove(Object o) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean containsAll(Collection<?> c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean addAll(Collection<? extends E> c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean addAll(int index, Collection<? extends E> c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean removeAll(Collection<?> c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean retainAll(Collection<?> c) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public void clear(Node headNode) {
//		headNode=null;
//		System.gc();
//	}
//
//	@Override
//	public E get(int index) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public E set(int index, E element) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void add(int index, E element) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public E remove(int index) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int indexOf(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int lastIndexOf(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public ListIterator<E> listIterator() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ListIterator<E> listIterator(int index) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<E> subList(int fromIndex, int toIndex) {
//		// TODO Auto-generated method stub
//		return null;
//	}

 
}
