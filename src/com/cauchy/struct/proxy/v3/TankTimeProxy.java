package com.cauchy.struct.proxy.v3;

public class TankTimeProxy implements Movable{
	Tank tank = new Tank();
	public void move() {
		long start = System.currentTimeMillis();
		tank.move();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
