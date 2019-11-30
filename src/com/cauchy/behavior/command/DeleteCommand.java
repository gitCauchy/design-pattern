package com.cauchy.behavior.command;
/**
 * 
 * @author Cauchy
 * @ClassName DeleteCommand.java
 * @Date 2019��11��30��
 * @Description ��ϰ-ɾ������
 * @Version 
 *
 */
public class DeleteCommand extends Command {
	Content c;
	/*
	 * ��ʱ���汻ɾ��������
	 */
	String temp;

	
	public DeleteCommand(Content c) {
		super();
		this.c = c;
	}

	public void doit() {
		temp = c.msg;
		c.msg = "";
	}

	public void undo() {
		c.msg = temp;
	}
}
