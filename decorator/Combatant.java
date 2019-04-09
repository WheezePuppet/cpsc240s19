interface Combatant {
    void absorbDamage(int damage);
    boolean isDead();
    boolean attack(Combatant c);
    int strength();
}
