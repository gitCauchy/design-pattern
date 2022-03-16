package com.cauchy.behavior.chainofrespsibility.practice;

/**
 * consoleLogger
 *
 * @author Cauchy
 * @date 2022/03/16 08:55
 **/
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console:: Logger:" + message);
    }
}
