
import java.util.ArrayList;

// Some sample "client code" to test equality and sorting of Cars.
class Client {

    public static void main(String args[]) {

        Car stephen = new Car("Chevy","Malibu");
        Car rae = new Car("Toyota","Sienna");
        Car jeff = new Car("Mazda","RX-7");
        Car tj = stephen;
        Car bob = new Car("Chevy","Malibu");
        bob.yearsOld = 47;
        stephen.yearsOld = 14;
        
        stephen.fillUp();
        rae.fillUp();
        jeff.fillUp();
        bob.fillUp();
        tj.fillUp();

        try {
            stephen.drive(10);
            rae.drive(40);
            jeff.drive(100);
            jeff.drive(100);
            bob.drive(1);
            tj.drive(15);
        } catch (Exception e) {
            System.out.println("Not enough gas!!");
            return;
        }


        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(stephen);
        cars.add(rae);
        cars.add(jeff);
        cars.add(tj);
        cars.add(bob);

        java.util.Collections.sort(cars);

        for (Car c: cars) {
            System.out.println(c);
        }

        if (stephen == rae) {
            System.out.println("a");
        }
        if (stephen == jeff) {
            System.out.println("b");
        }
        if (stephen == tj) {
            System.out.println("c");
        }
        if (tj == bob) {
            System.out.println("d");
        }
        if (tj == rae) {
            System.out.println("e");
        }
        if (stephen == rae) {
            System.out.println("f");
        }
        if (stephen.equals(rae)) {
            System.out.println("g");
        }
        if (stephen.equals(tj)) {
            System.out.println("h");
        }
        if (stephen.equals(bob)) {
            System.out.println("i");
        }
    }

}
