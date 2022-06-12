package basic;
import java.util.Scanner;

public class swapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b = s.nextInt();
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("a= "+a+"b= "+b);
	}

}
