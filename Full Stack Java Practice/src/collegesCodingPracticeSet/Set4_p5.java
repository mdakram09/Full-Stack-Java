package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set4_p5 {
    public static void largest(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest element is: "+max);
    }

    public static void smallest(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i: arr){
            if(i<min){
                min=i;
            }
        }
        System.out.println("Smallest element is: "+min);
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner s = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("Enter Arr["+i+"] = ");
            arr[i]=s.nextInt();
        }

        largest(arr);
        smallest(arr);
    }
}
