import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String temp = str;
        String revStr = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            revStr = ch + revStr;
        }
        System.out.println(revStr);
        if (temp.equals(revStr)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
