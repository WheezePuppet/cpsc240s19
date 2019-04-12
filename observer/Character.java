import java.util.ArrayList;

abstract class Character implements Combatant {
    protected Character() {
        myObservers = new ArrayList<CombatantObserver>();

        this.register(DeathTollCounter.instance());
    }
    public int hitPoints;
    public void absorbDamage(int damage) {
        hitPoints -= damage;
        notifyObs();
        if (this.isDead()) {
            myObservers.clear();
        }
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

    private ArrayList<CombatantObserver> myObservers;

    public void register(CombatantObserver c) {
        myObservers.add(c);
    }
    public void unregister(CombatantObserver c) {
        myObservers.remove(c);
    }
    protected void notifyObs() {
        for (CombatantObserver o: myObservers) {
            o.update(this);
        }
    }
}
