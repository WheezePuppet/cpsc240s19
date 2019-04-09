
class FireShield extends ProtectionDevice {
    public int myFireIntensity;
    public FireShield(Combatant ct, int fireIntensity) {
        protectedTarget = ct;
        myFireIntensity = fireIntensity;
    }
    public void absorbDamage(int damage) {
        protectedTarget.absorbDamage(damage / myFireIntensity);
    }
    public int strength() {
        return protectedTarget.strength() / 4;
    }
}

