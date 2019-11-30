package com.cauchy.behavior.command.muticommands;
/**
 * 
 * @author Cauchy
 * @ClassName InsertCommand.java
 * @Date 2019��11��30��
 * @Description ��������
 * @Version 
 *
 */
public class InsertCommand extends Command {
	
	Content c;
	String strToInsert;

	public InsertCommand(Content c , String strToInsert) {
		super();
		this.c = c;
		this.strToInsert = strToInsert;
	}

	public void doit() {
		c.msg = c.msg + strToInsert;
		
	}

	public void undo() {
		c.msg = c.msg.substring(0,c.msg.length() - strToInsert.length());
	}

}
