package sortingAlgorithms.simpleSorting;

public class SelectionSortTestDriver {
	public static void main(String[] args) {
		int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12, -1000};
		SelectionSort.selectionSort(list);
		SelectionSort.print(list);
	}
}