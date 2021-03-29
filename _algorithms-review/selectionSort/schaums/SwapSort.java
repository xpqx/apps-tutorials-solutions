package selectionSort.schaums;

public class SwapSort {
	public static void swap(int[] a, int i, int j) {
		if ( i == j) {
			return;
		}
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}

}
