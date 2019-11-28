package com.cauchy.struct.composite;

import java.util.ArrayList;
import java.util.List;

public class BranchNode extends Node{
	String name;
	List<Node> nodes = new ArrayList<Node>();
	public BranchNode(String name) {
		super();
		this.name = name;
	}

	public void add(Node node) {
		nodes.add(node);
	}
	
	public void p() {
		System.out.println(name);
	}

}
