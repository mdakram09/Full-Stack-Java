package coding_ninjas_assignment_practice;

import java.util.Scanner;

public class PrimeTillN {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the last number");
		int n=s.nextInt();
		boolean temp=true;
		int k;
		
		
		for(k=2; k<=n; k++) {
			for(int i=2; i<=k; i++) {
				if(k%i==0) {
					temp=false;
				}
				else if(temp!=false) {
					System.out.println(k+" is prime");
				}
			}
			
		}
			
		
	}

}
