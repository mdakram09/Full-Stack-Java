import java.util.Scanner;

public class reverseEachWordInAString {
    public static void reverse(String[] str) {
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str[] = s.nextLine().split(" ");

        reverse(str);
    }
}
