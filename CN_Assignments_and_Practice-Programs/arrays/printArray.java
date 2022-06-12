package arrays;

import java.util.Scanner;

public class printArray {

    public static void printArray1(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        printArray1(arr);
    }
}
