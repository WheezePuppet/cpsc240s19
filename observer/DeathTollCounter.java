
public class DeathTollCounter implements CombatantObserver {

    private static DeathTollCounter theInstance;

    private int numDead;

    public static synchronized DeathTollCounter instance() {
        if (theInstance == null) {
            theInstance = new DeathTollCounter();
        }
        return theInstance;
    }
    
    private DeathTollCounter() { 
        this.numDead = 0;
    }

    public void update(Combatant c) {
        if (c.isDead()) {
            this.numDead++;
            System.out.print("GONG: Another soul has been claimed! ");
            System.out.println("(That's " + this.numDead + " so far.)");
        }
    }
}
