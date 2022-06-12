package class_and_objects;

import java.util.Scanner;

public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Student s1 = new Student();
		s1.name=s.nextLine();
		s1.rollNumber=s.nextInt();
		
		System.out.println(s1.name);
		System.out.println(s1.rollNumber);
		
		
		Student s2=new Student();
		s2.name="Akram Khan";
		s2.rollNumber=5;
		s2.setSalary(10000);
		
		System.out.println(s2.getSalary());
		
	}

}
