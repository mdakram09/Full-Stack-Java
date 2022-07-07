package DSA_Code_References;

import java.util.Arrays;
public class DeleteLastElementOfAnArray {
    public static int[] removeLastElement(int[] arr) {

        return Arrays.copyOf(arr, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 7, 6, 8};

        arr = removeLastElement(arr);
        System.out.println(Arrays.toString(arr));
    }
}
