package collegesCodingPracticeSet;

public class Set1_p4_1 {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        System.out.println("Value of a before: "+a+", and value of b before: "+b);

        int temp=b;
        b=a;
        a=temp;

        System.out.println("Value of a after: "+a+", and value of b after: "+b);

    }
}
