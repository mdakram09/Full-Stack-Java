package tempOOPs;

public class Car implements VehicleInterface {
    private String name;
    private boolean roof;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRoof() {
        return roof;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void run(String run){
        System.out.println("I AM "+run);
    }

    @Override
    public void tellNumberOfWheels(int wheel) {
        System.out.println("I HAVE "+wheel+" WHEELS");
    }

    @Override
    public void isDiesel(boolean isDiesel) {
        System.out.println("IT IS "+isDiesel+" THAT I RUN ON DIESEL");
    }
}
