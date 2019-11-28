package com.cauchy.struct.proxy.v2;

import java.util.Random;

public class Tank implements Movable {

	public void move() {
		long start = System.currentTimeMillis();
		System.out.println("Tank moving.....");
		try {
			Thread.sleep(new Random().nextInt(1000));
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	public static void main(String[] args) {
		new Tank().move();
	}

}
