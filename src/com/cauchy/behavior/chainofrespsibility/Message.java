package com.cauchy.behavior.chainofrespsibility;

/**
 * 
 * @author Cauchy
 * @ClassName Message.java
 * @Date 2019��11��30��
 * @Description ��Ϣ�࣬���ģʽ�������ǣ���̳��վ���������еĲ��Ϸ��ʻ㣬��ͬ�Ĵʻ�ʹ�ò�ͬ�Ĺ�������
 * @Version
 *
 */
public class Message {
	String name;
	String msg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return "Message [ msg=" + msg + "]";
	}
	
	public static void main(String[] args) {
		Message msg = new Message();
		msg.setMsg("��Һ�:)<script>��ӭ���ʣ���Ҷ���996");
		FilterChain fc = new FilterChain();
		fc.add(new HtmlFilter());
		fc.add(new SensitiveFilter());
		FilterChain fc2 = new FilterChain();
		fc2.add(new FaceFilter());
		fc.add(fc2);
		fc.doFilter(msg);
		System.out.println(msg);
	}

}
