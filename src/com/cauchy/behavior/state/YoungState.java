package com.cauchy.behavior.state;
/**
 * 
 * @author Cauchy
 * @ClassName YoungState.java
 * @Date 2019年11月30日
 * @Description 年轻状态的表现
 * @Version 
 *
 */
public class YoungState extends PersonState {
	void eat() {
		System.out.println("eat much");
	}

	void drink() {
		System.out.println("drink much");
	}

	void sleep() {
		System.out.println("sleep much");
	}
}
