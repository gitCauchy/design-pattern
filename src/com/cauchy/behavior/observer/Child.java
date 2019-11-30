package com.cauchy.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Cauchy
 * @ClassName Child.java
 * @Date 2019��11��30��
 * @Description ����ͨ��С��������һ�¼��������۲��߷ֱ��⵽��һ�¼���������Ӧ����ʾ���ģʽ
 * @Version
 *
 */
public class Child {
	private boolean cry = false;
	private List<Observer> observers = new ArrayList<>();
	{
		observers.add(new Dad());
		observers.add(new Mom());
		observers.add(new Dog());
	}

	public boolean isCry() {
		return cry;
	}

	public void wakeUp() {
		System.out.println("Waked Up! Crying");
		cry = true;
		WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "bed", this);
		for (Observer o : observers) {
			o.actionOnWakeUp(event);
		}
	}
	
	public void sleep() {
		System.out.println("baby want to sleep");
		
		SleepEvent event = new SleepEvent(System.currentTimeMillis(), "bed", this);
		for (Observer o : observers) {
			o.actionOnSleep(event);
		}
	}
}
