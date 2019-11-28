package com.cauchy.behavior.templatemethod;

abstract public class Father {
	void m() {
		op1();
		op2();
	}
	abstract void op1();
	abstract void op2();
}
