package com.cauchy.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cauchy
 * @ClassName Child.java
 * @Date 2019年11月30日
 * @Description 样例通过小孩哭闹这一事件，三个观察者分别检测到这一事件并做出反应来演示这个模式
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
