package ch16;

import java.util.List;

public class Graph2 {
	
	private int size;
	private List[] a;
	private String[] v;
	
	public Graph2(String[] args) {
		size = args.length;
		a = new List[size];
		for (int i = 0; i < size; i++)
			a[i] = new List();
		v = new String[size];
		System.arraycopy(args,  0,  v,  0,  size);
	}
	
	public void add(String v, String w) {
		a[index(v)].add(index(w));
		a[index(w)].add(index(v));
	}
	
	public String toString() {
		if (size == 0) return "{}";
		
		StringBuffer buf = new StringBuffer("{" + v[0] + ":" + a[0]);
		for (int i = 1; i < size; i++)
			buf.append("," + v[i] + ":" + a[i]);
		return buf + "}";
	}
	
	private int index(String vertex) {
		for (int i = 0; i < size;i++)
			if (vertex.contentEquals(v[i])) return i;
		return a.length;
	}
	
	private class List{
		String vertex;
		Node edges;
		
		public void add(int j) {
			edges = new Node(j, edges);
		}
		
		public String toString() {
			if (edges == null) return "";
			StringBuffer buf = new StringBuffer();
			for (Node p= edges; p != null; p = p.next)
				buf.append(Graph.this.v[p.to]);
				return buf.toString();
		}
		
		private class Node{
			int to;
			Node next;
			Node(int to, Node next){
				this.to = to;
				this.next = next;
			}
		}
	}
}
