


class Book extends Item {

    private String title;
    private String ISBN;

    Book(String title, String ISBN, double price) {
        this.basePrice = price;
        this.title = title;
        this.ISBN = ISBN;
    }
    
}
