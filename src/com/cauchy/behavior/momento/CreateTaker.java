package com.cauchy.behavior.momento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 * @author Cauchy
 * @ClassName CreateTaker.java
 * @Date 2019��12��1��
 * @Description ����¼������
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
