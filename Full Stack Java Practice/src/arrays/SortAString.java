package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortAString {
    public static void sortString(String str){
        char[] temp=str.toCharArray();
        Arrays.sort(temp);
        System.out.println("Sorted String is: "+new String(temp));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=s.nextLine();
        sortString(str);
    }
}
