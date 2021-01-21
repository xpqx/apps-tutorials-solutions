package ch13.bfs.graph;

import ch13.graphs.Graph;

public class BFSApp {
	public static void main(String[] args) {
		Graph theGraph = new Graph();
		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('E');
		
		theGraph.addEdge(0, 1);
		theGraph.addEdge(1, 2);
		theGraph.addEdge(0, 3);
		theGraph.addEdge(3, 4);
		
		
		System.out.println("Breadth First Search Visits: ");
		System.out.print("Visits: ");
		theGraph.dfs();
		System.out.println();
	}

}
