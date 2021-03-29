package heapSort.schaums;

public class HeapSort {
	public static void sort(int[] a) {
		
		int n = a.length;
		for (int i = n/2 - 1; i >= 0; i--) {
			heapify(a, i, n);
		}
		for (int i = n - 1; i > 0; i--) {
			swap(a, 0, i);
			heapify(a, 0, i);
		}
		
	}
	
	private static void heapify(int[] a, int i, int j) {
		int ai = a[i];
		while (2* i+1 < j) {
			int k = 2*i + 1;
			if (k + 1 < j && a[k+1] > a[k]) {
				++k;
			}
			if (ai >= a[k]) {
				break;
			}
			a[i] = a[k];
			i = k;
		}
		a[i] = ai;
	}
}
