package com.cauchy.create.singleton;

public class Singleton06 {
	private Singleton06() {
	}

	private static class Singleton06Holder {
		private final static Singleton06 INSTANCE = new Singleton06();
	}

	public static Singleton06 getInstance() {
		return Singleton06Holder.INSTANCE;
	}
}
