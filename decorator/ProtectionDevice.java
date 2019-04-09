abstract class ProtectionDevice implements Combatant {
    public Combatant protectedTarget;
    public boolean isDead() {
        return protectedTarget.isDead();
    }
    public boolean attack(Combatant opponent) {
        return protectedTarget.attack(opponent);
    }
    public int strength() {
        return protectedTarget.strength();
    }
}
