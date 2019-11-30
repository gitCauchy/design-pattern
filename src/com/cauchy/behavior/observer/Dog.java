package com.cauchy.behavior.observer;
/**
 * 
 * @author Cauchy
 * @ClassName Dog.java
 * @Date 2019年11月30日
 * @Description 观察者小狗
 * @Version 
 *
 */
public class Dog implements Observer{
	public void bark() {
		System.out.println("dog barking...");
	}
	
	public void keepSilence() {
		System.out.println("dog keep silence...");
	}

	public void actionOnWakeUp(WakeUpEvent event) {
		bark();
	}

	public void actionOnSleep(SleepEvent event) {
		keepSilence();
	}
}
