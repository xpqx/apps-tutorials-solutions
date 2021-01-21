package ch13.mst.graphs;



public class MSTApp {

	public static void main(String[] args) {


		Graph theGraph = new Graph();
		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('E');

		theGraph.addEdge(0, 1);
		theGraph.addEdge(0, 2);
		theGraph.addEdge(0, 3);
		theGraph.addEdge(0, 4);
		theGraph.addEdge(1, 2);
		theGraph.addEdge(1, 3);
		theGraph.addEdge(1, 4);
		theGraph.addEdge(2, 3);
		theGraph.addEdge(2, 4);
		theGraph.addEdge(3, 4);

		System.out.print("Minimum Spanning Tree Prints: ");
		theGraph.mst();
		System.out.println();
	}
}
