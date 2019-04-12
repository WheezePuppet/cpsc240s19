


class User {

    private String name;
    private boolean isPrime;

    User(String name) {
        this(name, false);
    }

    User(String name, boolean isPrime) {
        this.name = name;
        this.isPrime = isPrime;
    }

    public String getName() { return name; }

    boolean isPrimeUser() { return isPrime; }
}
