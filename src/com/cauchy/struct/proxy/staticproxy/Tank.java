package com.cauchy.struct.proxy.staticproxy;

import java.util.Random;
/**
 * 
 * @author Cauchy
 * @ClassName Tank.java
 * @Date 2019��12��1��
 * @Description ̹��ʵ����
 * @Version 
 *
 */
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
		new TankLogProxy(new TankTimeProxy(new Tank())).move();
	}

}
