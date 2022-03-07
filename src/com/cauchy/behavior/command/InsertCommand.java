package com.cauchy.behavior.command;

/**
 * @author Cauchy
 * @ClassName InsertCommand.java
 * @Date 2019年11月30日
 * @Description 插入命令
 * @Version
 */
public class InsertCommand extends Command {

    Content c;
    String strToInsert;

    public InsertCommand(Content c, String strToInsert) {
        super();
        this.c = c;
        this.strToInsert = strToInsert;
    }

    @Override
    public void doit() {
        c.msg = c.msg + strToInsert;

    }

    @Override
    public void undo() {
        c.msg = c.msg.substring(0, c.msg.length() - strToInsert.length());
    }

}
