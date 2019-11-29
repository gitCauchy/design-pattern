package com.cauchy.create.prototype.shadowclone;
/**
 * 
 * @author Cauchy
 * @ClassName Location.java
 * @Date 2019��11��29��
 * @Description ��ַ�࣬����Ҫ��¡����Ҫʵ��Cloneable�ӿڣ���д��¡������
 * @Version 
 *
 */
public class Location {
	/*
	 * ����
	 */
	String street;
	/*
	 * �������
	 */
	int roomNo;

	public Location(String street, int roomNo) {
		super();
		this.street = street;
		this.roomNo = roomNo;
	}

	public String toString() {
		return "Location [street=" + street + ", roomNo=" + roomNo + "]";
	}

}
