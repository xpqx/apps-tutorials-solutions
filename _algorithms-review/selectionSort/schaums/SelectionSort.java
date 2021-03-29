package selectionSort.schaums;

public class SelectionSort {
	public static void sort(int[] a) {
		for (int i = a.length - 1; i > 0; i--) {
			int m = 0;
			for (int j = 1; j<= i; j++) {
				if (a[j] > a[m]) {
					m = j;//assign the index value of j, to m
				}
			}
			SwapSort.swap(a, i, m);
		}
	}

}
