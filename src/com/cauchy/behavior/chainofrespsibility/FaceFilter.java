package com.cauchy.behavior.chainofrespsibility;

/**
 * 
 * @author Cauchy
 * @ClassName FaceFilter.java
 * @Date 2019年11月30日
 * @Description 将笑脸替换成哭脸
 * @Version
 *
 */
public class FaceFilter implements Filter {

	public boolean doFilter(Message message) {
		String str = message.getMsg();
		str = str.replace(":)", ":(");
		message.setMsg(str);
		return true;
	}
}
