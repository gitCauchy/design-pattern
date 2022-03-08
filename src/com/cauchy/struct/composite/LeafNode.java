package com.cauchy.struct.composite;

/**
 * @author Cauchy
 * @ClassName LeafNode.java
 * @Date 2019年11月30日
 * @Description 叶子节点
 * @Version
 */
public class LeafNode extends Node {
    String content;

    public LeafNode(String content) {
        this.content = content;
    }

    @Override
    public void printName() {
        System.out.println(content);
    }

}
