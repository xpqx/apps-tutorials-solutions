package insertionSort.schaums;

public class InsertionSort {
	public static void insertionSort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			int ai = list[i], j;
			for (j = i; j > 0 && list[j-1] > ai; j--) {
				list[j] = list[j-1];
			}
			list[j] = ai;
		}
	}

}
