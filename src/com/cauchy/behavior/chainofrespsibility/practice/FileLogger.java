package com.cauchy.behavior.chainofrespsibility.practice;

/**
 * FileLogger
 *
 * @author Cauchy
 * @date 2022/03/16 08:59
 **/
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File:: Logger:" + message);
    }
}
