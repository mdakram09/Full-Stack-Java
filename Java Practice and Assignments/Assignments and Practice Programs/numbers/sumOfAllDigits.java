package numbers;

import java.util.Scanner;

public class sumOfAllDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the number");
		int n=s.nextInt();
		int sum=0;
		while(n>0) {
			int x = n%10;
			sum+=x;
			n=n/10;
		}
		System.out.println(sum);
	}

}
