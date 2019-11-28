package com.cauchy.behavior.momento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<PeopleMemento> mementoList = new ArrayList<>();
	public void add(PeopleMemento peopleMemento) {
		this.mementoList.add(peopleMemento);
	}
	public PeopleMemento get(int index) {
		return this.mementoList.get(index);
	}
}
