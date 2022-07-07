package arrays;

import java.util.Scanner;

public class DeletionInAnArray {
    public static int[] deletion(int[] arr,int n,int pos){
        int[] newArr=new int[n-1];
        for(int i=0; i<n; i++){
            if(i<pos){
                newArr[i]=arr[i];
            }
            else if(i==pos){
                continue;
            }
            else{
                newArr[i-1]=arr[i];
            }
        }
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

        System.out.println("Enter the index where you want to delete the element: ");
        int pos=s.nextInt();
        int[] newArr=deletion(arr,n,pos);
        System.out.println("Array before deletion: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nArray after deletion: ");
        for(int i=0; i< newArr.length; i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
