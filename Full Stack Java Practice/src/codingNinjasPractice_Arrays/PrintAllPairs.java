package codingNinjasPractice_Arrays;

import java.util.Scanner;

public class PrintAllPairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n=s.nextInt();
        int arr[]= new int[n];

        for(int i=0; i< arr.length; i++){
            System.out.println("Enter Arr["+i+"] = ");
            arr[i]=s.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                System.out.println("( "+arr[i]+","+arr[j]+" )");
            }
        }
    }
}
