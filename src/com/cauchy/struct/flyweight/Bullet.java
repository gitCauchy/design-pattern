package com.cauchy.struct.flyweight;

import java.util.UUID;
/**
 * 
 * @author Cauchy
 * @ClassName Bullet.java
 * @Date 2019��11��30��
 * @Description ��Ԫģʽ-ʵ����-�ӵ�
 * @Version 
 *
 */
public class Bullet {
	public UUID id = UUID.randomUUID();
	boolean living = true;

	public String toString() {
		return "Bullet [id=" + id + "]";
	}
}
