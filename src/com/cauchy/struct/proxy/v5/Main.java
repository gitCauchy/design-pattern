package com.cauchy.struct.proxy.v5;

public class Main {
	public static void main(String[] args) {
		new TankLogProxy(new TankTimeProxy(new Tank())).move();
	}
}
