package ch3.list;

public abstract class StringList {
	
	protected String[] list;
	protected int numItems;
	protected int currentPos;
	
	public StringList(int maxItems) {
		numItems = 0;
		list = new String[maxItems];
	}
	
	public boolean isFull() {
		return (list.length == numItems);
	}
	
	public int lengthIs() {
		return numItems;
	}
	
	public boolean isThere(String item) {
		int compareResult;
		int midPoint;
		int first = 0;
		int last = numItems - 1;
		boolean moreToSearch = (first <= last);
		boolean found = false;
		
		while (moreToSearch && !found){
			midPoint = (first + last)/2;
			compareResult = item.compareTo(list[midPoint]);
			
			if (compareResult == 0)
				found = true;
			else if (compareResult < 0) {
				last = midPoint - 1;
				moreToSearch = (first<= last);
			} else {
				first = midPoint + 1;
				moreToSearch = (first <= last);
			}
		}
		return found;
	}
	
	
	public void insert(String item) {
		int location = 0;
		boolean moreToSearch = (location < numItems);
		while (moreToSearch) {
			if (item.compareTo(list[location]) < 0)
				moreToSearch = false;
			else
				location++;
			moreToSearch = (location < numItems);
		}
		for (int index = numItems; index > location; index--)
			list[index] = list[index - 1];
		list[location] = new String(item);
		numItems++;
	}
	
	
	public void delete(String item) {
		int location = 0;
		while (item.compareTo(list[location]) != 0)
			location++;
		for (int index = location + 1; index < numItems; index++)
			list[index - 1] = list[index];
		numItems--;
	}
	
	
	public void reset() {
		currentPos = 0;
	}
	
	public String getNextItem() {
		String next = list[currentPos];
		if (currentPos == numItems - 1)
			currentPos = 0;
		else
			currentPos++;
		return new String(next);
	}
}
