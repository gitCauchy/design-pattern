package com.cauchy.struct.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("c:/test.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
		}
		br.close();
	}
}
