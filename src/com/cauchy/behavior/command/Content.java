package com.cauchy.behavior.command;

/**
 * @author Cauchy
 * @ClassName Content.java
 * @Date 2019年11月30日
 * @Description 命令处理的内容
 * @Version
 */
public class Content {
    String msg;

    public Content(String msg) {
        super();
        this.msg = msg;
    }


    @Override
    public String toString() {
        return "Content [msg=" + msg + "]";
    }


    public static void main(String[] args) {
        Content c = new Content("hello");
        String strToInsert = "word";
        InsertCommand insert = new InsertCommand(c, strToInsert);
        insert.doit();
        System.out.println(c);
        insert.undo();
        System.out.println(c);
        DeleteCommand delete = new DeleteCommand(c);
        delete.doit();
        System.out.println(c);
        delete.undo();
        System.out.println(c);
    }
}
