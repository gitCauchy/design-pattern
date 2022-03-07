package com.cauchy.create.builder;

/**
 * @author Cauchy
 * @ClassName ComplexTerrainBuilder.java
 * @Date 2019年11月29日
 * @Description 复杂地形构造器
 * @Version
 */
public class ComplexTerrainBuilder implements TerrainBuilder {

    Terrain terrain = new Terrain();

    @Override
    public TerrainBuilder buildWall() {
        terrain.w = new Wall(10, 10, 10, 10);
        return this;
    }

    @Override
    public TerrainBuilder buildFort() {
        terrain.f = new Fort(10, 10, 10, 10);
        return this;
    }

    @Override
    public TerrainBuilder buildMine() {
        terrain.m = new Mine(10, 10, 10, 10);
        return this;
    }

    @Override
    public Terrain build() {
        return terrain;
    }

}
