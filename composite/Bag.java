
import java.util.ArrayList;

class Bag extends Thing {

    private String color;
    private ArrayList<Thing> things;

    public Bag(String color) {
        this.color = color;
        things = new ArrayList<Thing>();
    }

    public int getWeightLbs() {
        int total = 1;
        for (Thing thing : things) {
            total += thing.getWeightLbs();
        }
        return total;
    }

    public GenderStereotype getGenderStereotype() {
        if (things.size() == 0) {
            return GenderStereotype.EITHER;
        }
        boolean boiToi = false;
        boolean girlToy = false;
        boolean eitherToy = false;
        for (Thing thing : things) {
            switch (thing.getGenderStereotype()) {
            case BOY:
                boiToi = true;
                break;
            case GIRL:
                girlToy = true;
                break;
            case EITHER:
                eitherToy = true;
                break;
            case MIXED:
                return GenderStereotype.MIXED;
            }
        }
        if (eitherToy) {
            return GenderStereotype.EITHER;
        }
        if (boiToi && girlToy) {
            return GenderStereotype.MIXED;
        }
        if (boiToi) {
            return GenderStereotype.BOY;
        }
        return GenderStereotype.GIRL;
    }

    public void stuffWith(Thing x) {
        things.add(x);
    }

    public String toString() {
        String preamble = "A " + things.size() + "-item " + color + " bag";
        if (getGenderStereotype() == GenderStereotype.BOY) {
            return preamble + " for boys!";
        }
        if (getGenderStereotype() == GenderStereotype.GIRL) {
            return preamble + " for girls!";
        }
        return preamble + " for boys and girls!";
    }
}
