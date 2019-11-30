package com.cauchy.struct.composite;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Cauchy
 * @ClassName BranchNode.java
 * @Date 2019��11��30��
 * @Description ֦�ڵ�
 * @Version 
 *
 */
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
	
	public void printName() {
		System.out.println(name);
	}

}
