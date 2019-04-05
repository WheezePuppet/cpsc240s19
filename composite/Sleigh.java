
import java.util.ArrayList;

public class Sleigh {

    public static final int MAX_LOAD = 100;

    private ArrayList<Bag> bags;
    
    Sleigh() {
        bags = new ArrayList<Bag>();
    }

    public boolean tooHeavy() {
        int weightLbs = 0;
        for (Bag bag : bags) {
            weightLbs += bag.getWeightLbs();
        }
System.out.println("weightLbs = " + weightLbs);
        return (weightLbs > MAX_LOAD);
    }

    private void pack() {
        Bag red = new Bag("red");
        Bag green = new Bag("green");
        Bag beige = new Bag("beige");
        Bag canvas = new Bag("canvas");
        Bag brown = new Bag("brown");
        Bag khaki = new Bag("khaki");
        Bag blue = new Bag("blue");
        Bag plaid = new Bag("plaid");

        Toy truck = new Toy("Truck", Toy.GenderStereotype.BOY, 4);
        Toy barbie = new Toy("Barbie", Toy.GenderStereotype.GIRL, 2);
        Toy artSet = new Toy("Art Set", Toy.GenderStereotype.EITHER, 10);
        Toy soccerBall = new Toy("Soccer Ball", 2);
        Toy tiara = new Toy("Tiara", Toy.GenderStereotype.GIRL, 3);
        Toy spaceAlien = new Toy("Space Alien", Toy.GenderStereotype.BOY, 8);

        beige.stuffWith(truck);
        plaid.stuffWith(truck);
        red.stuffWith(truck);
        red.stuffWith(barbie);
        red.stuffWith(truck);
        green.stuffWith(spaceAlien);
        green.stuffWith(red);
        for (int i=0; i<12; i++) {
            canvas.stuffWith(soccerBall);
        }
        plaid.stuffWith(canvas);
        for (int i=0; i<3; i++) {
            beige.stuffWith(spaceAlien);
            beige.stuffWith(truck);
        }
        khaki.stuffWith(tiara);
        khaki.stuffWith(barbie);
        khaki.stuffWith(tiara);
        khaki.stuffWith(blue);
        blue.stuffWith(barbie);
        green.stuffWith(beige);

        load(green);
        load(khaki);
        load(brown);
        load(plaid);
    }

    void load(Bag b) {
        bags.add(b);
    }

    public static void main(String args[]) {
        Sleigh santasFerrari = new Sleigh();
        System.out.println("It's Christmas Eve!");
        santasFerrari.pack();

        for (Bag bag : santasFerrari.bags) {
            System.out.println(bag);
        }

        if (santasFerrari.tooHeavy()) {
            System.out.println("Yikes -- need more reindeer!");
        } else {
            System.out.println("Now dash away! dash away! dash away all!");
        }
    }
}
