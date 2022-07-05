package codingNinjasPractice_Arrays;

import java.util.Scanner;

public class FindUnique {
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
            int j;
            for(j=0; j<n; j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        break;
                    }
                }
            }
            if(j==n){
                System.out.println("Element "+arr[i]+" is unique");
            }

        }
    }
}
