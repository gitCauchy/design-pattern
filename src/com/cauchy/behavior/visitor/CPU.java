package com.cauchy.behavior.visitor;

public class CPU extends ComputerPart{

	@Override
	void accept(Visitor v) {
		v.visitCPU(this);
		
	}

	@Override
	double getPrice() {
		
		return 300;
	}
	
}
