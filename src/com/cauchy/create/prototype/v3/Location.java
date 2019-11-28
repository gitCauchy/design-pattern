package com.cauchy.create.prototype.v3;

public class Location implements Cloneable{
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
	/**
	 * String ���Ͳ���Ҫ�������¡��String��ָ���ĳ����أ��޸�����shʱ������ı�bj
	 */
}
