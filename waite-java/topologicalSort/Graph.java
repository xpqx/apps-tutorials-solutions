package ch13.topologicalSort;

public class Graph {

	private final int MAX_VERTS = 20;
	private Vertex vertexList[];
	private int adjMat[][];
	private int nVertices;
	private char[] sortedArray;


	public Graph() {
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVertices = 0;
		for (int j = 0; j < MAX_VERTS; j++) {
			for (int k = 0; k < MAX_VERTS; k++) {
				adjMat[j][j] = 0;
				sortedArray = new char[MAX_VERTS];
			}
		}
	}

	public void addVertex(char lab) {
		vertexList[nVertices++] = new Vertex(lab);
	}

	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
	}

	public void displayVertex(int v) {
		System.out.print(vertexList[v].labelForVertices);
	}


	public void topo() {
		int current_nVertices = nVertices;

		while (current_nVertices > 0) {
			int currentVertex = noSuccessors();
			if (currentVertex == -1) {
				System.out.println("ERROR: Graph has cycles");
				return;
			}
			sortedArray[nVertices-1] = vertexList[currentVertex].labelForVertices;
			deleteVertex(currentVertex);
		}

		System.out.print("Topologically sorted order of vertices: ");
		for (int j = 0; j < current_nVertices; j++)
			System.out.println(sortedArray[j]);
		System.out.println("");

	}

	public int noSuccessors() {
		boolean isEdge;
		for (int row = 0; row < nVertices; row++) {
			isEdge = false;
			for (int col = 0; col<nVertices; col++) {
				if (adjMat[row][col] > 0) {
					isEdge = true;
					break;}
			}
			if (!isEdge)
				return row;
		}
		return 1;
	}

	public void deleteVertex(int delVert) {
		if (delVert != nVertices - 1) {
			for (int j = delVert; j < nVertices - 1; j++)
				vertexList[j] = vertexList[j+1];
			for (int row = delVert; row < nVertices - 1; row++)
				moveRowUp(row, nVertices);
			for (int col = delVert; col < nVertices - 1; col++)
				moveColLeft(col, nVertices - 1);
		}
		nVertices--;
	}

	private void moveRowUp(int row, int length) {
		for (int col = 0; col< length; col++)
			adjMat[row][col] = adjMat[row+1][col];
	}

	private void moveColLeft(int col, int length) {
		for (int row = 0; row < length; row++)
			adjMat[row][col] = adjMat[row][col+1];
	}

}

