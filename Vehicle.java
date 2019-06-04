public class Vehicle {
    private String name;
    private double capacity;
    private double burning100;

    public Vehicle(String name, double capacity, double burning100) {
        this.name = name;
        this.capacity = capacity;
        this.burning100 = burning100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getBurning100() {
        return burning100;
    }

    public double totalBurning() {
        return getBurning100();
    }

    public void setBurning100(double burning100) {
        this.burning100 = burning100;
    }

    double carRange (){
        return (getCapacity()*100)/getBurning100();
    }

    void showInfo() {
        System.out.printf("Nazwa: %S, pojemność %.1f l, spalenie %.1f l/100km, zasięg %.1f km", getName(), getCapacity(), totalBurning(), carRange());
    }

}
