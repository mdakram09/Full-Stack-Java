package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PushOperationInAnArray {
    public static int[] push(int[] arr,int x){
        int n= arr.length+1;
        int[] newArr= Arrays.copyOf(arr, n);
        newArr[n-1]=x;
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
        System.out.println("Enter the element you want to Push: ");
        int x=s.nextInt();

        System.out.println("Array before pushing: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nArray after pushing: ");
        int[] newArr=push(arr,x);
        for(int i=0; i<newArr.length; i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
