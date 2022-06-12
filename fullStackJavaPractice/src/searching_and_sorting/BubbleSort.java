package searching_and_sorting;

import java.util.Scanner;

public class BubbleSort {
	public static void printArray(int[] arr) {
		System.out.println("Sorted Array");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void bubbleSort(int[] arr) {
		int n=arr.length;
		for(int i=0; i<n;i++) {
			for(int j=0; j<n-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter "+n+" number of elements one by one ");
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		
		bubbleSort(arr);
		printArray(arr);
	}

}
