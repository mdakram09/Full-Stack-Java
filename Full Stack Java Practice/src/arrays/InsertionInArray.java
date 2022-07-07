package arrays;

import java.util.Scanner;

public class InsertionInArray {
    public static int[] insertion(int[] arr,int n, int x, int pos){
        int[] newArr=new int[n+1];
        for(int i=0; i<n+1; i++){
            if(i<pos){
                newArr[i]=arr[i];
            } else if (i==pos) {
                newArr[i]=x;
            }
            else{
                newArr[i]=arr[i-1];
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
        System.out.println("Enter the Element you want to insert: ");
        int x=s.nextInt();
        System.out.println("Enter the index where you want to insert the element: ");
        int pos=s.nextInt();
        int[] newArr=insertion(arr,n,x,pos);
        System.out.println("Array before insertion: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nArray after insertion: ");
        for(int i=0; i< newArr.length; i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
