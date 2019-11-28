package com.cauchy.behavior.chainofrespsibility;

public class FaceFilter implements Filter{

	@Override
	public boolean doFilter(Message message) {
		String str = message.getMsg();
		str = str.replace(":)", ":(");
		message.setMsg(str);
		return true;
	}
}
