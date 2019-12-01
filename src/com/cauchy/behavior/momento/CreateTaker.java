package com.cauchy.behavior.momento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 * @author Cauchy
 * @ClassName CreateTaker.java
 * @Date 2019年12月1日
 * @Description 备忘录管理者
 * @Version 
 *
 */
public class CreateTaker {
	
	private Map<String,PeopleMemento> mementos = new HashMap<>();
	
	public void add(String index,PeopleMemento peopleMemento) {
		this.mementos.put(index,peopleMemento);
	}
	public PeopleMemento get(String index) {
		return this.mementos.get(index);
	}
}
