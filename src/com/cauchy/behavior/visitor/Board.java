package com.cauchy.behavior.visitor;
/**
 * 
 * @author Cauchy
 * @ClassName Board.java
 * @Date 2019Äê11ÔÂ30ÈÕ
 * @Description TODO
 * @Version 
 *
 */
public class Board extends ComputerPart {

	void accept(Visitor v) {
		v.visitBoard(this);
		
	}

	double getPrice() {
		
		return 300;
	}


}
