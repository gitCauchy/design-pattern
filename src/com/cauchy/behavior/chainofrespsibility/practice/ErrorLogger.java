package com.cauchy.behavior.chainofrespsibility.practice;

/**
 * ErrorLogger
 *
 * @author Cauchy
 * @date 2022/03/16 08:58
 **/
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error:: Logger:" + message);
    }
}
