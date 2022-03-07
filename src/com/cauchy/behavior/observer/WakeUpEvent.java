package com.cauchy.behavior.observer;

/**
 * @author Cauchy
 * @ClassName WakeUpEvent.java
 * @Date 2019年11月30日
 * @Description 小孩睡醒哭闹事件
 * @Version
 */
public class WakeUpEvent extends Event {
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

    public WakeUpEvent(long timestamp, String loc, Child source) {
        super();
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
    }

    @Override
    Child getSource() {
        return source;
    }
}
