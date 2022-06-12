package coding_ninjas_assignment_practice;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=1,c;
		System.out.println("please enter the last number");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(a+" "+b);
		for(int i=3; i<=n; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}
