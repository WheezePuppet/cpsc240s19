

class FixedDiscountPricingStrategy extends DefaultPricingStrategy implements PricingStrategy {

    private double fixedDiscount;

    FixedDiscountPricingStrategy(double d) {
        super();
        this.fixedDiscount = d;
    }

    public double computePrice(ShoppingCart sc) {
        return super.computePrice(sc) * (1 - fixedDiscount);
    }
}
