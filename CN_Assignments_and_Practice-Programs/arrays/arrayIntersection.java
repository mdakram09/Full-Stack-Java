package arrays;

import java.util.Scanner;

public class arrayIntersection {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("for array 1");
        int n1 = s.nextInt();
        int arr1[] = new int[10];
        for (int i = 0; i < n1; i++) {
            arr1[i] = s.nextInt();
        }
        System.out.println("for array 2");
        int n2 = s.nextInt();
        int arr2[] = new int[10];
        for (int i = 0; i < n2; i++) {
            arr2[i] = s.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Element :" + arr1[i]);
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
}
