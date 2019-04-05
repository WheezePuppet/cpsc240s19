
class Toy extends Thing {

    private String name;
    private int weightLbs;
    private Thing.GenderStereotype genderStereotype;
    
    public Toy(String name, GenderStereotype gender, int weightLbs) {
        this.name = name;
        this.genderStereotype = gender;
        this.weightLbs = weightLbs;
    }

    public Toy(String name, int weightLbs) {
        this(name, GenderStereotype.EITHER, weightLbs);
    }

    public GenderStereotype getGenderStereotype() {
        return this.genderStereotype;
    }

    public int getWeightLbs() {
        return this.weightLbs;
    }
}
