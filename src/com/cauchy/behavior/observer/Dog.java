package com.cauchy.behavior.observer;

/**
 * @author Cauchy
 * @ClassName Dog.java
 * @Date 2019年11月30日
 * @Description 观察者小狗
 * @Version
 */
public class Dog implements Observer {
    public void bark() {
        System.out.println("dog barking...");
    }

    public void keepSilence() {
        System.out.println("dog keep silence...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        bark();
    }

    @Override
    public void actionOnSleep(SleepEvent event) {
        keepSilence();
    }
}
