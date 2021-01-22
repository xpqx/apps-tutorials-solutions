package schaums.HeapSort;

public class HeapSort {
	public static void heapSort(int[] a) {
		int n = a.length;
		for (int i = n/2 - 1; i >= 0; i--) {//begin for
			heapify(a, i, n);
		}//end for
		
		for (int i = n - 1; i > 0; i--) {
			swap(a, 0, i);
			heapify(a, 0, i);
		}
	}
	
	private static void heapify(int[] a, int i, int j) {
		int ai = a[i];
		while (2 * i + 1 < j) {
			int k = 2 * i + 1;
			if (k + 1 < j&& a[k+1] > a[k]) {
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
	
	public static void swap(int[] list, int i, int j) {
		if (i == j) {
			return;
		}
		int temp = list[j];
		list[j] = list[i];
		list[i] = temp;
	}
	
	public static void print(int[] list) {
		for (int lista : list) {
			System.out.printf("%s ", lista);
		}
		System.out.println();
	}
	
	
	}
	

