package com.cauchy.struct.composite;

public class LeftNode extends Node {
	String content;
	
	public LeftNode(String content) {
		super();
		this.content = content;
	}

	public void p() {
		System.out.println(content);
	}

}
