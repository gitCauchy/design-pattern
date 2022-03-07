package com.cauchy.struct.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cauchy
 * @ClassName BranchNode.java
 * @Date 2019年11月30日
 * @Description 枝节点
 * @Version
 */
public class BranchNode extends Node {

    String name;

    List<Node> nodes = new ArrayList<>();

    public BranchNode(String name) {
        super();
        this.name = name;
    }

    public void add(Node node) {
        nodes.add(node);
    }

    @Override
    public void printName() {
        System.out.println(name);
    }

}
