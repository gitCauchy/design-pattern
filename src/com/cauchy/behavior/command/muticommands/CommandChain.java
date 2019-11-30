package com.cauchy.behavior.command.muticommands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Cauchy
 * @ClassName CommandChain.java
 * @Date 2019年11月30日
 * @Description TODO
 * @Version 和责任链结合实现命令模式
 *
 */
public class CommandChain extends Command {

	List<Command> commands = new ArrayList<Command>();

	public void add(Command command) {
		commands.add(command);
	}

	public void doit() {
		for (Command c : commands) {
			c.doit();
		}
	}

	public void undo() {
		Collections.reverse(commands);
		for (Command c : commands) {
			c.undo();
		}
	}
}
