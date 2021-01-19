package liang.ch9.circle1Object;

public class Circle1TestDriver {
	public static void main(String[] args) {
		
		Circle1 myCircle = new Circle1();
		
		System.out.printf("Print out the attributes of the Circle Type  area is: " + myCircle.getArea() + " radius is: " +  myCircle.radius );
		
		Circle1 myCircle2 = new Circle1(35);
		System.out.println("\n");
		System.out.printf("Print out the attributes of the Circle Type  area is: " + myCircle2.getArea() + " radius is: " +  myCircle2.radius );
		
		
		Circle1 myCircle3 = new Circle1(135);
		System.out.println("\n");
		System.out.printf("Print out the attributes of the Circle Type  area is: " + myCircle3.getArea() + " radius is: " +  myCircle3.radius );
		
		myCircle3.radius = 100;
		System.out.println("\n");
		System.out.printf("Print out the attributes of the Circle Type  area is: " + myCircle3.getArea() + " radius is: " +  myCircle3.radius );
		
	}

}
