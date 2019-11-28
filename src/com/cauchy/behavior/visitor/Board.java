package com.cauchy.behavior.visitor;

public class Board extends ComputerPart {

	@Override
	void accept(Visitor v) {
		v.visitBoard(this);
		
	}

	@Override
	double getPrice() {
		
		return 300;
	}


}
