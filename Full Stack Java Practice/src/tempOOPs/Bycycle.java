package tempOOPs;

public class Bycycle implements VehicleInterface, Cycle {
    @Override
    public void isCycle(boolean cycle) {
        System.out.println("It is "+cycle+" that i am a cycle");
    }

    @Override
    public void manual() {
        System.out.println("Khud se chalana padta hai ");
    }

    @Override
    public void run(String run) {
        System.out.println(run);
    }

    @Override
    public void tellNumberOfWheels(int wheel) {
        System.out.println("Apun ke pass "+wheel+" wheels hai");
    }

    @Override
    public void isDiesel(boolean isDiesel) {
        System.out.println("it is "+isDiesel+" that i can run on diesel");
    }
}
