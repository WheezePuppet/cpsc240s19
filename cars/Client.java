
// Some sample "client code" to exercise our Car class and its methods.
class Client {

    public static void main(String args[]) {

        Car lily = new Car("Honda","Fitt");

        System.out.println("There are " + Car.getNum() + " cars so far.");

        lily.fillUp();

        System.out.println("Our tank starts at " + lily.getTankPerc() +
            "% full.");

        lily.drive(50);

        System.out.println("Our tank is now " + lily.getTankPerc() +
            "% full.");
    }
}
