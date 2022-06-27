package codingNinjasPractice;

import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n=s.nextInt();
        int arr[]= new int[n];

        System.out.println("Enter "+n+" elements one by one");
        for(int i=0; i< arr.length; i++){
            arr[i]=s.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        System.out.println("Element "+arr[i]+" is duplicate");
                        break;
                    }
                }
            }
        }
    }
}
