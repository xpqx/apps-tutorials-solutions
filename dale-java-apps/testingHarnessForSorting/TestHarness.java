package testingHarnessForSorting;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;

public class TestHarness {
	
	static final int SIZE = 50;
	static int[] values = new int[SIZE];
	
	static void initValues() {
		Random rand = new Random();
		for (int index = 0; index < SIZE; index++)
			values[index] = Math.abs(rand.nextInt()) % 100;
	}
	
	static public boolean isSorted() {
		boolean sorted = true;
		for (int index = 0; index < (SIZE - 1); index++)
			if (values[index] > values[index + 1])
				sorted = false;
		return sorted;
	}
	
	static public void swap(int index1, int index2) {
		int temp = values[index1];
		values[index1] = values[index2];
		values[index2] = temp;
	}
	
	static public void printValues() {
		int value;
		DecimalFormat fmt = new DecimalFormat("00");
		System.out.println("The values array is: ");
		for (int index = 0; index < SIZE; index++) {
			value = values[index];
			if (((index + 1) % 10) == 0)
				System.out.println(fmt.format(value));
			else
				System.out.print(fmt.format(value) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException{
		initValues();
		printValues();
		System.out.println("values is sorted: " + isSorted());
		System.out.println();
		swap(0, 1);
		printValues();
		System.out.println("values is sorted: " + isSorted());
		System.out.println();
	}
	
	

}
