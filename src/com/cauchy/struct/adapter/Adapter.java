package com.cauchy.struct.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author Cauchy
 * @ClassName Adapter.java
 * @Date 2019��12��1��
 * @Description ������ģʽ����һ���಻��ֱ�ӷ�����һ���࣬��Ҫ���һ��ת�������ﵽĿ�ġ�
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
