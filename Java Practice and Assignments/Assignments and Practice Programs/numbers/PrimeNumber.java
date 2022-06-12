package numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static int prime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("Not a Prime number");
				return 0;
			}
		}
		System.out.println("Prime");
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();

		prime(n);
	}

}
