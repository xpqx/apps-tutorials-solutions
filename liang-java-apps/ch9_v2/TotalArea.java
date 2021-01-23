package ch9_v2;


/*
 * Radius                        Area           
52.496420                     8657.833712    
38.853946                     4742.639752    
44.521001                     6227.012093    
81.821873                     21032.393957   
34.570846                     3754.653606    
------------------------------------------------------------------------
The total area of circles is  44414.533119   
 * 
 * 
 */


public class TotalArea {
	public static void main(String[] args) {
		Circle2[] myCircle;
		myCircle = createCircleArray();

		printCircleArray(myCircle);
	}

	public static Circle2[] createCircleArray() {

		Circle2[] circleArray = new Circle2[5];

		for (int i = 0; i < circleArray.length; i++) {
			circleArray[i] = new Circle2(Math.random() * 100);
		}

		return circleArray;
	}

	public static void printCircleArray(Circle2[] circleArray) {
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		for (int i = 0; i < circleArray.length; i++) {
			System.out.printf("%-30f%-15f\n",  circleArray[i].getRadius(), circleArray[i].getArea());
		}

		System.out.println("------------------------------------------------------------------------");

		System.out.printf("%-30s%-15f\n", "The total area of circles is", sum(circleArray));
	}

	public static double sum(Circle2[] circleArray) {
		double sum = 0;

		for (int i = 0; i < circleArray.length; i++)
			sum+= circleArray[i].getArea();
		return sum;
	}


}
