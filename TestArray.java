public class TestArray {

    public static void main(String[] args) {

        Vehicle[] vehicleArray = new Vehicle[6];
        vehicleArray[0] = new Car("Polonez", 45, 10, false);
        vehicleArray[1] = new Car("Mini", 50, 7, false);
        vehicleArray[2] = new Car("Garbus", 39, 12, false);
        vehicleArray[3] = new Truck("Dacia", 650, 28, false, 500);
        vehicleArray[4] = new Truck("Dacia2", 800, 36, false, 1000);
        vehicleArray[5] = new Truck("Dacia3", 750, 32, false, 70);

        for (int i = 0; i < vehicleArray.length; i++) {
            vehicleArray[i].showInfo();
            System.out.print("\n");
        }

        System.out.println("Włączona klimatyzacja ***************************************************");

        for (int i = 0; i < vehicleArray.length; i++) {
            Car.airConON();
            vehicleArray[i].showInfo();
            System.out.print("\n");
        }

    }

}


