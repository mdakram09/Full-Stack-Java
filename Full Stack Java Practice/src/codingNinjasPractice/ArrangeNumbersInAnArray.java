package codingNinjasPractice;

import java.util.Scanner;

public class ArrangeNumbersInAnArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n=s.nextInt();
        int arr[]= new int[n];
        int val=1;
        int i=0, j=n-1;
        while(i<j){
            arr[i]=val;
            val++;
            i++;
            arr[j]=val;
            val++;
            j--;
        }
        if(i==j){
            arr[i]=val;
        }
        for(int k=0; k<n; k++){
            System.out.println(arr[k]+" ");
        }
    }
}
