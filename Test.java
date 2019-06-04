public class Test {

    public static void main(String[] args) {
        Car car1 = new Car("Polonez", 45, 10, false);
        Car car2 = new Car("Mini", 50, 7, true);

        System.out.println(car1.carRange());
        System.out.println(car2.carRange());

    }
}
