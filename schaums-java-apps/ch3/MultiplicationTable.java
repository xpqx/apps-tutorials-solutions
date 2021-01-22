package ch3;

public class MultiplicationTable {
	public static void main(String[] args) {
		int rows = Integer.parseInt(args[0]);
		int[][] a = init(rows);
		print(a);
	}
	
	public static int[][] init(int n) {
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = (i+1)*(j+1);
		return a;
	}
	
	public static void print(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++)
				print(a[i][j],5);
			System.out.println();
		}
	}
	
	public static void print(int n, int w) {
		// prints n right-justified in a field on width w:
		String s = "" + n, blanks = " ";
		int len = s.length();
		System.out.print(blanks.substring(0, w-len) + s);
	}
}