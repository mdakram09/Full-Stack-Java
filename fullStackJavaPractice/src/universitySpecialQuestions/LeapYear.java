package universitySpecialQuestions;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the year");
		int year=s.nextInt();
		
		if(year%400==0 || year%4==0) {
			System.out.println("Leap Year");
		}
		else if(year%100==0) {
			System.out.println("Not Leap Year");
		}
		else {
			System.out.println("Not Leap Year");
		}
		
	}

}
