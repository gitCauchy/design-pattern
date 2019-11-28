package com.cauchy.behavior.visitor;

public abstract class ComputerPart {
	abstract void accept(Visitor v);
	// some other operations 
	abstract double getPrice();
}
