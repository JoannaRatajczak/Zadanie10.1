public class Truck extends Car {
    private double weight;

    public Truck(String name, double capacity, double burning100, boolean airCon, double weight) {
        super(name, capacity, burning100, airCon);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public double totalBurning() {
        double burning = getBurning100();
        if (weight > 0) {
            burning = getBurning100() + 0.5 * (weight / 100);
            setBurning100(burning);
        }
        boolean isAC = this.isAirCon();
        if (isAC) {
            burning = getBurning100() + 1.6;
            setBurning100(burning);
        }

        return burning;
    }

    void showInfo() {
        super.showInfo();
        System.out.print(" Waga towarów: " + getWeight() + " kg ");
    }


}