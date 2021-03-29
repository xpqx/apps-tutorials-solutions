package ch3.simpleSorting;

public class ArraySelectionSortTestHarness {
	public static void main(String[] args) {
		int maxSize = 100;
		ArraySelectionSort myArray = new ArraySelectionSort(maxSize);
		
		myArray.insert(1000);
		myArray.insert(77);
		myArray.insert(99);
		myArray.insert(44);
		myArray.insert(55);
		myArray.insert(22);
		myArray.insert(88);
		myArray.insert(11);
		myArray.insert(00);
		myArray.insert(66);
		myArray.insert(33);
		myArray.insert(10);
		myArray.insert(05);
		myArray.insert(-1000);
		
		System.out.println("Array before Selection Sort:");
		myArray.display();
		System.out.println("Array after Selection Sort:");
		myArray.selectionSort();
		myArray.display();
	}

}
