package com.cauchy.create.builder;

public interface TerrainBuilder {
	TerrainBuilder buildWall();
	TerrainBuilder buildFort();
	TerrainBuilder buildMine();
	Terrain build();
}
