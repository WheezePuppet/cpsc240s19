


import java.util.ArrayList;

class Main {

    private static ArrayList<ShoppingCart> carts = 
        new ArrayList<ShoppingCart>();

    public static void main(String args[]) {

        Book harryPotter = new Book("Harry Potter", "ABC123", 9.99);
        Book gameOfThrones = new Book("A Game of Thrones", "XYZ567", 12.99);
        Book hungerGames = new Book("Hunger Games", "DEF790", 8.99);

        Foodstuff carrots = new Foodstuff(0.56);
        Foodstuff okra = new Foodstuff(0.78);
        Foodstuff kCups = new Foodstuff(29.99);

        User offset = new User("Offset");
        User cardiB = new User("Cardi B", true);

        ShoppingCart cardisCart = new ShoppingCart(cardiB);
        ShoppingCart cardisOtherCart = new ShoppingCart(cardiB);
        ShoppingCart offsetsCart = new ShoppingCart(offset);
        carts.add(offsetsCart);
        carts.add(cardisCart);
        carts.add(cardisOtherCart);

        cardisCart.add(gameOfThrones,1);
        cardisCart.add(hungerGames,3);
        cardisOtherCart.add(carrots,20);
        cardisOtherCart.add(okra,5);
        cardisOtherCart.add(okra,5);
        cardisOtherCart.add(kCups);
        offsetsCart.add(gameOfThrones);
        offsetsCart.add(harryPotter);
        offsetsCart.add(hungerGames);

        printCarts();
        enableHolidayDiscounts();
        System.out.println("The holiday season is here!");
        printCarts();
    }

    private static void printCarts() {
        for (ShoppingCart cart : carts) {
            System.out.println(cart);
        }
    }

    private static void enableHolidayDiscounts() {
        for (ShoppingCart cart : carts) {
            cart.setPricingStrategy(
                new DiscountPerishablePricingStrategy(.5));
        }
    }
}
