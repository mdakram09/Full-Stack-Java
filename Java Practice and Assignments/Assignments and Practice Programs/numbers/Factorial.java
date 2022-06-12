package numbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		
		int fact=1;
		int i=1;
		while(i<=n) {
			fact*=i;
			i++;
		}
		System.out.println("Factorial = "+fact);
	}

}
