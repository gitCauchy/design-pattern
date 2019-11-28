package com.cauchy.struct.proxy.v4;

public class TankLogProxy implements Movable{
	Movable m;
	public void move() {
		System.out.println("Tank begin to move");
		//long start = System.currentTimeMillis();
		m.move();
		//long end = System.currentTimeMillis();
		//System.out.println(end - start);
		System.out.println("Tank end to move");
	}

}
