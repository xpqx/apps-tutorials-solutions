package insertionSort.liang;

import java.util.Arrays;

public class InsertionSortTestFile {
	public static void main(String[] args) {
System.out.println("Before Insertion Sort:");
		
		int[] array1 = {10, 9, 8, 33, -55, -6, 78, 88, -99, -67, 55, -100, 44, 33, 22, 11, 99, 999, 888, 899, 989, 56, -456, -888, -999};

		System.out.println(Arrays.toString(array1));
		
        
        long start1 = System.currentTimeMillis();
        InsertionSort.insertionSort(array1);
        long stop1 = System.currentTimeMillis();
        long totalTime1 = stop1 - start1;
        
        System.out.println("After Insertion Sort:");
		System.out.println(Arrays.toString(array1));
		System.out.println(totalTime1 + " in milliseconds ");
	}

}
