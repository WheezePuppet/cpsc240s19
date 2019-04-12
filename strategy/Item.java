
abstract class Item {

    protected double basePrice;

    double getPrice() {
        return basePrice;
    }

    boolean isPerishable() {
        return false;
    }
}
