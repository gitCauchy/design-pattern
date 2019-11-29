package com.cauchy.create.singleton;

/**
 * 
 * @author Cauchy
 * @ClassName Singleton04.java
 * @Date 2019年11月29日
 * @Description 改进的懒汉式，通过减小同步代码块的方式提高效率,但是实际上并没有解决问题
 * 				例如，当线程thread1 进行到label的位置，时间片用完，thread2执行进入
 * 				if 子块判断INSTANCE == NULL 进入同步块，完成实例创建。这样就造成了
 * 				线程不安全问题。
 * @Version 
 *
 */
public class Singleton04 {
	private static Singleton04 INSTANCE;

	private Singleton04() {
	}

	private static Singleton04 getInstance() {
		if (INSTANCE == null) {
			// label
			synchronized (Singleton04.class) {
				INSTANCE = new Singleton04();
			}
		}
		return INSTANCE;
	}
}
