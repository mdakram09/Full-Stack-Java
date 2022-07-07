package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PopOperationInAnArray {
    public static int[] pop(int[] arr){
        int[] newArr= Arrays.copyOf(arr,arr.length-1);
        return newArr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n= s.nextInt();
        System.out.println("Enter "+n+" elements: ");
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=s.nextInt();
        }
        int[] newArr=pop(arr);
        System.out.println("Array before popping: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nArray before popping: ");
        for(int i=0; i< newArr.length; i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
