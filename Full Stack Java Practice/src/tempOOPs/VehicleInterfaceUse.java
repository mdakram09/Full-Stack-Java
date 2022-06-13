package tempOOPs;

public class VehicleInterfaceUse {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.run("RUNNING");
        c1.tellNumberOfWheels(4);
        c1.isDiesel(true);
        System.out.println("=============== Ab Cycle ki bari ==================");
        Bycycle b1= new Bycycle();
        b1.isCycle(true);
        b1.manual();;
        b1.run("Yes bro i can run");
        b1.tellNumberOfWheels(4);
        b1.isDiesel(false);
    }
}
