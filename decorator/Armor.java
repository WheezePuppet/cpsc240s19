class Armor extends ProtectionDevice {
    public Armor(Combatant ct) {
        protectedTarget = ct;
    }
    public void absorbDamage(int damage) {
        if (damage > 5) {
            protectedTarget.absorbDamage(damage);
        }
    }
}
