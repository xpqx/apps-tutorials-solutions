package ch3.pascals;

import java.util.Scanner;

public class PascalsTriangle {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String input1 = input.next();
		
		int rows = Integer.parseInt(input1);
		int[][] a = init(rows);
		print(a);
	}
	static int[][] init(int m) {
		int[][] a = new int[m][];
		for (int i = 0; i < m; i++)
			a[i] = new int[i+1];
		for (int i = 0; i < m; i++)
			for (int j = 0; j <= i; j++)
				if (j == 0 || j == i) a[i][j] = 1;
				else a[i][j] = a[i-1][j-1] + a[i-1][j];
		return a;
	}
	static void print(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++)
				print(a[i][j],5);
			System.out.println();
		}
	}
	static void print(int n, int w) {
		// prints n right-justified in a field on width w:
		String s = "" + n, blanks = " ";
		int len = s.length();
		System.out.print(blanks.substring(0, w-len) + s);
	}
}