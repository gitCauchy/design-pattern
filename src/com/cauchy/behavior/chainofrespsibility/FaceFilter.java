package com.cauchy.behavior.chainofrespsibility;

/**
 * 
 * @author Cauchy
 * @ClassName FaceFilter.java
 * @Date 2019��11��30��
 * @Description ��Ц���滻�ɿ���
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
