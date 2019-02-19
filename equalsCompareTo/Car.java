
class Car implements Comparable<Car> {

    String make, model;
    int yearsOld, odo;
    double galsRemaining, sizeOfTank, gasMileage;

    Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.yearsOld = 0;
        this.odo = 0;
        this.galsRemaining = 0;
        this.gasMileage = 25;
        this.sizeOfTank = 18;
    }

    public boolean equals(Car c) {
        if (make.equals(c.make)) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Car c) {
        if (this.make.equals(c.make)) {
            return this.odo - c.odo;
        }
        return this.yearsOld - c.yearsOld;
    }

    void setYearsOld(int yo) {
        this.yearsOld = yo;
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
