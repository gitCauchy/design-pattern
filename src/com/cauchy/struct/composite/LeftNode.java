package com.cauchy.struct.composite;
/**
 * 
 * @author Cauchy
 * @ClassName LeftNode.java
 * @Date 2019��11��30��
 * @Description Ҷ�ӽڵ�
 * @Version 
 *
 */
public class LeftNode extends Node {
	String content;
	
	public LeftNode(String content) {
		super();
		this.content = content;
	}

	public void printName() {
		System.out.println(content);
	}

}
