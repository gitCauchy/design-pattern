package com.cauchy.create.builder;

/**
 * @author Cauchy
 * @ClassName Terrain.java
 * @Date 2019年11月29日
 * @Description 地形，构成很复杂，由墙壁，碉堡，地雷表示
 * @Version
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
