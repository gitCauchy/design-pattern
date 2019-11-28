package com.cauchy.behavior.chainofrespsibility;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
	List<Filter> filters = new ArrayList<>();
	public void add(Filter filter) {
		filters.add(filter);
	}
	public boolean doFilter(Message msg) {
		for(Filter f : filters) {
			if(!f.doFilter(msg)) {
				return false;
			}
		}
		return true;
	}
}
