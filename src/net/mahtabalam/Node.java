package net.mahtabalam;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Node {
	String name;
	ArrayList<Node> children = new ArrayList<Node>();

	public Node(String name) {
		this.name = name;
	}

	public Node addChild(String name) {
		Node child = new Node(name);
		children.add(child);
		return this;
	}

	public List<String> breadthFirstSearch(List<String> array) {
		ArrayDeque<Node> queue = new ArrayDeque<Node>();
		queue.add(this);
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			array.add(node.name);
			for (Node child : node.children) {
				queue.add(child);
			}
		}
		return array;
	}
}
