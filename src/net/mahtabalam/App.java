package net.mahtabalam;

import java.util.ArrayList;
import java.util.List;

class App {
	public static void main(String[] args) {

		Node tree1 = new Node("A");
		tree1.addChild("B").addChild("C").addChild("D").addChild("E");
		tree1.children.get(1).addChild("F");

		List<String> bfs1 = new ArrayList<String>();
		tree1.breadthFirstSearch(bfs1);
		System.out.println("BFS 1 :" + bfs1);

		Node tree2 = new Node("A");
		tree2.addChild("B");
		tree2.children.get(0).addChild("C");
		tree2.children.get(0).children.get(0).addChild("D").addChild("E");
		tree2.children.get(0).children.get(0).children.get(0).addChild("F");
		List<String> bfs2 = new ArrayList<String>();
		tree2.breadthFirstSearch(bfs2);
		System.out.println("BFS 2 :" + bfs2);
	}
}
