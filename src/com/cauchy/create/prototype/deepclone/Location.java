package com.cauchy.create.prototype.deepclone;
/**
 * 
 * @author Cauchy
 * @ClassName Location.java
 * @Date 2019年11月29日
 * @Description 深克隆，Location是Person对象的一个成员变量，当Person克隆时，Location也应该实现cloneable接口
 * @Version 
 *
 */
public class Location implements Cloneable{
	/*
	 * String 类型不需要进行深克隆，String是指定的常量池，修改其中sh时，不会改变bj
	 */
	String street;
	int roomNo;
	public Location(String street, int roomNo) {
		super();
		this.street = street;
		this.roomNo = roomNo;
	}
	@Override
	public String toString() {
		return "Location [street=" + street + ", roomNo=" + roomNo + "]";
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
