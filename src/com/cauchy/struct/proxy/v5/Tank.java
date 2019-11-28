package com.cauchy.struct.proxy.v5;

import java.util.Random;

public class Tank implements Movable {

	public void move() {
		System.out.println("Tank moving.....");
		try {
			Thread.sleep(new Random().nextInt(1000));
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
