package mathematics;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int n1=s.nextInt();
		System.out.println("Enter the second number number");
		int n2=s.nextInt();
		System.out.println("Please enter you choice +, -, *, /");
		char c = s.next().charAt(0);
		
		switch(c) {
		case '+':
			System.out.println(n1+n2);
			break;
		
		case '-':
			System.out.println(n1-n2);
			break;
		case '*':
			System.out.println(n1*n2);
			break;
			
		case '/':
			if(n2==0) {
				System.out.println("Division not possible");
			}
			else {
				System.out.println(n1/n2);
			}
			break;
			
		default:
			System.out.println("Please enter correct choice");
			
		}
	}

}
