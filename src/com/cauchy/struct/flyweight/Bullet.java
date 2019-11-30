package com.cauchy.struct.flyweight;

import java.util.UUID;
/**
 * 
 * @author Cauchy
 * @ClassName Bullet.java
 * @Date 2019年11月30日
 * @Description 享元模式-实体类-子弹
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
