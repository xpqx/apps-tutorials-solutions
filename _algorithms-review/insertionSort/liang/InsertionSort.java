package insertionSort.liang;

public class InsertionSort {
	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int currentElement = array[i];
			int currentElementIndex;
			for (currentElementIndex = i - 1; currentElementIndex >= 0 && array[currentElementIndex] > currentElement; currentElementIndex--) {
				array[currentElementIndex + 1 ] = array[currentElementIndex];
			}
			//insert the current element into array[currentElementIndex + 1]
			array[currentElementIndex + 1] = currentElement;
		}
	}

}
