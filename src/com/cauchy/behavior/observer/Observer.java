package com.cauchy.behavior.observer;

/**
 * @author Cauchy
 * @ClassName Observer.java
 * @Date 2019年11月30日
 * @Description 观察者接口
 * @Version
 */
public interface Observer {

    void actionOnWakeUp(WakeUpEvent event);

    void actionOnSleep(SleepEvent event);
}
