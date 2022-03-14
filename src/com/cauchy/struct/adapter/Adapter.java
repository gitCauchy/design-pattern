package com.cauchy.struct.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author Cauchy
 * @ClassName Adapter.java
 * @Date 2019年12月1日
 * @Description 适配器模式，当一个类不能直接访问另一个类，需要添加一个转换器来达到目的。
 * @Version
 */
public class Adapter {

    public static final String FILE = "";

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(FILE);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
        }
        br.close();
    }
}
