package Hero;
import Case.Weapon;

public class Guerrier extends Personnage{
    // Attributs
    private Weapon weapon;

    public Guerrier(String pClasse, String pName, int pLife, int pAttack) {
        super(pClasse, pName,10, 10);
        this.weapon = new Weapon();
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
