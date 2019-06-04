public class Car extends Vehicle {
    private static boolean airCon;

    public Car(String name, double capacity, double burning100, boolean airCon) {
        super(name, capacity, burning100);
        this.airCon = airCon;
    }

    public boolean isAirCon() {
        return airCon;
    }


    public double totalBurning() {

        if (isHaveIRan()==false){
        double burning = getBurning100();
        if (isAirCon()) {
            burning = getBurning100() + 0.8;
            setBurning100(burning);
        }
        setHaveIRan(true);
        }
        return getBurning100();
    }

    void showInfo() {
        super.showInfo();
        System.out.print(" Klimatyzacja: "+airCon);
    }

    static void airConON() {
        airCon=true;
    }


}
