package universitySpecialQuestions;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the grade");
		char grade=s.next().charAt(0);
		
		switch(grade) {
		
		case 'A':
			System.out.println("Excellent");
			break;
			
		case 'B':
			System.out.println("Very Good");
			break;
			
		case 'C':
			System.out.println("Good");
			break;
			
		default:
			System.out.println("Failed");
		}
	}

}
