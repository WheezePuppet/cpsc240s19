class Zombie extends NonPlayerCharacter {
    public Zombie() {
        hitPoints = 10;
    }
    public int strength() {
        return 10;
    }
    public boolean isDead() {
        return true;
    }
}
