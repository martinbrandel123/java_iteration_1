package Hero;
import Case.Weapon.Massues;

public class Guerrier extends Personnage{
    // Attributs
    private Massues weapon;

    public Guerrier(String pClasse, String pName, int pLife, int pAttack) {
        super(pClasse, pName,10, 10);
        this.weapon = new Massues();
    }
    public Guerrier(String pClasse, String pName) {
        super(pClasse, pName);
    }


//Constructeur




    // Accesseurs / Mutateurs
    public void setWeapon (){

    }

    //to string
    public String toString() {
        return super.toString() + "\n=>" +  this.weapon;
    }
}
