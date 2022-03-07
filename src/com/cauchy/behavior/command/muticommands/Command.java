package com.cauchy.behavior.command.muticommands;

/**
 * @author Cauchy
 * @ClassName Command.java
 * @Date 2019年11月30日
 * @Description 实现命令的执行与撤回的功能
 * @Version
 */
abstract public class Command {

    public abstract void doit();

    public abstract void undo();
}
