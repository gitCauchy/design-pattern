package com.cauchy.behavior.observer;
/**
 * 
 * @author Cauchy
 * @ClassName SleepEvent.java
 * @Date 2019��11��30��
 * @Description Ӥ��˯���¼�
 * @Version 
 *
 */
public class SleepEvent extends Event {

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
	public SleepEvent(long timestamp, String loc, Child source) {
		super();
		this.timestamp = timestamp;
		this.loc = loc;
		this.source = source;
	}
	
	Object getSource() {
		
		return source;
	}
	

}
