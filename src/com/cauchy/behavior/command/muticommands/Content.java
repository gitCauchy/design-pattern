package com.cauchy.behavior.command.muticommands;

/**
 * 
 * @author Cauchy
 * @ClassName Content.java
 * @Date 2019��11��30��
 * @Description ����������
 * @Version
 *
 */
public class Content {
	String msg;

	public Content(String msg) {
		super();
		this.msg = msg;
	}
	
	public String toString() {
		return "Content [msg=" + msg + "]";
	}

	public static void main(String[] args) {
		Content c = new Content("hello");
		String strToInsert = "word";
		CommandChain cc = new CommandChain();
		cc.add(new InsertCommand(c, strToInsert));
		cc.add(new DeleteCommand(c));
		cc.doit();
		System.out.println(c);
		cc.undo();
		System.out.println(c);
	}
}
