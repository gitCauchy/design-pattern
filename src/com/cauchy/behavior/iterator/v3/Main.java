package com.cauchy.behavior.iterator.v3;

public class Main {
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
