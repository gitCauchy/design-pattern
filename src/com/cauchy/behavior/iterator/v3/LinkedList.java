package com.cauchy.behavior.iterator.v3;

public class LinkedList<E> implements Collection<E>{
	Node head = null;
	Node tail = null;
	private int size = 0;
	public void add(E o) {
		Node n = new Node(o);
		n.next = null;
		if(head == null) {
			head = n;
			tail = n;
		}
		tail.next = n;
		tail = n;
		size ++;
	}
	public int size() {
		return size;
	}
	private class Node{
		private E o ;
		Node next;
		public Node(E o) {
			this.o = o;
		}
	}
	@Override
	public Iterator iterator() {
		
		return new LinkedListIterator();
	}
	
	private class LinkedListIterator implements Iterator{
		Node pointer = head;
		
		public boolean hasNext() {
			
			if(pointer == null) {
				return false;
			}
			return true;
		}

		
		public E next() {
			E o = pointer.o;
			pointer = pointer.next;
			return o;
		}
		
	}
}
