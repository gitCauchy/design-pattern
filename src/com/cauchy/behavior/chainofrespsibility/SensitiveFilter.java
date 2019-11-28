package com.cauchy.behavior.chainofrespsibility;

public class SensitiveFilter implements Filter{

	@Override
	public boolean doFilter(Message message) {
		String str = message.getMsg();
		str = str.replace("996", "995");
		message.setMsg(str);
		return true;
	}
}
