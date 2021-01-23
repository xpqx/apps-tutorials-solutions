package ch9_v2;

public class Circle2TestDriver {
	public static void main(String[] args) {
		Circle2 myCircle = new Circle2();
		
		System.out.println(myCircle.getRadius() + " " + myCircle.getArea() + " " + (myCircle.getRadius() * 1.1));
		
		System.out.println(Circle2.getNumberOfObjects() + " number of objects created");
		
	}

}
