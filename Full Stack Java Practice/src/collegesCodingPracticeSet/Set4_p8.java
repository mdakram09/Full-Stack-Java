package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set4_p8 {
    public static void search(int[] arr,int key){
        for(int i=0; i< arr.length; i++){
            if(arr[i]==key){
                System.out.println(key+" is present at index "+i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner s = new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.println("Enter Arr["+i+"] = ");
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the key you want to find: ");
        int key=s.nextInt();
        search(arr,key);
    }
}
