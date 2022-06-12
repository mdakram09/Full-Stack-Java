package numbers;

import java.util.Scanner;

public class SumOfAllIntegersDivisibleBy2Between2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int st=s.nextInt();
		System.out.println("Enter the last number");
		int en=s.nextInt();
		int sum=0;
		
		for(int i=st; i<=en; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("sum = "+sum);
	}

}
