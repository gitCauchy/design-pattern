package com.cauchy.behavior.observer;

/**
 * @author Cauchy
 * @ClassName SleepEvent.java
 * @Date 2019年11月30日
 * @Description 婴儿睡觉事件
 * @Version
 */
public class SleepEvent extends Event {

    /**
     * 时间
     */
    long timestamp;
    /**
     * 位置
     */
    String loc;
    /**
     * 事件源
     */
    Child source;

    public SleepEvent(long timestamp, String loc, Child source) {
        super();
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
    }

    @Override
    Object getSource() {

        return source;
    }


}
