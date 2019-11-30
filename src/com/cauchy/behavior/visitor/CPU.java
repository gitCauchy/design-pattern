package com.cauchy.behavior.visitor;
/**
 * 
 * @author Cauchy
 * @ClassName CPU.java
 * @Date 2019��11��30��
 * @Description TODO
 * @Version 
 *
 */
public class CPU extends ComputerPart{

	void accept(Visitor v) {
		v.visitCPU(this);
		
	}

	double getPrice() {
		return 300;
	}
	
}
