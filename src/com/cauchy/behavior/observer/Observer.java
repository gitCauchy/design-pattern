package com.cauchy.behavior.observer;

/**
 * 
 * @author Cauchy
 * @ClassName Observer.java
 * @Date 2019��11��30��
 * @Description �۲��߽ӿ�
 * @Version
 *
 */
public interface Observer {

	void actionOnWakeUp(WakeUpEvent event);
	
	void actionOnSleep(SleepEvent event);
}
