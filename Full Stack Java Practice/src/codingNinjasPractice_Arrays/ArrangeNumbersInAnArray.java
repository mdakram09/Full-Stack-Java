package codingNinjasPractice_Arrays;

import java.util.Scanner;

public class ArrangeNumbersInAnArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n=s.nextInt();
        int arr[]= new int[n];

        int i=0, j=n-1, val=1;
        while(i<j){
            arr[i]=val;
            i++;
            val++;
            arr[j]=val;
            j--;
            val++;
        }
        if(i==j){
            arr[i]=val;
        }

        for(int k=0; k<n; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
