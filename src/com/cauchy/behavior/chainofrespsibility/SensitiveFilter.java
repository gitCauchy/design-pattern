package com.cauchy.behavior.chainofrespsibility;
/**
 * 
 * @author Cauchy
 * @ClassName SensitiveFilter.java
 * @Date 2019年11月30日
 * @Description 将敏感词做替换
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
