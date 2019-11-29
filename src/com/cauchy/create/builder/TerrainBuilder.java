package com.cauchy.create.builder;
/**
 * 
 * @author Cauchy
 * @ClassName TerrainBuilder.java
 * @Date 2019��11��29��
 * @Description ���εĹ�����
 * @Version 
 *
 */
public interface TerrainBuilder {
	/*
	 * ��������������������δTerrainBuilder ��ԭ����Ϊ�˷����������ʽ���
	 */
	TerrainBuilder buildWall();
	TerrainBuilder buildFort();
	TerrainBuilder buildMine();
	/**
	 * 
	 * @return ���ζ���
	 */
	Terrain build();
}
