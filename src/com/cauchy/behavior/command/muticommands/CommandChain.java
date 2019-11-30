package com.cauchy.behavior.command.muticommands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Cauchy
 * @ClassName CommandChain.java
 * @Date 2019��11��30��
 * @Description TODO
 * @Version �����������ʵ������ģʽ
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
