package numbers;
import java.util.*;
public class reverseOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int rev=0;
		while(n>0) {
			int x = n%10;
			rev=rev*10+x;
			n=n/10;
		}
		System.out.println(rev);
	}
	}


