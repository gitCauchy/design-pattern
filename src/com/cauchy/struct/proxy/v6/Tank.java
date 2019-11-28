package com.cauchy.struct.proxy.v6;

import java.lang.reflect.Proxy;
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
	public static void main(String[] args) {
		Tank tank = new Tank();
		Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(), 
				new Class[] {Movable.class}, 
				new LogHander(tank) );
		m.move();
	}

}
