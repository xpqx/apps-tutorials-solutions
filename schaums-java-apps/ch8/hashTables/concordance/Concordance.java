package ch8.hashTables.concordance;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;

import ch8.hashTables.Map;

public class Concordance {
	private Map map = (Map) new HashMap<String,String>();

	public Concordance(String file) {
		int lineNumber = 0;
		try {
			Scanner input = new Scanner(new File(file));
			while (input.hasNextLine()) {
				String line = input.nextLine();
				++lineNumber;
				StringTokenizer parser = new StringTokenizer(line, ",.;:()-!?' ");
				while (parser.hasMoreTokens()) {
					String word = parser.nextToken().toUpperCase();
					String listing = (String) map.get(word);
					if (listing == null) {
						listing = "" + lineNumber;
					} else {
						listing += ", " + lineNumber;
					}
					map.put(word,listing);
				}
			}
			input.close();
		} catch(IOException e) {
			System.out.println(e);
		}
	}

	public void write(String file) {
		try {
			PrintWriter output = new PrintWriter(file);
			for (Entry<String,String> entry : ((HashMap<String, String>) map).entrySet()) {
				output.println(entry);
			}
			output.close();
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}