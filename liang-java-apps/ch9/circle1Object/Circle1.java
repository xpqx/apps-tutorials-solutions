package liang.ch9.circle1Object;

public class Circle1 {
	
	double radius;
	
	public Circle1() {
		radius = 1;
	}
	
	public Circle1(double newRadius) {
		radius = newRadius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	
	

}
