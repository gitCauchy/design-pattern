package com.cauchy.behavior.chainofrespsibility;

/**
 *
 * @author Cauchy
 * @ClassName Filter.java
 * @Date 2019年11月30日
 * @Description TODO
 * @Version 过滤器接口
 *
 */
public interface Filter {

    boolean doFilter(Message message);
}
