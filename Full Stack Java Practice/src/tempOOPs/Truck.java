package tempOOPs;
import oops.Vehicle;
public class Truck extends Vehicle {
    public Truck(String name){
        super(name);
    }
    public void printTruck(){
        System.out.println("Truck Color "+color);
        System.out.println("Truck name is  "+getName());
    }
}
