package coding_ninjas_assignment_practice;

import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the character");
		char c = s.next().charAt(0);
		
		if(c>='A' && c<='Z') {
			System.out.println(1);
		}
		else if(c>='a' && c<='z') {
			System.out.println(0);
		}
		else {
			System.out.println(-1);
		}
	}

}
