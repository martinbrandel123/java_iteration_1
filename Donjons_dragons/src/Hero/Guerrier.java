package Hero;
import Hero.Weapon.Weapon;

public class Guerrier extends Personnage{
    // Attributs
    private Weapon weapon;

    public Guerrier(String pClasse, String pName, int pLife, int pAttack, Weapon pWeapon) {
        super(pClasse, pName, pLife, pAttack);
        this.weapon = pWeapon;
    }
    public Guerrier(String pClasse, String pName) {
        super(pClasse, pName);
    }


//Constructeur

    // Accesseurs / Mutateurs


    //to string
    public String toString() {
        return super.toString() + "\n=>" +  this.weapon;
    }
}
