


class DefaultPricingStrategy implements PricingStrategy {

    protected DefaultPricingStrategy() { }

    public double computePrice(ShoppingCart sc) {
        double price = 0.0;
        for (Item item : sc.getContents()) {
            price += item.getPrice();
        }
        return price;
    }
}
