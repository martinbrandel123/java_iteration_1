package Case.Weapon;
import Case.Items;

public class Weapon extends Items {

    // Constructeur
    public Weapon(String pName, int pAttack){
        super(pName, pAttack);
    }
    public Weapon() {
        super("ARME DE BASE", 1);
    }
}
