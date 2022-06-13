package generics;

public class MyGenericUse {
    public static void main(String[] args) {
        MyGeneric<String, Integer> g1= new MyGeneric<>();
        g1.setFirstName("Md Akram");
        g1.setLastname("Khan");
        g1.setAge(22);
        g1.setSalary(1000000);

        System.out.println(g1.getFirstName());
        System.out.println(g1.getLastname());
        System.out.println(g1.getAge());
        System.out.println(g1.getSalary());


    }
}
