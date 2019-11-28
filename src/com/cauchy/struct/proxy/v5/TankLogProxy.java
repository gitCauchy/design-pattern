package com.cauchy.struct.proxy.v5;

public class TankLogProxy implements Movable{
	Movable m;
	
	public TankLogProxy(Movable m) {
		super();
		this.m = m;
	}

	public void move() {
		System.out.println("Tank begin to move");
		m.move();
		System.out.println("Tank end to move");
	}

}
