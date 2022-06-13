package oops;

import tempOOPs.Truck;

public class VehicleUse {
    public static void main(String[] args) {
        Car c1 = new Car("tata car");
        c1.setNumOfWheels(4);
        c1.setElectric(true);
        c1.setName("Thar");
        c1.setDiesel(true);
        c1.print();

        Truck t1=new Truck("Tata Truck");
        t1.color="red";
        t1.printTruck();
    }
}
