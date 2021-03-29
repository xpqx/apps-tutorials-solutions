package bubbleSort;

import java.util.Arrays;

public class BubbleSortTestHarness {
	public static void main(String[] args) {
		int[] array = {100, 99, 44, 3, 55, 6, 7, 88, 99, -67};

		int[] array1 = {10, 9, 8, 33, -55, -6, 78, 88, -99, -67, 55, -100};

		System.out.println("Before Classic Bubble Sort:");
		System.out.println(Arrays.toString(array));

		ClassicBubbleSort.bubbleSort(array);
		System.out.println("After Classic Bubble Sort:");
		System.out.println(Arrays.toString(array));


		System.out.println("Before Enhanced Bubble Sort:");
		System.out.println(Arrays.toString(array1));

		EnhancedBubbleSort.bubbleSort(array1);
		System.out.println("After Enhanced Bubble Sort:");
		System.out.println(Arrays.toString(array1));






	}




}

