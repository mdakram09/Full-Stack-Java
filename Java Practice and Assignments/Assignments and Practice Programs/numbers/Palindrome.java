package numbers;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int temp=n;
		int rev=0;
		while(n>0) {
			int x = n%10;
			rev=rev*10+x;
			n=n/10;
		}
		
		if(rev==temp) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not Palindrome");
		}
	}

}
