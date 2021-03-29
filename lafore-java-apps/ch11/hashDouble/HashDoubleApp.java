package ch11.hashDouble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashDoubleApp {
	public static void main(String[] args) throws IOException {
		int aKey;
		DataItem aDataItem;
		int size;
		int n;
		
		System.out.print("Enter size of hash table: ");
		size = getInt();
		
		System.out.print("Enter initial number of items: ");
		n = getInt();
		
		HashTable aHashTable = new HashTable(size);
		
		for (int j = 0; j < n; j++) {
			aKey = (int)(Math.random() * 2 * size);
			aDataItem = new DataItem(aKey);
			aHashTable.insert(aKey, aDataItem);
		}
		
		while (true) {
			System.out.print("Enter first letter of ");
			System.out.print("show, insert, delete, or find: ");
			char choice = getChar();
			switch(choice) {
			case 's':
				aHashTable.displayTable();
				break;
			case 'i':
				System.out.print("Enter a key value to insert: ");
				aKey = getInt();
				aDataItem = new DataItem(aKey);
				aHashTable.insert(aKey, aDataItem);
				break;
			case 'd':
				System.out.print("Enter a key value to delete: ");
				aKey = getInt();
				aDataItem = new DataItem(aKey);
				aHashTable.delete(aKey);
				break;
			case 'f':
				System.out.print("Enter a key value to delete: ");
				aKey = getInt();
				aDataItem = aHashTable.find(aKey);
				if (aDataItem != null)
					System.out.println("Found " + aKey);
				else
					System.out.println("Could not find " + aKey);
				break;
			default:
				System.out.print("Invalid Entry\n");
				
			}
		}
	}
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	
	public static char getChar() throws IOException{
		String s = getString();
		return s.charAt(0);
	}
	
	public static int getInt() throws IOException{
		String s = getString();
		return Integer.parseInt(s);
	}
	
	
}