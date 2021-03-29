package ch7.arrays;

public class SelectionSort {
	public static void selectionSort(int[] array){
		for( int outer = 0; outer < array.length - 1; outer++) {
			int currentMinimum = array[outer];
			int currentMinimumIndex = outer;

			for (int inner = outer + 1; inner < array.length; inner++){
				if (currentMinimum > array[inner]){
					currentMinimum = array[inner];
					currentMinimumIndex = inner;
				}
			}

			if (currentMinimumIndex != outer){
				array[currentMinimumIndex] = array[outer];
				array[outer] = currentMinimum;
			}
		}
	}
}