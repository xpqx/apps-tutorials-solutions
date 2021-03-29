package ch11.hashTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashTableApp {
	public static void main(String[] args) throws IOException {

		DataItem aDataItem;
		int aKey = 0;
		int size;
		int n;
		int keysPerCell;

		System.out.print("Enter the size of hash table: ");
		size = getInt();
		System.out.print("Enter the initial number of items: ");
		n = getInt();
		keysPerCell = 10;

		HashTable aHashTable = new HashTable(size);

		for (int j = 0; j < n; j++)
			aKey = (int)(Math.random() * keysPerCell * size);
			aDataItem = new DataItem(aKey);
			aHashTable.insert(aDataItem);

		while(true) {
			System.out.print("Enter first letter of SHOW, INSERT, DELETE or FIND");
			char choice = getChar();
			switch (choice) {
			case 's':
				aHashTable.displayTable();
				break;
			case 'i':
				System.out.print("Enter key value to insert");
				aKey = getInt();
				aDataItem = new DataItem(aKey);
				aHashTable.insert(aDataItem);
				break;
			case 'd':
				System.out.print("Enter key value to delete");
				aKey = getInt();
				aHashTable.delete(aKey);
				break;
			case 'f':
				System.out.print("Enter key value to find: ");
				aKey = getInt();
				aDataItem = aHashTable.find(aKey);
				if (aDataItem != null) {
					System.out.println("Found " + aKey);
				} else {
					System.out.println("Not Found " + aKey);
					break;

				}
			default:
				System.out.print("Invalid entry\n");

			}
		}

	}
	
	
	public static char getChar() throws IOException{
		String s = getString();
		return s.charAt(0);
	}
	
	public static int getInt() throws IOException{
		String s = getString();
		return Integer.parseInt(s);
	}
	
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

}
