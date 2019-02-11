
class Ball {
    private String color;
    private int airPressure;

    Ball(String color) {
        this.color = color;
        airPressure = 0;
    }

    public boolean equals(Ball other) {
        if (this.color.equals(other.color) &&
            this.airPressure == other.airPressure) {
            return true;
        }
        return false;
    }

    void bounce() {
        System.out.println("Boing!!");
    }

    public String toString() {
        return "a " + this.color + " ball with " + airPressure +
            " pounds of pressure.";
    }

    static Ball play(int numBalls) {
        ArrayList equipment = new ArrayList();
        Ball b;
        int i;
        for (i=0; i<numBalls; i++) {
            b = new Ball("red");
            b.bounce();
            equipment.add(b);
        }
        Ball basket = new Ball("orange");
        return basket;
    }

    public static void main(String args[]) {
        int x = 3;
        Ball myBall = play(2);
        System.out.println("The ball is: " + myBall);

        Ball otherBall = new Ball("orange");
        if (myBall == otherBall) {
            System.out.println("The two balls are the SAME.");
        } else{
            System.out.println("The two balls are NOT the SAME.");
        }
        if (myBall.equals(otherBall)) {
            System.out.println("The two balls are IDENTICAL.");
        } else{
            System.out.println("The two balls are NOT IDENTICAL.");
        }

    }
}
