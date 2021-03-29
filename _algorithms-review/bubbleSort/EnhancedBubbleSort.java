package bubbleSort;

public class EnhancedBubbleSort {
	public static void bubbleSort(int[] array) {
		boolean needNextPass = true;//next pass needed
		for (int i = 1; i < array.length && needNextPass; i++) {
			needNextPass = false;//next pass not needed
			for( int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
					needNextPass = true;//next pass is needed
				}

			}
		}
	}

}
