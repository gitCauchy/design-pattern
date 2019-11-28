package com.cauchy.create.builder;

public class Main {
	public static void main(String[] args) {
		TerrainBuilder builder = new ComplexTerrainBuilder();
		Terrain t = builder.buildFort().buildMine().buildWall().build();
	}
}
