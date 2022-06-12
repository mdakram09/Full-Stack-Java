package coding_ninjas_assignment_practice;

import java.util.Scanner;

public class sumOfEvenNumbersTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the last number");
		int n=s.nextInt();
		int sum=0;
		for(int i=0; i<=n; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("Sum is "+sum);
	}

}
