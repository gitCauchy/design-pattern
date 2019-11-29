package com.cauchy.create.builder;
/**
 * 
 * @author Cauchy
 * @ClassName TerrainBuilder.java
 * @Date 2019年11月29日
 * @Description 地形的构建器
 * @Version 
 *
 */
public interface TerrainBuilder {
	/*
	 * 这里三个方法返回类型未TerrainBuilder 的原因是为了方便后续的链式编程
	 */
	TerrainBuilder buildWall();
	TerrainBuilder buildFort();
	TerrainBuilder buildMine();
	/**
	 * 
	 * @return 地形对象
	 */
	Terrain build();
}
