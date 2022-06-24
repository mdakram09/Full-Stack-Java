package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set4_p6 {
    public static void totalEven(int[] arr){
        int count=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println("Total number of Even elements in the array is "+count);
    }

    public static void totalOdd(int[] arr){
        int count=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        System.out.println("Total number of Odd elements in the array is "+count);

    }

    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner s = new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.println("Enter Arr["+i+"] = ");
            arr[i]=s.nextInt();
        }

        totalEven(arr);
        totalOdd(arr);
    }
}
