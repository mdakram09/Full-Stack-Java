package numbers;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of terms in fibonacci series");
		int n=s.nextInt();
		int a=0, b=1,c,count=2;
		System.out.println(a);
		System.out.println(b);
		while(count<n) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			count++;
		}
	}

}
