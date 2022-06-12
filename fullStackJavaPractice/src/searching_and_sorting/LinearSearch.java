package searching_and_sorting;

import java.util.Scanner;

public class LinearSearch {
	
	public static void linearSearch(int[] arr,int x) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==x) {
				System.out.println("Element "+x+" is found at index "+i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size");
		int n=s.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter "+n+" elements one by one");
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		
		System.out.println("Enter the element you want to find");
		int x=s.nextInt();
		
		linearSearch(arr,x);
	}

}
