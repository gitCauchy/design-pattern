package com.cauchy.behavior.observer;
/**
 * 
 * @author Cauchy
 * @ClassName Dad.java
 * @Date 2019��11��30��
 * @Description �۲���-����
 * @Version 
 *
 */
public class Dad implements Observer {
	public void feed() {
		System.out.println("dad feeding...");
	}
	
	public void keepSilence() {
		System.out.println("dad keep silence...");
	}

	public void actionOnWakeUp(WakeUpEvent event) {
		feed();
	}

	public void actionOnSleep(SleepEvent event) {
		keepSilence();
	}
}
