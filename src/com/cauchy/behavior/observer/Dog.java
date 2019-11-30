package com.cauchy.behavior.observer;
/**
 * 
 * @author Cauchy
 * @ClassName Dog.java
 * @Date 2019��11��30��
 * @Description �۲���С��
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
