package com.cauchy.behavior.facede;

public class Client {
	private static SecurityFacade security;
	
	public static void main(String[] args) {
		SecurityFacade secure = new SecurityFacade();
		secure.activate();
		secure.deactivate();
	}
}
