package oops;

public class Vehicle {
    public Vehicle(String name) {
        this.name = name;
    }

    private int numOfWheels;
    private boolean isElectric;
    private String name;
    private boolean isDiesel;
    protected String color;

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDiesel() {
        return isDiesel;
    }

    public void setDiesel(boolean diesel) {
        isDiesel = diesel;
    }

    public void print(){
        System.out.println("Vehicle number of wheels "+numOfWheels);
        System.out.println("Vehicle is electric "+isElectric);
        System.out.println("Vehicle name is "+name);
        System.out.println("Vehicle has Diesel engine "+isDiesel);
    }
}
