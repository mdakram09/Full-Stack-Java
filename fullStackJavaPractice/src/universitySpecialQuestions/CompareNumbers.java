package universitySpecialQuestions;

import java.util.Scanner;

public class CompareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		
		if(a>b) {
			System.out.println("First number is bigger");
		}
		else if(a==b) {
			System.out.println("Both the numbers are equal");
		}
		else {
			System.out.println("Second number is bigger");
		}
	}

}
