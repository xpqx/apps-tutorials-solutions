package sortingAlgorithms.simpleSorting;

public class SelectionSort {
	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int currentMin = a[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (currentMin > a[j]) {
					currentMin = a[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				a[currentMinIndex] = a[i];
				a[i] = currentMin;
			}
		}
	}
	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

}
