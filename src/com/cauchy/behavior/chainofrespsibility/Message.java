package com.cauchy.behavior.chainofrespsibility;

/**
 * @author Cauchy
 * @ClassName Message.java
 * @Date 2019年11月30日
 * @Description 消息类，这个模式的例子是，论坛网站处理帖子中的不合法词汇，不同的词汇使用不同的过滤器。
 * @Version
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

    @Override
    public String toString() {
        return "Message [ msg=" + msg + "]";
    }

    public static void main(String[] args) {
        Message msg = new Message();
        msg.setMsg("大家好:)<script>欢迎访问，大家都是996");
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
