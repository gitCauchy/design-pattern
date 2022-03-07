package com.cauchy.behavior.observer;

/**
 * @author Cauchy
 * @ClassName Mom.java
 * @Date 2019年11月30日
 * @Description 观察者父亲
 * @Version
 */
public class Mom implements Observer {
    public void hug() {
        System.out.println("mom hugging...");
    }

    public void keepSilence() {
        System.out.println("mom keep silence...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        hug();
    }

    @Override
    public void actionOnSleep(SleepEvent event) {
        keepSilence();
    }


}
