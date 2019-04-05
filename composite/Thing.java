
abstract class Thing {

    enum GenderStereotype { BOY, GIRL, EITHER, MIXED };

    abstract int getWeightLbs();

    abstract GenderStereotype getGenderStereotype();
}
