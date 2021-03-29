package selectionSort.liang;

import java.util.Arrays;

import bubbleSort.EnhancedBubbleSort;

public class SelectionSortTestHarness {
	public static void main(String[] args) {
		int[] array = {100, 99, 44, 3, 55, 6, 7, 88, 99, -67};

		int[] array1 = {10, 9, 8, 33, -55, -6, 78, 88, -99, -67, 55, -100};

		System.out.println("Before Enhanced Bubble Sort:");
		System.out.println(Arrays.toString(array));
        long start = System.currentTimeMillis();
        EnhancedBubbleSort.bubbleSort(array);
        long stop = System.currentTimeMillis();
        long totalTime = stop - start;
		System.out.println("After Enhanced Bubble Sort:");
		System.out.println(Arrays.toString(array));
		System.out.println(totalTime + " in milliseconds ");

		System.out.println("Before Selection Sort:");
		
		System.out.println(Arrays.toString(array1));
		
        
        long start1 = System.currentTimeMillis();
        SelectionSort.selectionSort(array1);
        long stop1 = System.currentTimeMillis();
        long totalTime1 = stop1 - start1;
        System.out.println("After Selection Sort:");
		System.out.println(Arrays.toString(array1));
		System.out.println(totalTime1 + " in milliseconds ");
		
		
	}

}
