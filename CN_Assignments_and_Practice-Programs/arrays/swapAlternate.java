package arrays;

import java.util.Scanner;

public class swapAlternate {
    public static void swap(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i += 2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        printArray1(arr);
    }

    public static void printArray1(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        swap(arr);
    }
}
