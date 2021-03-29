package selectionSort.schaums;

import java.util.Arrays;

public class SelectionSortTestDriver {
	public static void main(String[] args) {
		int[] array1 = {10, 9, 8, 33, -55, -6, 78, 88, -99, -67, 55, -100};
		System.out.print(Arrays.toString(array1));
		
		System.out.println("\n");
		
		long start = System.currentTimeMillis();
		SelectionSort.sort(array1);
		long stop = System.currentTimeMillis();
		long totalTime = stop - start;
		PrintSort.print(array1, " ");
		System.out.print(totalTime + " in milliseconds ");
	}

}

/*
[10, 9, 8, 33, -55, -6, 78, 88, -99, -67, 55, -100]

-100 -99 -67 -55 -6 8 9 10 33 55 78 88 
2 in milliseconds 

*/