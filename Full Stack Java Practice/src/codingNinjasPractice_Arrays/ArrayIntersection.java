package codingNinjasPractice_Arrays;

import java.util.Scanner;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the first Array: ");
        int n1=s.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter "+n1+" elements one by one for first Array");
        for(int i=0; i< arr1.length; i++){
            arr1[i]=s.nextInt();
        }
        System.out.println("Enter the size of the second Array: ");
        int n2=s.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter "+n2+" elements one by one for second Array");
        for(int i=0; i< arr2.length; i++){
            arr2[i]=s.nextInt();
        }

        for(int i=0; i<n1; i++){
            for(int j=0; j<n2; j++){
                if(arr1[i]==arr2[j]){
                    System.out.println("Element: "+arr1[i]);
                }
            }
        }
    }
}
