package DSA_Code_References;

import java.util.Arrays;
public class InsertANewElementAtLastOfAnArray {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6};
        int element = 8;

        int newArr[] = Arrays.copyOf(arr, arr.length + 1);
        newArr[arr.length] = element;

        System.out.println("Original  : " + Arrays.toString(arr));
        System.out.println("New Array : " + Arrays.toString(newArr));
    }
}
