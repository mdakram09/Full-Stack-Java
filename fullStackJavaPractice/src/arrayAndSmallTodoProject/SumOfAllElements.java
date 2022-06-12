package arrayAndSmallTodoProject;

import java.util.Scanner;

public class SumOfAllElements {
	
	public static void sumOfAll(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of all elements of the array is "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Please enter "+n+" number of elements one by one");
		for(int i=0;i<n; i++) {
			arr[i]=s.nextInt();
		}
		
		sumOfAll(arr);
		
	}

}
