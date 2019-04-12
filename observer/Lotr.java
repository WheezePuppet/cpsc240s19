
public class Lotr {

  public static void main(String args[]) {

    Combatant orc1 = new Orc();
    Combatant orc2 = new Armor(new Orc());
    Combatant zombie1 = new Zombie();
    Combatant wormtongue = new MagicUser();
    Combatant saruman = new FireShield(new MagicUser(),8);

    Combatant aragorn = new Fighter();
    Combatant gimli = new Armor(new Armor(new Armor(new Fighter())));
    Combatant gandalf = new FireShield(new Armor(new MagicUser()),4);

    if (gandalf.attack(orc1)) {
        System.out.println("Orc #1 dead after one attack.");
    }
    if (gandalf.attack(orc2)) {
        System.out.println("Orc #2 dead after one attack.");
    }
    if (gandalf.attack(orc1)) {
        System.out.println("Orc #1 dead after two attacks.");
    }
    if (gandalf.attack(orc2)) {
        System.out.println("Orc #2 dead after two attacks.");
    }

    for (int i=0; i<4; i++) {
        saruman.attack(aragorn);
        if (aragorn.isDead()) {
            System.out.println("Alas, Aragorn hath been slain!");
        }
    }

    for (int i=0; i<4; i++) {
        aragorn.attack(saruman);
        if (saruman.isDead()) {
            System.out.println("Huzzah, Saruman hath been slain!");
        }
    }

    for (int i=0; i<1000; i++) {
        wormtongue.attack(gimli);
    }
    if (!gimli.isDead()) {
        System.out.println("Gimli appears impervious to attack.");
    }

    gandalf.attack(zombie1);
    if (zombie1.isDead()) {
      System.out.println("The zombie is dead!");
    }
  }
}
