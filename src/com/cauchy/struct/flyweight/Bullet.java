package com.cauchy.struct.flyweight;

import java.util.UUID;

public class Bullet {
	public UUID id = UUID.randomUUID();
	boolean living = true;
	@Override
	public String toString() {
		return "Bullet [id=" + id + "]";
	}
}
