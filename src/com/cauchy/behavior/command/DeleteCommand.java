package com.cauchy.behavior.command;

/**
 * @author Cauchy
 * @ClassName DeleteCommand.java
 * @Date 2019年11月30日
 * @Description 练习-删除命令
 * @Version
 */
public class DeleteCommand extends Command {
    Content c;
    /**
     * 临时保存被删除的内容
     */
    String temp;


    public DeleteCommand(Content c) {
        super();
        this.c = c;
    }

    @Override
    public void doit() {
        temp = c.msg;
        c.msg = "";
    }

    @Override
    public void undo() {
        c.msg = temp;
    }
}
