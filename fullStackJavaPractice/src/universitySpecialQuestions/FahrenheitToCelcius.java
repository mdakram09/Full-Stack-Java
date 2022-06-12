package universitySpecialQuestions;

import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the fahrenheit temperature");
		float f=s.nextFloat();
		
		float c=((f-32)/9)*5;
		
		System.out.println("Celcius: "+c);
		
		
	}

}
