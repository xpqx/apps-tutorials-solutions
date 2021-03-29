package ch7.arrays;

import java.util.Arrays;

public class SelectionSortTest {
	public static void main(String[] args) {
		int[] myArray = {1000, 4, 6, 2, 1, 9, 18, 16};
		System.out.println("Before sorting...");
		System.out.println(Arrays.toString(myArray));
		SelectionSort.selectionSort(myArray);
		System.out.println("After sorting...");
		System.out.println(Arrays.toString(myArray));

	}

}
