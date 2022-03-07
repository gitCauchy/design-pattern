package com.cauchy.behavior.chainofrespsibility;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cauchy
 * @ClassName FilterChain.java
 * @Date 2019年11月30日
 * @Description 将这些过滤器串起来，组成链，这里关键的步骤在于让FilterChain也来实现Filter接口
 * 				这样就能让两个链连起来
 * @Version
 *
 */
public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();

    public void add(Filter filter) {
        filters.add(filter);
    }

    @Override
    public boolean doFilter(Message msg) {
        for (Filter f : filters) {
            if (!f.doFilter(msg)) {
                return false;
            }
        }
        return true;
    }
}
