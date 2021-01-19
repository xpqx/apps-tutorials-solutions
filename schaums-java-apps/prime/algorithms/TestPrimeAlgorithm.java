package prime.algorithms;

import java.util.Random;

public class TestPrimeAlgorithm {
	public static void main(String[] args) {
		Random random = new Random();
		for(int i = 0; i < 100; i++) {
			int n = random.nextInt(Integer.MAX_VALUE);
			if (isPrime(n)) 
				System.out.print(n + " ");
		}
	}
	
	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		
		if (n < 4)
			return true;
		if (n% 2 == 0)
			return false;
		for (int d = 3; d * d <= n; d+=2)
			if (n% d == 0)
				return false;
		return true;
	}

}
