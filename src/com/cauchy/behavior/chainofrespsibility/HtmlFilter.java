package com.cauchy.behavior.chainofrespsibility;
/**
 * 
 * @author Cauchy
 * @ClassName HtmlFilter.java
 * @Date 2019��11��30��
 * @Description TODO
 * @Version ����Html��ǩ����<�滻Ϊ[ ��> �滻Ϊ]
 *
 */
public class HtmlFilter implements Filter{

	public boolean doFilter(Message message) {
		String str = message.getMsg();
		str = str.replace('<', '[');
		str = str.replace('>', ']');
		message.setMsg(str);
		return true;
	}
}
