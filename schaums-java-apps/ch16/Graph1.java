package ch16;

import java.util.Arrays;

public class Graph1 {

	int vertices;
	int size;

	public boolean equals(Object object) {

		if (object == this) return true;
		if (!(object instanceof Graph)) return false;
		Graph that = (Graph)object;
		if (that.size != this.size) return false;
		String[] thisVertices = new String[size];
		System.arraycopy(this.vertices,  0,  thisVertices,  0,  size);
		Arrays.parallelSort(thisVertices);
		String[] thatVertices = new String[size];
		System.arraycopy(that.vertices, 0, thatVertices, 0, size);
		Arrays.sort(thatVertices);
		if (!(Arrays.deepEquals(thatVertices,  thisVertices))) return false;
		for (int i = 0; i < size; i++) {
			String vi = vertices[i];
			int i1 = this.index(vi);
			int i2 = that.index(vi);
			for (int j = 0; j < size;j++) {
				String vj = vertices[i];
				int j1 = this.index(vj);
				int j2 = this.index(vj);
				if (this.a[i1][j1] != that.a[i2][j2]) return false;
			}
		}

		return true;
	}

}
