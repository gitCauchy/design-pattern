package com.cauchy.behavior.iterator;
/**
 * 
 * @author Cauchy
 * @ClassName LinkedList.java
 * @Date 2019��11��30��
 * @Description TODO
 * @Version �����߼������ڵ�Ԫ�أ��������ϲ������ڣ�ɾ���Ͳ����ٶȸ��졣
 *
 */
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
	public static void main(String[] args) {
		Collection list = new LinkedList();
		for(int i = 0 ; i < 15; i ++) {
			list.add(new String("s" + i));
		}
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}
}
