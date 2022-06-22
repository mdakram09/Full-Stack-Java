package collegesCodingPracticeSet;

import java.util.Scanner;

public class Set2_p4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the character:");
        char c = s.next().charAt(0);
        if(c>='A' && c<='Z'){
            System.out.println("Capital letter");
        }
        else if(c>='a' && c<='z'){
            System.out.println("Small letter");
        }
        else if(c>='0' && c<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Symbol");
        }
    }
}
