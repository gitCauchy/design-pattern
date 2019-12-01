package com.cauchy.struct.proxy.staticproxy;
/**
 * 
 * @author Cauchy
 * @ClassName TankTimeProxy.java
 * @Date 2019��12��1��
 * @Description ����ʱ�����
 * @Version 
 *
 */
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
