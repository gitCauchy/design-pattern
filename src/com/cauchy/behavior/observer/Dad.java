package com.cauchy.behavior.observer;

/**
 * @author Cauchy
 * @ClassName Dad.java
 * @Date 2019年11月30日
 * @Description 观察者-父亲
 * @Version
 */
public class Dad implements Observer {
    public void feed() {
        System.out.println("dad feeding...");
    }

    public void keepSilence() {
        System.out.println("dad keep silence...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        feed();
    }

    @Override
    public void actionOnSleep(SleepEvent event) {
        keepSilence();
    }
}
