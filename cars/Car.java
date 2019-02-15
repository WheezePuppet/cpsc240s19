
// "Implement" the "Comparable" interface so that we can sort Car objects
// according to our needs. (We'll learn exactly what that means later. For now,
// just accept the following class declaration on faith.)
class Car implements Comparable<Car> {

    // These are inst vars because they're defined in a class, but outside of
    // any method.
    String make, model;
    int yearsOld, odo;
    double galsRemaining, sizeOfTank, gasMileage;
    static int num;

    // Tell Java what it means for one Car to be "before" another in sorted
    // order.
    public int compareTo(Car other) {
        // Sort in increasing order by odometer.
        return this.odo - other.odo;
        
        // Sort in decreasing order by age.
        //return other.yearsOld - this.yearsOld;
        
        // Sort alphabetically by make.
        //return this.make.compareTo(other.make);
       
        // Sort reverse alphabetically by model.
        //return this.model.compareTo(other.model);
    }

    // Tell Java what it means for one Car to be "equal" to another.
    public boolean equals(Car other) {
        // Car objects are only considered "identical" if they have absolutely
        // every inst var the same.
        return this.make.equals(other.make) &&
            this.model.equals(other.model) &&
            this.yearsOld == other.yearsOld &&
            this.odo == other.odo &&
            this.galsRemaining == other.galsRemaining &&
            this.sizeOfTank == other.sizeOfTank &&
            this.gasMileage == other.gasMileage;

        // Car objects are considered "identical" if they have the same make
        // and model.
        //return this.make.equals(other.make) &&
        //    this.model.equals(other.model);

        // All Car objects are considered "identical" just by virtue of being
        // Car objects.
        //return true;
    }

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
