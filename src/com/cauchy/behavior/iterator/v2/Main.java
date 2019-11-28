package com.cauchy.behavior.iterator.v2;

public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		for(int i = 0 ; i < 15 ; i ++) {
			list.add(new String("s" + i));
		}
		System.out.println(list.size());
	}
}
