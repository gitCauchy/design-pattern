package com.cauchy.behavior.templatemethod;

public class Main {
	
	public static void main(String[] args) {
		Father c1 = new C1();
		Father c2 = new C2();
		c1.op1();
		c2.op2();
	}
}
