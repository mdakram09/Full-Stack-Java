package searching_and_sorting;

import java.util.Scanner;

public class BinarySearch {

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
		System.out.println("Enter the element you want to find");
		int x=s.nextInt();
		
		int start=0;
		int end=n-1;
		
		int mid=(start+end)/2;
		
		while(start<=end) {
			if(arr[mid]==x) {
				System.out.println(x+" found at index "+mid);
				break;
			}
			else if(x>arr[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
			mid=(start+end)/2;
		}
	} 

}
