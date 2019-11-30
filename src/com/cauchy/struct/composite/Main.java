package com.cauchy.struct.composite;

public class Main {
	public static void main(String[] args) {
		BranchNode root = new BranchNode("root");
		BranchNode chapter1 = new BranchNode("chapter1");
		BranchNode chapter2 = new BranchNode("chapter2");
		Node c11 = new LeftNode("c11");
		Node c12 = new LeftNode("c12");
		BranchNode b21 = new BranchNode("b21");
		Node c211 = new LeftNode("c211");
		Node c212 = new LeftNode("c212");
		root.add(chapter1);
		root.add(chapter2);
		chapter1.add(c11);
		chapter1.add(c12);
		chapter2.add(b21);
		b21.add(c211);
		b21.add(c212);
		tree(root,0);
	}
	/**
	 * µÝ¹é´òÓ¡Ê÷
	 * @param b
	 * @param depth
	 */
	static void tree(Node b,int depth) {
		for(int i = 0 ;i < depth; i ++) {
			System.out.print("--");
		}
		b.printName();
		if(b instanceof BranchNode) {
			for(Node n : ((BranchNode)b).nodes) {
				tree(n,depth + 1);
			}
		}
	}
}
