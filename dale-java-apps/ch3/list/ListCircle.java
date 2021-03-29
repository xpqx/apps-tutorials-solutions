package ch3.list;

public class ListCircle implements Listable {
	
	private int xvalue;
	private int yvalue;
	private float radius;
	private boolean solid;
	
	public ListCircle(int xvalue2, int yvalue2, float radius2, boolean solid2) {
		
	}

	public int compareTo(Listable otherCircle) {
		ListCircle other = (ListCircle)otherCircle;
		return (int)(this.radius - other.radius); 
	}
	
	public Listable copy() {
		ListCircle result = new ListCircle(this.xvalue, this.yvalue, this.radius, this.solid);
		return result;
	}

}
