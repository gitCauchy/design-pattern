package com.cauchy.behavior.observer;
/**
 * 
 * @author Cauchy
 * @ClassName WakeUpEvent.java
 * @Date 2019��11��30��
 * @Description С��˯�ѿ����¼�
 * @Version 
 *
 */
public class WakeUpEvent extends Event{
	/*
	 * ʱ��
	 */
	long timestamp;
	/*
	 * λ��
	 */
	String loc;
	/*
	 * �¼�Դ
	 */
	Child source;
	public WakeUpEvent(long timestamp, String loc,Child source) {
		super();
		this.timestamp = timestamp;
		this.loc = loc;
		this.source = source;
	}
	Child getSource() {
		return source;
	}
}
