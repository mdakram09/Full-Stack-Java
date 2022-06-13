package oops;

public class Car extends Vehicle {

    public Car(String name){
        super(name);
    }
    @Override
    public void print() {
        super.print();
        System.out.println("this is car class");
    }
}
