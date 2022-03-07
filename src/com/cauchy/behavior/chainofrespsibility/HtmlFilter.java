package com.cauchy.behavior.chainofrespsibility;
/**
 *
 * @author Cauchy
 * @ClassName HtmlFilter.java
 * @Date 2019年11月30日
 * @Description 过滤Html标签，将<替换为[ ，> 替换为]
 * @Version
 *
 */
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
