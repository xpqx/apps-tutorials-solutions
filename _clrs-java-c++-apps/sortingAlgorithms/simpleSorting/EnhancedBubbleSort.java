package sortingAlgorithms.simpleSorting;

public class EnhancedBubbleSort {

	final static int SIZE = 11;
	static int[] a = new int[SIZE];

	public static void bubbleSort(int[] a) {

		boolean needNextPass = true;
		for (int i = 1; i < a.length && needNextPass; i++) {
			needNextPass = false;
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					needNextPass = true;
				}
			}
		}
	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}
