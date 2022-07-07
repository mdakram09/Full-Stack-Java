package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortFunctionInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n= s.nextInt();
        System.out.println("Enter "+n+" elements: ");
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Sorted Array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
