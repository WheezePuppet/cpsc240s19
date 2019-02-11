
class Car {

    // These are inst vars because they're defined in a class, but outside of
    // any method.
    String make, model;
    int yearsOld, odo;
    double galsRemaining, sizeOfTank, gasMileage;
    static int num;

    // Constructor. Since this is the only constructor, it's the only way to
    // instantiate Car objects. (You can't do "new Car()" with no arguments,
    // e.g.)
    Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.yearsOld = 0;
        this.odo = 0;
        this.galsRemaining = 0;
        if (make.equals("Chevy")) {
            gasMileage = 15;
        } else {
            gasMileage = 28;
        }

        if (model.equals("Tank")) {
            sizeOfTank = 1000000;
        } else {
            sizeOfTank = 14;
        }
        num++;
    }

    // Return the total number of Cars that have ever been instantiated. This
    // method is static so it can be called on the Car class instead of on a
    // Car object.
    static int getNum() {
        return num;
    }

    // Accessor method.
    String getMake() {
        return this.make;
    }

    // Accessor method.
    String getModel() {
        return this.model;
    }

    // Accessor method.
    int getYearsOld() {
        return this.yearsOld;
    }

    // Looks like an accessor method, but is not: it performs a computation on
    // the fly, and returns that value.
    double getTankPerc() {
        return this.galsRemaining / this.sizeOfTank * 100;
    }

    // Fill 'er up!
    void fillUp() {
        galsRemaining = sizeOfTank;
    }

    void drive(int numMiles) throws Exception {
        double galsBurned = numMiles / gasMileage;
        if (galsBurned > galsRemaining) {
            throw new Exception("Not enough gas!!");
        }
        galsRemaining = galsRemaining - galsBurned;
        odo += numMiles;
    }


    public String toString() {
        return "a " + this.yearsOld + "-year-old " + this.make + " " + 
            this.model + " with " + odo + " miles on it";
    }


















}
