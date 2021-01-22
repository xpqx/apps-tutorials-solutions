package schaums.HeapSort;

public class HeapSortTestDriver {
public static void main(String[] args) {
		
		String s1 = "Before invoking the Heap Sort algorithm:";
		String s2 = "After invoking the Heap Sort algorithm:";
		String s3 = "Heap Sort runs in O(nlgn) time!";
		
		int[] list = {325, 200, 225, 100, 44, 22, 66, 7, 99, -22, 4, 99, -100};
		System.out.println(s1);
		System.out.println();
		HeapSort.print(list);
		System.out.println();
		System.out.println(s2);
		System.out.println();
		HeapSort.heapSort(list);
		HeapSort.print(list);
		System.out.println();
		System.out.println(s3);
	}

}
