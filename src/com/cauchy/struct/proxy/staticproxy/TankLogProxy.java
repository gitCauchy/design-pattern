package com.cauchy.struct.proxy.staticproxy;
/**
 * 
 * @author Cauchy
 * @ClassName TankLogProxy.java
 * @Date 2019��12��1��
 * @Description TODO
 * @Version ��־����
 *
 */
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
