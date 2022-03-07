package com.cauchy.behavior.observer;

/**
 * @author Cauchy
 * @ClassName Mom.java
 * @Date 2019��11��30��
 * @Description �۲��߸���
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
