package numbers;

import java.util.Scanner;
import java.lang.Math;


public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int temp=n;
		int sum=0;
		while(n>0) {
			int x=n%10;
			sum+=Math.pow(x, 3);
			n=n/10;
		}
		
		if(sum==temp) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}

}
