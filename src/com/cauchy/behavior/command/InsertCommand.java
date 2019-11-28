package com.cauchy.behavior.command;

public class InsertCommand extends Command {
	Content c;
	String strToInsert = "word";

	public InsertCommand(Content c) {
		super();
		this.c = c;
	}

	@Override
	public void doit() {
		c.msg = c.msg + strToInsert;

	}

	@Override
	public void undo() {
		c.msg = c.msg.substring(0,c.msg.length() - strToInsert.length());
	}

}
