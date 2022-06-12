package constructor;

import java.util.Scanner;

public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Student s1 = new Student("Akram");
		Student s2 = new Student("Khan",55,5);
		
		s1.print();
		s2.print();
	}

}
