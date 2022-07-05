package codingNinjasPractice_Arrays;

import java.util.Scanner;

public class SortZeroesAndOnes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n=s.nextInt();
        int arr[]= new int[n];

        System.out.println("Enter "+n+" elements one by one");
        for(int i=0; i< arr.length; i++){
            arr[i]=s.nextInt();
        }
        int z=0;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                z=z+1;
            }
        }
        for(int i=0; i<z; i++){
            arr[i]=0;
        }
        for(int i=z; i<n; i++){
            arr[i]=1;
        }
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
