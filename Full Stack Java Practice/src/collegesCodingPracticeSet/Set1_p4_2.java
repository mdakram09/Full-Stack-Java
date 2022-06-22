package collegesCodingPracticeSet;

public class Set1_p4_2 {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        System.out.println("Value of a before: "+a+", and value of b before: "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Value of a after: "+a+", and value of b after: "+b);
    }
}
