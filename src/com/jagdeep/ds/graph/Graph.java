package com.jagdeep.ds.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Graph<T> {
	private class QueueNode {
		GraphNode graphNode;
		int level;

		public QueueNode(GraphNode node, int level) {
			this.graphNode = node;
			this.level = level;
		}
	}

	private class GraphNode {
		T nodeId;
		GraphNode next;
		int parentDist;

		GraphNode(T id) {
			nodeId = id;
			next = null;
		}

		GraphNode(T id, int dist) {
			nodeId = id;
			next = null;
			parentDist = dist;
		}
	}

	ArrayList<GraphNode> nodeList;

	public Graph() {
		nodeList = new ArrayList<GraphNode>();
	}

	private void addNode(T id) {
		GraphNode node = new GraphNode(id);
		nodeList.add(node);
	}

	private void addEdge(T id1, T id2, int dist) {
		int i = 0;

		for (i = 0; i < nodeList.size(); i++) {
			if (nodeList.get(i).nodeId == id1) {
				break;
			}
		}

		if (i == nodeList.size()) {
			return;
		}

		GraphNode node1 = nodeList.get(i);
		GraphNode node2 = new GraphNode(id2, dist);

		node2.next = node1.next;
		node1.next = node2;
	}

	private GraphNode findGraphNode(T nodeId) {
		for (int i = 0; i < nodeList.size(); i++) {
			if (nodeList.get(i).nodeId == nodeId) {
				return nodeList.get(i);
			}
		}

		return null;
	}

	public void printGraph() {
		for (int i = 0; i < nodeList.size(); i++) {
			GraphNode curr = nodeList.get(i);

			while (curr != null) {
				System.out.print(curr.nodeId + "(" + curr.parentDist + ")"
						+ "->");
				curr = curr.next;
			}
			System.out.print("Null");
			System.out.println();
		}
	}

	public boolean breadthFirstSearch(T srcId, T destId) {
		if (nodeList.isEmpty()) {
			System.out.println("Empty graph");
			return false;
		}

		LinkedList<QueueNode> queue = new LinkedList();

		HashMap<T, Integer> visited = new HashMap();

		GraphNode srcNode = null;
		for (int i = 0; i < nodeList.size(); i++) {
			if (nodeList.get(i).nodeId == srcId) {
				srcNode = nodeList.get(i);
				break;
			}
		}

		if (srcNode == null) {
			System.out.println("Source vertex not found");
			return false;
		}
		boolean destNodeFound = false;

		int maxLevelVisited = -1;

		queue.add(new QueueNode(srcNode, 0));
		visited.put(srcNode.nodeId, 1);

		while (!queue.isEmpty()) {
			QueueNode currentNode = queue.remove();

			if (currentNode.level > maxLevelVisited) {
				System.out.print("\nlevel " + currentNode.level + "-");
				maxLevelVisited = currentNode.level;
			}

			System.out.print(currentNode.graphNode.nodeId + "  ");
			if (currentNode.graphNode.nodeId == destId) {
				destNodeFound = true;
			}

			GraphNode neighbor = currentNode.graphNode.next;

			while (neighbor != null) {

				if (visited.get(neighbor.nodeId) == null) {
					visited.put(neighbor.nodeId, 1);
					queue.add(new QueueNode(findGraphNode(neighbor.nodeId),
							currentNode.level + 1));
				}
				neighbor = neighbor.next;
			}
		}

		return destNodeFound;
	}

	@SuppressWarnings("unchecked")
	public static void createGraph(Graph graph) {
		graph.addNode(0);
		graph.addNode(1);
		graph.addNode(2);
		graph.addNode(3);
		graph.addNode(4);
		graph.addNode(5);

		graph.addEdge(0, 1, 2);
		graph.addEdge(0, 2, 4);

		graph.addEdge(1, 2, 4);
		graph.addEdge(1, 3, 5);
		graph.addEdge(1, 4, 3);

		graph.addEdge(3, 5, 1);
		graph.addEdge(4, 5, 1);
	}

	public static void main(String[] args) {
		Graph<Integer> graph = new Graph();

		createGraph(graph);

		int srcNodeId = 0, destNodeId = 5;

		graph.printGraph();
		
		System.out
				.print("\n\nIf path exists between source and destination node:\n"
						+ graph.breadthFirstSearch(srcNodeId, destNodeId));
	}
}
