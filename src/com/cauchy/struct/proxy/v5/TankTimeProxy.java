package com.cauchy.struct.proxy.v5;

public class TankTimeProxy implements Movable{
	Movable m ;
	
	public TankTimeProxy(Movable m) {
		super();
		this.m = m;
	}

	public void move() {
		long start = System.currentTimeMillis();
		m.move();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
