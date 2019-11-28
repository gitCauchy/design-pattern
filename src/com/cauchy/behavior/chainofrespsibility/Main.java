package com.cauchy.behavior.chainofrespsibility;

public class Main {
	public static void main(String[] args) {
		Message msg = new Message();
		msg.setMsg("大家好:)<script>欢迎访问，大家都是996");
		FilterChain fc = new FilterChain();
		fc.add(new HtmlFilter());
		fc.add(new SensitiveFilter());
//		fc.doFilter(msg);
		FilterChain fc2 = new FilterChain();
		fc2.add(new FaceFilter());
		fc.add(fc2);
		fc.doFilter(msg);
		System.out.println(msg);
	}
}
