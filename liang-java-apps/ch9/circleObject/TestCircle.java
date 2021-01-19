package liang.ch9.circleObject;

public class TestCircle {
	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
		System.out.println("The number of objects created is " + circle1.numberOfObjects);
		System.out.println("\n");
		
		
		Circle circle2 = new Circle(25);
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
		System.out.println("The number of objects created is " + circle1.numberOfObjects);
		System.out.println("\n");
		
		Circle circle3 = new Circle(125);
		System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
		System.out.println("The number of objects created is " + circle1.numberOfObjects);
		System.out.println("\n");
		
		circle2.radius = 100;
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
		System.out.println("The circumference of the circle of radius: " + circle2.radius + " is " + circle2.getCircumference());
		System.out.println("The number of objects created is " + circle1.numberOfObjects);
		System.out.println("\n");
		
		Circle circle4 = new Circle(200);
		System.out.println("The number of objects created is " + circle1.numberOfObjects);
		System.out.println("\n");
	}

}
