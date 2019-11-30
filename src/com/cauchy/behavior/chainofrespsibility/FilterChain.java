package com.cauchy.behavior.chainofrespsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Cauchy
 * @ClassName FilterChain.java
 * @Date 2019��11��30��
 * @Description ����Щ�������������������������ؼ��Ĳ���������FilterChainҲ��ʵ��Filter�ӿ�
 * 				����������������������
 * @Version
 *
 */
public class FilterChain implements Filter {
	List<Filter> filters = new ArrayList<>();

	public void add(Filter filter) {
		filters.add(filter);
	}

	public boolean doFilter(Message msg) {
		for (Filter f : filters) {
			if (!f.doFilter(msg)) {
				return false;
			}
		}
		return true;
	}
}
