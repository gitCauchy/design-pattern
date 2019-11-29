package com.cauchy.create.prototype.deepclone;
/**
 * 
 * @author Cauchy
 * @ClassName Location.java
 * @Date 2019��11��29��
 * @Description ���¡��Location��Person�����һ����Ա��������Person��¡ʱ��LocationҲӦ��ʵ��cloneable�ӿ�
 * @Version 
 *
 */
public class Location implements Cloneable{
	/*
	 * String ���Ͳ���Ҫ�������¡��String��ָ���ĳ����أ��޸�����shʱ������ı�bj
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
