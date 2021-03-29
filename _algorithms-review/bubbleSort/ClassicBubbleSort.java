package bubbleSort;

public class ClassicBubbleSort {

	public static void bubbleSort(int[] array) {
		for (int i = 1; i < array.length; i++) {//outer loop to 
			for (int j = 0; j < array.length - i; j++) {//inner loop for the values
				if (array[j] > array[j + 1]) {//compare the array values
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;

				}
			}

		}
	}
}
