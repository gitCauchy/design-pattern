package com.cauchy.behavior.chainofrespsibility;
/**
 * 
 * @author Cauchy
 * @ClassName SensitiveFilter.java
 * @Date 2019��11��30��
 * @Description �����д����滻
 * @Version 
 *
 */
public class SensitiveFilter implements Filter{

	public boolean doFilter(Message message) {
		String str = message.getMsg();
		str = str.replace("996", "995");
		message.setMsg(str);
		return true;
	}
}
