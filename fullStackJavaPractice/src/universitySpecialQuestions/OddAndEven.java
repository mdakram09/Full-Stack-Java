package universitySpecialQuestions;

import java.util.Scanner;

public class OddAndEven {
	
	public static boolean oddEven(int n) {
		if(n%2==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		
		System.out.println((oddEven(n)));
		
	}

}
