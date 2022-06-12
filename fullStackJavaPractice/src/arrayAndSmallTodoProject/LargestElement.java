package arrayAndSmallTodoProject;

import java.util.Scanner;

public class LargestElement {
	
	public static void largestElement(int arr[]) {
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Largest element is "+max);
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
		
		largestElement(arr);
	}

}
