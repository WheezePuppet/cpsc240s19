


import java.util.ArrayList;

class DiscountPerishablePricingStrategy implements PricingStrategy {

    private double perishableDiscount;

    DiscountPerishablePricingStrategy(double d) {
        this.perishableDiscount = d;
    }

    public double computePrice(ShoppingCart sc) {
        double price = 0.0;
        for (Item item : sc.getContents()) {
            if (item.isPerishable()) {
                price += (1 - perishableDiscount) * item.getPrice();
            } else {
                price += item.getPrice();
            }
        }
        return price;        
    }
}
