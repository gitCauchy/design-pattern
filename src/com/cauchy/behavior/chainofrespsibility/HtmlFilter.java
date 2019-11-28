package com.cauchy.behavior.chainofrespsibility;

public class HtmlFilter implements Filter{

	@Override
	public boolean doFilter(Message message) {
		String str = message.getMsg();
		str = str.replace('<', '[');
		str = str.replace('>', ']');
		message.setMsg(str);
		return true;
	}
}
