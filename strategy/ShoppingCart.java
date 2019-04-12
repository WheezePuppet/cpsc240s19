


import java.util.ArrayList;

class ShoppingCart {

    private ArrayList<Item> contents;
    private User owner;
    private PricingStrategy strat;

    ShoppingCart(User owner) {
        this.owner = owner;
        if (!owner.isPrimeUser()) {
            strat = new DefaultPricingStrategy();
        } else {
            strat = new FixedDiscountPricingStrategy(.2);
        }
        contents = new ArrayList<Item>();
    }

    double getPrice() {
        return strat.computePrice(this); 
    }

    void add(Item item, int quantity) {
        for (int i=0; i<quantity; i++) {
            contents.add(item);
        }
    }

    void add(Item item) {
        add(item,1);
    }

    void setPricingStrategy(PricingStrategy newStrategy) {
        strat = newStrategy;
    }

    public String toString() {
        return "A " + contents.size() + "-item, $" + getPrice() +
            " cart owned by " + owner.getName();
    }

    ArrayList<Item> getContents() {
        return contents;
    }
}
