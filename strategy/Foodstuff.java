


class Foodstuff extends Item {

    Foodstuff(double price) {
        this.basePrice = price;
    }

    boolean isPerishable() {
        return true;
    }
}
