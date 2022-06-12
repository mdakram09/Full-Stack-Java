package numbers;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int sum=0;
		
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(n==sum) {
			System.out.println("Perfect");
		}
		else {
			System.out.println("Not Perfect");
		}
	}

}
