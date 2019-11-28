package com.cauchy.create.prototype.v1;

public class Location {
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
	
}
