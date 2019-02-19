
import java.util.ArrayList;

class Client {

    public static void main(String args[]) {

        Car thomas = new Car("Chevy","Camaro");
        thomas.setYearsOld(5);
        Car jeff = new Car("Mazda","RX-7");
        jeff.setYearsOld(7);
        Car jerry = new Car("Mazda","Miata");
        jerry.setYearsOld(9);
        Car stan = thomas;
        stan.setYearsOld(2);
        Car bob = stan;
        bob.setYearsOld(1);
        thomas = new Car("Porsche","550");

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(thomas);
        cars.add(jeff);
        cars.add(jerry);
        cars.add(stan);
        cars.add(bob);

        thomas.fillUp();
        jeff.fillUp();
        jerry.fillUp();
        stan.fillUp();
        bob.fillUp();

        try {
            jeff.drive(50);
            stan.drive(40);
            bob.drive(30);
        } catch (Exception e) {
        }

        try {
            thomas.drive(80);
            jeff.drive(50000000);
            bob.drive(100);
        } catch (Exception e) {
        }

        java.util.Collections.sort(cars);
        for (Car c: cars) {
            System.out.println(c);
        }

        if (thomas == stan) {
            System.out.println("Thomas == Stan!");
        }

        if (jeff == jerry) {
            System.out.println("Jeff == Jerry!");
        }

        if (jeff.equals(jerry)) {
            System.out.println("Jeff .equals Jerry!");
        }
    }
}
