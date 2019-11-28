package com.cauchy.behavior.observer;

public class Main2 {
	public static void main(String[] args) {
		Child child = new Child();
		while(!child.isCry()) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("observering");
		}
	}
}
