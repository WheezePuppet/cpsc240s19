
// Some sample "client code" to exercise our Car class and its methods.
class Client {

    public static void main(String args[]) {

        Car lily = new Car("Honda","Fitt");

        System.out.println("There are " + Car.getNum() + " cars so far.");

        lily.fillUp();

        System.out.println("Our tank starts at " + lily.getTankPerc() +
            "% full.");

        try {
            lily.drive(5000000);
        } catch (Exception e) {
            e.printStackTrace();
        } 

        System.out.println("Our tank is now " + lily.getTankPerc() +
            "% full.");


        Car x = new Car("Ferrari","FX-7");
        x.yearsOld = 3;
        System.out.println("x = " + x);
        System.out.println("lily = " + lily);
    }
}
