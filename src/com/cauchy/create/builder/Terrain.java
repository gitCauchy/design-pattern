package com.cauchy.create.builder;

/**
 * 
 * @author Cauchy
 * @ClassName Terrain.java
 * @Date 2019��11��29��
 * @Description ���Σ����ɺܸ��ӣ���ǽ�ڣ��ﱤ�����ױ�ʾ
 * @Version
 *
 */
public class Terrain {
	Wall w;
	Fort f;
	Mine m;

	public static void main(String[] args) {
		TerrainBuilder builder = new ComplexTerrainBuilder();
		Terrain terrain = builder.buildFort().buildMine().buildWall().build();
	}
}
