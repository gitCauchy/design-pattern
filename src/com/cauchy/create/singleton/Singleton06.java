package com.cauchy.create.singleton;

/**
 * 
 * @author Cauchy
 * @ClassName Singleton06.java
 * @Date 2019年11月29日
 * @Description 懒汉式内部类的实现方式，加载Singleton06时，并不加载内部类，解决了资源消耗的问题
 * 				调用get方法时，加载内部类，创建实例。线程安全问题由Jvm来负责，保证内存中只有一个
 * 				Singleton06Holder对象。
 * @Version 
 *
 */
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
