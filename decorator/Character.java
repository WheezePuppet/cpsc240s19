abstract class Character implements Combatant {
    public int hitPoints;
    public void absorbDamage(int damage) {
        hitPoints -= damage;
    }
    public boolean isDead() {
        if (hitPoints < 0)
        return true;
    return false;
    }
    abstract public int strength();
    public boolean attack(Combatant opponent) {
        if (strength() > opponent.strength() / 2) {
            opponent.absorbDamage(strength());
        }
        return opponent.isDead();
    }
}
