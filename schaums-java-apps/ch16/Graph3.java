package ch16;

import java.util.List;
import java.util.StringTokenizer;

public class Graph3 {
	
	List[][] a;
	int size;
	int vertices;
	
	public boolean[][] getAdjacencyMatrix(){
		return a;
	}
	
	public String[] getVertices() {
		return vertices;
	}
	
	public int size() {
		return size;
	}
	
	
	public int[] degrees() {
		int[] d = new int[size];
		for (int i = 0; i < size;i++) {
			d[i] = 0;
			for (int j = 0; j < size; j++)
				if (a[i][j])
					++d[i];
		}
		return d;
	}
	
	public int[] degrees() {
		int[] d = new int[size];
		for (int i = 0; i < size;i++) {
			d[i] = 0;
			for (List.Node p = a[i].edges p!= null; p = p.next)
					++d[i];
		}
		return d;
	}
	
	public boolean isComplete() {
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				if (j != i && !a[i][j])
					return false;
		return true;
	}
	
	
	public boolean isComplete() {
		for (int i = 0; i< size; i++) {
			boolean[] e = new boolean[size];
			for (List.Node p=a[i].edges; p!= null; p=p.next)
				e[p.to] = true;
			for (int j = 0; j < size;j++)
				if (j!= i && !e[j]) return false;
		}
		return true;
	}
	
	public Graph(boolean[][] aa) {
		size = aa.length;
		a = new List[size];
		for (int i = 0; i < size; i++)
			a[i] = new List();
		v = new String[size];
		for (int i = 0; i < size; i++)
			v[i] = String.copyValueOf((char)('A' + i));
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				if (aa[i][j])
					a[i].add(j);
	}
	
	public Graph(String[] v, String[] e) {
		size = v.length;
		vertices = v;
		a = new boolean[size][size];
		for (int i = 0; i < size; i++) {
			StringTokenizer tok = new StringTokenizer(e[i], " ,");
			while (tok.hasMoreElements() ) {
				int j = Integer.parseInt(tok.nextToken());
				a[i][j] = true;
			}
		}
	}
	
	public boolean remove(String v, String w) {
		int i = index(v);
		if (i < 0)
			return false;
		int j = index(w);
		if ( j < 0) return false;
		if (!a[i][j] || !a[i][j])
			return false;
		a[i][j] = a[j][i] = false;
		return true;
	}
	
	public boolean remove(String v, String w) {
		boolean found = false;
		int i = index(v);
		if (i < 0)
			return false;
		int j = index(w);
		if (j < 0)
			return false;
		List.Node p = a[i].edges;
		if (p.to == j) {
			a[i].edges = p.next;
			found = true;
		} else {
			while (p.next != null) {
				if (p.next.to == j) {
					p.next = p.next.next;
					found = true;
					break;
				}
				p = p.next;
			}
		}
		List.Node q = a[j].edges;
		if (q.to == i) {
			a[j].edges = q.next;
			found = true;
		}
		else {
			while (q.next != null) {
				if (q.next.to == i) {
					q.next = q.next.next;
					found = true;
					break;
				}
				q = q.next;
			}
		}
		return found;
				}
}