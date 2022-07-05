package codingNinjasPractice_Arrays;

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n=s.nextInt();
        int arr[]= new int[n];

        System.out.println("Enter "+n+" elements one by one");
        for(int i=0; i< arr.length; i++){
            arr[i]=s.nextInt();
        }

        System.out.println("Please enter the sum you want: ");
        int sum=s.nextInt();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("( "+arr[i]+" , "+arr[j]+" )");
                }
            }
        }
    }
}
