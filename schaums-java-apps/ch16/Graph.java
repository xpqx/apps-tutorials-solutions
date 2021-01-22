package ch16;


public class Graph{
	private int size;
	private int vertices;



	public Graph(String[] args) {

		size = args.length;
		vertices = new String[size];
		for (int i = 0; i < size; i++) {
			String ai = args[i];
			int j = i;
			while ( j> 0 && vertices[j-1].compareTo(ai)>0) {
				vertices[j] = vertices[j-1];
				--j;
			}
			vertices[j] = ai;
		}
		a = new boolean[size][size];

	}

	private int index(String v) {
		int p = 0; q = size;
		while (p < q) {
			int i = (p + q)/2;
			if (vertices[i].equals(v)) return i;
			if (vertices[i].compareTo(v) < 0) p = i;
			else q = i;
		}
		if (vertices[p].equals(v)) return p;
		return a.length;
	}
}