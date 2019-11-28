package com.cauchy.behavior.chainofrespsibility;

public class Message {
	String name;
	String msg;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Message [ msg=" + msg + "]";
	}
	
}
