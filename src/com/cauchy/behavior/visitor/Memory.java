package com.cauchy.behavior.visitor;

public class Memory extends ComputerPart {

	@Override
	void accept(Visitor v) {
		v.visitMemory(this);
		
	}

	@Override
	double getPrice() {
		
		return 300;
	}

}
