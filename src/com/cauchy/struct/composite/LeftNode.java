package com.cauchy.struct.composite;

/**
 * @author Cauchy
 * @ClassName LeftNode.java
 * @Date 2019年11月30日
 * @Description 叶子节点
 * @Version
 */
public class LeftNode extends Node {
    String content;

    public LeftNode(String content) {
        super();
        this.content = content;
    }

    @Override
    public void printName() {
        System.out.println(content);
    }

}
