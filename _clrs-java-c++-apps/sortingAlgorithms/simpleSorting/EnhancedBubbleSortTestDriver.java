package sortingAlgorithms.simpleSorting;

public class EnhancedBubbleSortTestDriver {
	public static void main(String[] args) {
		int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
		EnhancedBubbleSort.bubbleSort(list);
		EnhancedBubbleSort.print(list);
	}
}
