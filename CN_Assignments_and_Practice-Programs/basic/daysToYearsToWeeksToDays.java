package basic;

import java.util.Scanner;

public class daysToYearsToWeeksToDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Days");
		int days = s.nextInt();
		
		int years = days/365;
		int weeks = (days%365)/7;
		days = (days%365)%7;
		
		System.out.println("Year = "+years+" Weeks = "+weeks+" Days = "+days);
		
	}

}
