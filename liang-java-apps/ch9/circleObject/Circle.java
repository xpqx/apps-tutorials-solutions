package liang.ch9.circleObject;

public class Circle {
	double radius;
	static int numberOfObjects;
	
	public Circle(){
		radius = 1;
		numberOfObjects++;
		
	}
	
	public Circle(double newRadius){
		radius = newRadius;
		numberOfObjects++;
		
	}
	
	
	public static int getnumberOfObjects(){
		return numberOfObjects++;
	}
	
	double getArea() {
		return radius * radius * Math.PI;
	}
	
	double getCircumference() {
		return 2 * radius * Math.PI;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}

}
