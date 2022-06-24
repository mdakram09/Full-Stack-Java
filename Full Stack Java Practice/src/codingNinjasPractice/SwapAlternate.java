package codingNinjasPractice;

import java.util.Scanner;

public class SwapAlternate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n=s.nextInt();
        int arr[]= new int[n];

        for(int i=0; i< arr.length; i++){
            System.out.println("Enter Arr["+i+"] = ");
            arr[i]=s.nextInt();
        }

        for(int i=0; i<n; i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }

        for(int k=0; k<n; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
